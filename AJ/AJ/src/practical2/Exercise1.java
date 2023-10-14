package practical2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
	public static void main(String[] args) {
		Set <Integer> numSet = new HashSet<Integer>();
		numSet.add(13);
		numSet.add(23);
		numSet.add(45);
		System.out.println("hashSet:"+numSet);
		ArrayList <Integer> list = new ArrayList<>();
		list.addAll(numSet);
		System.out.println("ArrayList:"+list);
		
	}
}
