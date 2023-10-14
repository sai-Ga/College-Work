package practical1;

import java.util.*;

public class WildcardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <?> myList = new ArrayList<>();
		myList.add(null);
		 //myList.add("Hello"); //This results in compile-time error as we have not mentioned a return-type
		List<String> stringList= new ArrayList<>();
		stringList.add("Hello");
		stringList.add("world");
		
		List<Integer> intList= new ArrayList<>();
		intList.add(10);
		intList.add(5);
		printListElements(stringList);
		printListElements(intList);
	}

	private static void printListElements(List<?> list) {
		// TODO Auto-generated method stub
		for(Object item: list) {
			System.out.println(item);
			
		}
		
	}	

	
}
