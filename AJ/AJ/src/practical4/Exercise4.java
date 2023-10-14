package practical4;

import java.util.TreeMap;

public class Exercise4 {
	public static void main(String[] args) {
		TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  
		  // Put elements to the map 
		  tree_map1.put("K1", "HP");
		  tree_map1.put("K2", "ACER");
		  tree_map1.put("K3", "DELL");
		  tree_map1.put("K4", "ASUS"); 
		    
		  System.out.println(tree_map1);
		        if(tree_map1.containsKey("K1")){
		            System.out.println("The Tree Map contains key K1");
		        } else {
		            System.out.println("The Tree Map does not contain key K1");
		        }
		        if(tree_map1.containsKey("K5")){
		            System.out.println("The Tree Map contains key K5");
		        } else {
		            System.out.println("The TreeMap does not contain key K5");
		        }
	}
}
