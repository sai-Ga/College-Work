package practical3;
import java.util.*;
public class Exercise3e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);

        // Retrieve the last element of the tree set.
        Integer lastElement = treeSet.last();

        // Remove the last element of the tree set.
        treeSet.remove(lastElement);

        System.out.println(treeSet); 
	}

}
