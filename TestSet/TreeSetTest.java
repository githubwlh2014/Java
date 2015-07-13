package TestSet;

import java.util.*;

/**
 * @author Administrator
 *
 */
public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Item> parts=new TreeSet<>();
		parts.add(new Item("Toaster",1234));
		parts.add(new Item("Widget",4562));
		parts.add(new Item("Modem",9912));
		System.out.println(parts);
		
		SortedSet<Item> sortByDescription=new TreeSet<>(new Comparator<Item>(){
			
			public int compare(Item a,Item b){
				
				String descrA=a.getDescription();
				String descrB=b.getDescription();
				return descrA.compareTo(descrB);
			}
		});
		
		sortByDescription.addAll(parts);
		System.out.println(sortByDescription);
	}

}

class Item implements Comparable<Item>{
	
	private String description;
	private int partNumber;
	
	public Item(String aDescription,int aPartNumber){
		
		this.description=aDescription;
		this.partNumber=aPartNumber;
	}
	
	public String getDescription(){
		
		return this.description;
	}
	
	public String toString(){
		
		return "[descripton="+this.description+", partNumber="+partNumber+"]";
	}

	public boolean equals(Object otherObject){
		
		if(this==otherObject) return true;
		if(otherObject==null) return false;
		if(getClass()!=otherObject.getClass()) return false;
		Item other=(Item)otherObject;
		return Objects.equals(description,other.description)&&partNumber==other.partNumber;
	}
	
	public int hashCode(){
		
		return Objects.hash(description,partNumber);
	}
	
	@Override
	public int compareTo(Item other) {
		// TODO Auto-generated method stub
		
		return Integer.compare(partNumber, other.partNumber);
	}
}