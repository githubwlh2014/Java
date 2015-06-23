import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m=new HashMap<String,String>(); //泛型的使用
		m.put("key", "value");
		String s=m.get("key");
		System.out.println(s);//
	}

}
