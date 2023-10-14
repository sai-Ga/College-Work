package practical2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise3 {
	public static void main(String[] args) {
		Set <Integer> numSet = new HashSet<Integer>();
		numSet.addAll(Arrays.asList(new Integer[] {23,12,45,66,3,11,34,56}));
		Set <Integer>numSet2 = new HashSet <Integer>();
		numSet2.addAll(Arrays.asList(new Integer[] {23,12,45,66,3}));
		numSet2.retainAll(numSet);
		System.out.println(numSet2);
		
		
	}
}
