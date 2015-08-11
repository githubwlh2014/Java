package bounceThread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestRunnable tR=null;
		//Thread t=null;
		for(int i=0;i<1;i++){
			
//			TestRunnable tR=new TestRunnable(i);
//			Thread t=new Thread(tR);
//			t.start();
			
			int m=0;
	      //  System.out.println("HAHAHAHAHAH");
//			int m=3;
			String encoding="GBK";
			System.out.println("ADFA");
			try {
				File f=new File("m.txt");
				InputStreamReader read = new InputStreamReader(
				        new FileInputStream(f),encoding);//考虑到编码格式
				        BufferedReader bufferedReader = new BufferedReader(read);
				        String lineTxt = null;
				        while((lineTxt = bufferedReader.readLine()) != null){
				            System.out.println(lineTxt);
				        }
				        
		    System.out.println("HAHAHAHAHAH");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}

		
		System.out.println("主线程完成");
	}

}

class TestRunnable implements Runnable{
	
	private int j;
	public TestRunnable(int i){
		
		this.j=i;
	}
	public void run(){
		for(int i=1;i<1000;i++)
			System.out.println("我是线程循环"+j);
	}
}
