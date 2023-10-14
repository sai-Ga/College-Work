package practical2;
import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
	public static void main(String[] args) {
		Set <Integer> numSet = new HashSet<Integer>();
		numSet.add(13);
		numSet.add(23);
		numSet.add(45);
		Set <Integer> numSet2 = new HashSet<Integer>();
		numSet2.addAll(numSet);
		System.out.println("numset:"+numSet);
		System.out.println("clone of numset:"+numSet2);
	}

}
