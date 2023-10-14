package practical3;
import java.util.*;
public class Exercise3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");

        // Create a reverse order view of the elements in the tree set.
        Set<String> reverseOrderTreeSet = treeSet.descendingSet();
        System.out.println("Original order view of the tree set: " + treeSet);
        System.out.println("Reverse order view of the tree set: " + reverseOrderTreeSet);
	}

}
