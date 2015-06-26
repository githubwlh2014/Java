package genericPro;

import java.util.*;

public class TestGener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> li=new ArrayList<>();
//		li.add("Hello");
//		li.add("World");
//		
//		System.out.println(li.get(0));
//		System.out.println(li.get(1));
//		
		Pair<String> pair=new Pair<String>();
		System.out.println("first="+pair.getFirst());
		System.out.println("second="+pair.getSecond());
		
//		pair.setFirst("Hello");
//		pair.setSecond("World");
		Pair<String> pair1=new Pair<String>("Hello","World");
		System.out.println("first="+pair1.getFirst());
		System.out.println("second="+pair1.getSecond());
		
		Integer aa=ArrayAlg.aver(10, 15);
		System.out.println(aa.intValue());
		
		TestPair tp=new TestPair(new Date(),new Date());
		tp.setSecond(new Date());
		
		//Object[] table=new Pair<String>[10];
		
	}

}

class Pair<T>{
	
	private T first;
	private T second;
	
	public Pair(){
		
		first=null;
		second=null;
	}
	
	public Pair(T first,T second){
		
		this.first=first;
		this.second=second;
	}
	
	public T getFirst(){
		
		return first;
	}
	
	public T getSecond(){
		
		return second;
	}
	
	public void setFirst(T first){
		
		this.first=first;
	}
	
	public void setSecond(T second){
		
		this.second=second;
	}
	
//	public boolean equals(T value){
//		
//	}
}

class TestPair extends Pair<Date>{
	
	public void setSecond(Date second){
		
		if(second.compareTo(getFirst())>0)
			super.setSecond(second);
			
	}
	
public TestPair(Date a,Date b){
		
		super(b,a);
		
	}
	
}

class ArrayAlg{
	
	public static <T extends Comparable> T aver(T a,T b){
		
		if(a.compareTo(b)>0)
			return a;
		else
			return b;
	}
	

}