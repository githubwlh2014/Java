import java.net.URI;
import java.util.*;
class Test{
	
	private int m;
	private int n;
	
	public Test(int m,int n){
		
		this.m=m;
		this.n=n;
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
		
		super.output();
		System.out.println("a="+a+"b="+b);
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
		
		Test test=new TestSon(1,2,3,4);
		TestSon test1=(TestSon)test;
		
		test1.out();
		
//		String INPUT_PATH = "hdfs://hadoop:9000/input";
//		URI uri=new URI(INPUT_PATH);
//		String scheme = uri.getScheme();
//	    String authority = uri.getAuthority();
//	    System.out.println("scheme="+ scheme + ",authority=" +authority);
		
	
	}

	@Override
	public void fu() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void fu1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fu2() {
		// TODO Auto-generated method stub
		
	}
}

interface test1{
	
	void fu();
}

interface test2{
	
	void fu1();
}

interface test3 extends test1,test2{
	
	void fu2();
}