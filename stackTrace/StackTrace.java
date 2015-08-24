package stackTrace;

import java.util.*;
public class StackTrace {
	
	/**
	 * 
	 * 
	 * @param args
	 */
	
	public static int factorial(int n){
		
		System.out.println("factorial("+n+");");
		Throwable t=new Throwable();
		StackTraceElement[] frames=t.getStackTrace();
		for(StackTraceElement f:frames){
			
			System.out.println(f);
		}
		
		int r;
		if(n<=1)
			r=1;
		else
			r=n*factorial(n-1);
		System.out.print("return"+r);
		return r;
	}
	
	/**
	 * test finally return
	 * @param args
	 */
	public static int f(int n){
		
		try{
			
			int r=n*n;
			return r;
		}finally{
			
			if(n==2)
				return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
//		System.out.print("Enter n:");
//		int n=in.nextInt();
		
//		int m=in.nextInt();
//		String s=in.nextLine();
//		System.out.println(s);
//		System.out.println(m+","+n);
//		factorial(n);
		
		System.out.println(f(2));
	}

}
