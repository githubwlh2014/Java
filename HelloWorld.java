import java.net.URI;
import java.util.*;
class Test{
	
	public int m;
	private int n;
	
	public Test(int m,int n){
		
		this.m=m;
		this.n=n; //value=value;
	}
	
	public Test(){
		
		this(3,8);
	}
	
	public void o(Object a){
		
		System.out.println("Hello,I an father class");
	}
	
	public void output(){
		
		System.out.println("m="+m+"n="+n);
	}
}


class TestSon extends Test{
	
	private int a;
	private int b;
	
	public TestSon(int m,int n,int a,int b){
		
		super(m,n);
		this.a=a;
		this.b=b;
	}
	
	public void output(){
		
//		super.output();
		System.out.println("a="+a+"b="+b);
//		System.out.println(super.m);
	}
	
	public void out(){
		
		//super.output();
		System.out.println("a="+a+"b="+b);
	}
	
	public void o(Date d){
		
		System.out.println("Hello,I am son class");
	}
}

public class HelloWorld implements test3{
	
	public static void main(String[] args) throws Exception{
		
		TestSon test=new TestSon(100,2,3,4);
//		TestSon test1=(TestSon)test;
////		System.out.println(test1.a);
		test.output();
		
//		String INPUT_PATH = "hdfs://hadoop:9000/input";
//		URI uri=new URI(INPUT_PATH);
//		String scheme = uri.getScheme();
//	    String authority = uri.getAuthority();
//	    System.out.println("scheme="+ scheme + ",authority=" +authority);
//		m=12;
		System.out.println(m);
	}

	@Override
	public void fu() {
		// TODO Auto-generated method stub
		
	}
	

public class HelloWorld {

	int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld HW=new HelloWorld();
		System.out.println(HW.a);
		String m="World";
		switch(m){
		
		case "Hello":
			System.out.println("Test");
			//break;
		case "World":
			System.out.println("World");
		}
	}

}
