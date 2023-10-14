package practical3;
import java.util.*;
public class Exercise2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		        HashSet<String> originalHashSet = new HashSet<>();
		        originalHashSet.add("Welcome");
		        originalHashSet.add("To");
		        originalHashSet.add("Advanced");
		        originalHashSet.add("Java");

		        HashSet<String> newHashSet = new HashSet<>();
		        newHashSet.addAll(originalHashSet);
		        
		        //print original hash set
		        System.out.println("Original HashSet: " + originalHashSet);
		        
		        //print new hash set
		        System.out.println("New clone HashSet: " + newHashSet);
	}

}
