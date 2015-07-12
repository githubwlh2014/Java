package TestSet;

import java.util.*;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li=new LinkedList<>();
		li.add("Hello");
		li.add("World");
		li.add("Hello");
		li.add("Hello");
		System.out.println(li);
		ListIterator<String> it1=li.listIterator();
		ListIterator<String> it2=li.listIterator();
		
		System.out.println(it1.next());
//		it1.remove();
		System.out.println(it2.next());
		
	}

}
