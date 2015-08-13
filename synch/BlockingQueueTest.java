package synch;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class BlockingQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter base directory (e.g. /usr/local/jdk1.6.0/src):");
		String directory=in.nextLine();
		System.out.print("Enter keyword (e.g. volatile):");
		String keyword=in.nextLine();
		
		final int FILE_QUEUE_SIZE=10;
		final int SEARCH_THREADS=100;
		
		BlockingQueue<File> queue=new ArrayBlockingQueue<>(FILE_QUEUE_SIZE);
		
		FileEnumerationTask enumerator=new FileEnumerationTask(queue,new File(directory));
		new Thread(enumerator).start();
		for(int i=0;i<SEARCH_THREADS;i++){
			new Thread(new SearchTask(queue,keyword)).start();
		}
	}

}

class FileEnumerationTask implements Runnable{

	public static File DUMY=new File("");
	private BlockingQueue<File> queue;
	private File startDirectory;
	
	public FileEnumerationTask(BlockingQueue<File> queue,File startingDirectory){
		
		this.queue=queue;
		this.startDirectory=startingDirectory;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			enumerate(startDirectory);
			queue.put(DUMY);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		
		
	}
	
	public void enumerate(File directory)throws InterruptedException{
		
		File[] files=directory.listFiles();
		for(File file:files){
			
			if(file.isDirectory())
				enumerate(file);
			else
				queue.put(file);
		}
	}
}

class SearchTask implements Runnable{
	
	private BlockingQueue<File> queue;
	private String keyword;
	
	public SearchTask(BlockingQueue<File> queue,String keyword){
		
		this.queue=queue;
		this.keyword=keyword;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			boolean done=false;
			while(!done){
				
				File file=queue.take();
				if(file==FileEnumerationTask.DUMY){
					
					queue.put(file);
					done=true;
				}
				else
					search(file);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void search(File file)throws IOException{
		
		try(Scanner in=new Scanner(file)){
			
			int lineNumber=0;
			while(in.hasNext()){
				lineNumber++;
				String line=in.nextLine();
				if(line.contains(keyword))
					System.out.printf("%s:%d:%s%n", file.getPath(),lineNumber,line);
			}
		}
	}
	
	
}