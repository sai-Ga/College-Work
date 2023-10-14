package practical4;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "ACER");
		  hash_map.put(2, "DELL");
		  hash_map.put(3, "HP");
		  hash_map.put(4, "ASUS");
		  hash_map.put(5, "LENOVO");
		  hash_map.put(6, "APPLE");
		  for(Map.Entry x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }

		}
}
