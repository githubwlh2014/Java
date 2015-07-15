package TestSet;
/**
 * 经测试不会实现内部类的重写“多态”
 * @author WLH
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s=new S();
		s.outPut();
	}

}

class F{
	
	public void outPut(){
		
		Test t=new Test();
		System.out.println(t.toString());
		
	}
	
	public static class Test{
		
		public static final int m=5;
		public String toString(){
			
			return "I am F.Test";
		}
	}
	

	
}

class S extends F{
	

	public static class Test extends F.Test{
		
		public static final int n=10;
		
		public String toString(){
			
			return "I am S.Test";
		}
	}
}