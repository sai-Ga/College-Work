package practical3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> Hash = new HashSet<>();
		
		Hash.add(12);
		Hash.add(45);
		Hash.add(99);
		System.out.println("Hash Set:"+ Hash);
		
		List<Integer> list = new ArrayList<>();
		list.addAll(Hash);
		System.out.println("ArrayList:"+list);
	}

}
