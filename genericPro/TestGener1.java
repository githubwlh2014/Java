package genericPro;

import java.util.*;

public class TestGener1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AL<String> a=new AL<String>();
//		a.set(0, "Hello");
//		String b[]=a.get(0);
//		System.out.println(b[0]);
		
		B[] b=new B[3];
		A[] a=b;
		a[1]=new B();
		
		
	}

}

class AL<E>{
	
	private Object[] elements=new Object[1];
	
	public void set(int n,E e){
		
		elements[0]=e;
	}
	
	public E[] get (int n){
		
		return (E[])elements;
	}
}

class A{
	
	public void outPut(){
		
		System.out.println("I am A");
	}
}

class B extends A{
	
	public void outPut(){
		
		System.out.println("I am B");
	}
}