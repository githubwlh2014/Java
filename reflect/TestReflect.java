package reflect;
import java.lang.reflect.Field;
import java.util.*;

public class TestReflect {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Object d=new Date();
		Class cl1=d.getClass();
		
		String name=cl1.getName();
		System.out.println(d);
		System.out.println("1"+name);
//		
//		String className="java.util.Date";
//		Class cl2=Class.forName("java.util.Date");
//		System.out.println("2"+cl2.getName());
//		
//		Class cl3=Date.class;
//		System.out.println("3"+cl3.getName());
//		
//		Class cl4=double[].class;
////		Class cl4=int[].class;
//		System.out.println("4"+cl4.getName());
//		
//		if(cl3==cl2)
//			System.out.println("引用一样");
//		
//		Date dd=(Date)cl3.newInstance();
//		System.out.println(dd);
		System.out.println("*****************************************************");
		
//		A a=new A();
//		Class cl=a.getClass();
//		Field f=cl.getDeclaredField("n");
//		f.setAccessible(true);
//		Object test=f.get(a);
//		System.out.println(test);
//		
//		int[] test={2,3,4};
//		System.out.println(test.getClass().getName());
//		
		
	}

}

class A{
	
	public int m;
	private int n;
	public A(){
		
		m=3;
		n=6;
	}
}
