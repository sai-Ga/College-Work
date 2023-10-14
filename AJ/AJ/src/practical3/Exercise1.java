package practical3;
import java.util.*;
public class Exercise1 {
//sort method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> originalSet = new HashSet<>();
		originalSet.add(5);
		originalSet.add(3);
		originalSet.add(1);
		originalSet.add(10);
		originalSet.add(6);
		originalSet.add(2);
		originalSet.add(20);
		originalSet.add(26);

		//print the hash set
		 System.out.println("Original Set are : "+originalSet);
		 
		 //Tree set is used to arrange it in sorted order
		TreeSet<Integer> sortedSet = new TreeSet<>(originalSet);
		// Print the sorted set.
		 System.out.println("Sorted Set are : "+sortedSet);
		
		


	}

}
