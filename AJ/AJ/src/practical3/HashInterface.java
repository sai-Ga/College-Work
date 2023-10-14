package practical3;

import java.util.*;
public class HashInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare set class
		Set<Integer>numSet=new HashSet<Integer>();
		
		//add an element 
		numSet.add(25);
		
		// Add a list to a set using addAll method.
		numSet.addAll(Arrays.asList(new Integer[] {1,5,3,7,9,6,2,8,12,14}));
		
		//print set
		
		System.out.println("Original Set(numSet): "+ numSet);
		
		//size
		
		System.out.println("numSet size : "+ numSet.size());
		
		//create a new set class and initialize it with list elements
		
		Set<Integer>oddSet=new HashSet<Integer>();
		Set<Integer>evenSet=new HashSet<Integer>();
		
		for (int element : numSet) {
		    if (element % 2 == 0) {
		    	evenSet.add(element);
		    } else {
		    	oddSet.add(element);
		    }
		  }

		  List<Integer> result = new ArrayList<>();
		 
		  result.addAll(oddSet);
		  
		  //print the oddSet
		  System.out.println("Odd Set of numSet : "+oddSet);
		  
		  //contains()
		  System.out.println("numSet contains the Element 2 : "+numSet.contains(2));
		//contains()
		  System.out.println("numSet contains the Element 20 : "+numSet.contains(20));
		  
		  //containsAll()
		  System.out.println("numSet that contains the collection of oddSet : "+numSet.containsAll(oddSet));
		  
		  //retainAll()
		  Set<Integer>set_intersection=new HashSet<Integer>(numSet);
		  set_intersection.retainAll(oddSet);
		  System.out.println("Intersection in numSet & oddSet "+ set_intersection);
		  
		  //removeAll()
		  Set<Integer>set_difference=new HashSet<Integer>(numSet);
		  set_difference.removeAll(oddSet);
		  System.out.println("Difference in numSet & oddSet "+ set_difference);
		  
		  //addAll()
		  Set<Integer>set_union=new HashSet<Integer>(numSet);
		  set_union.addAll(oddSet);
		  System.out.println("Union in numSet & oddSet "+ set_union);

	}

}
