import java.io.IOException;
import java.util.concurrent.CancellationException;


public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex a=new Ex();
		try {
			a.out(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Ex{
	
	public void out(int m) throws IOException
	{
		if(m==0)
		{
			//throw new CancellationException();
			throw new IOException();
		}
	}
	
}

class subEx extends Ex{
	
	public void out(int m){
		
	}
}
