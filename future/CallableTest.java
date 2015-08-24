package future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call a=new Call();
		FutureTask<Integer> ft=new FutureTask<>(a);
		new Thread(ft).start();
		try {
			System.out.println(ft.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TestException tE=new TestException();
		
		tE.out();
	
	}

}

class Call implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 98;
	}

}

class TestException {
	
	public void out(){
		
		System.out.println("testException");
	}
}
