package practical3;
import java.util.*;
public class Exercise2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        HashSet<String> set1 = new HashSet<>();
	        set1.add("Red");
	        set1.add("Green");
	        set1.add("Blue");
	        set1.add("White");
	        set1.add("Orange");
	        

	        HashSet<String> set2 = new HashSet<>();
	        set2.add("Red");
	        set2.add("Pink");
	        set2.add("Black");
	        set2.add("Orange");

	        // Create a new set to store the common elements of set1 and set2.
	        Set<String> sameElements = new HashSet<>(set1);

	        // Retain only the elements that are present in both sets.
	        sameElements.retainAll(set2);

	        System.out.println("Common elements of set1 and set2: " + sameElements);
	}

}
