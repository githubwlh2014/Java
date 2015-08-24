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

public class HelloWorld{
	
	public static void main(String[] args) throws Exception{
		
		List<Integer> l=new LinkedList<>();
		l.add(3);
		l.add(1);
		l.add(2);
		Iterator i=l.iterator();
		Iterator i1=l.iterator();
//		l.add(5);
//		i1.next();
//		i1.remove();
		i1.next();
		i1.next();
		while(i.hasNext())
		System.out.println(i.next());
		
	}

}
	

