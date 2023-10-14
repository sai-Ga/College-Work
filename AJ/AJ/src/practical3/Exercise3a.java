package practical3;
import java.util.*;
public class Exercise3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Welcome");
        treeSet1.add("To");
        treeSet1.add("java");

        TreeSet<String> treeSet2 = new TreeSet<>();

        // Add all of the elements of treeSet1 to treeSet2.
        treeSet2.addAll(treeSet1);

        System.out.println("TreeSet2: " + treeSet2);

	}

}
