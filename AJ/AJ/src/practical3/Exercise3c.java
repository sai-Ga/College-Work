package practical3;

import java.util.TreeSet;

public class Exercise3c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tree_set = new TreeSet<String>();
		  tree_set.add("DELL");
		  tree_set.add("ACER");
		  tree_set.add("HP");
		  tree_set.add("LENOVO");
		  tree_set.add("APPLE");
		  System.out.println("Tree set: ");
		  System.out.println(tree_set);
		  
		  
		  //To Find The First Element
		  Object first_element = tree_set.first();
		  System.out.println("First Element is: "+first_element);
		  
		  //To Find The Last Element
		  Object last_element = tree_set.last();
		  System.out.println("Last Element is: "+last_element);

	}

}
