package genericPro;

public class GenerWildcardCapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void unBox(Box<?> box){
		
		System.out.println(box.get());
	}
}

interface Box<T>{
	
	public T get();
	public void put(T element);
}
