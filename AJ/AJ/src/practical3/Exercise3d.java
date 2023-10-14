package practical3;

import java.util.TreeSet;

public class Exercise3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		     
		   // Add elements in the tree
		   tree_num.add(10);
		   tree_num.add(22);
		   tree_num.add(36);
		   tree_num.add(25);
		   tree_num.add(16);
		   
		   System.out.println("Original tree set: "+tree_num);
		   System.out.println("Removes the last element: "+tree_num.pollLast());
		   System.out.println("Tree set after removing last element: "+tree_num);
	}

}
