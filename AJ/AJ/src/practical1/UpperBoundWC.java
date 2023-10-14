package practical1;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWC {
	public static <T extends Comparable <T>>  T findMax(List <T> list)  {
		if (list == null || list.isEmpty()) {
			return null;
		}
		T max = list.get(0);
		for (T item : list) {
			if(item.compareTo(max)>0) {
				max=item;
			}
		}
		return max;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList= new ArrayList<>();
		intList.add(12);
		intList.add(25);
		intList.add(55);
		List<Double> doubleList= new ArrayList<>();
		doubleList.add(12.63);
		doubleList.add(22.14);
		doubleList.add(89.69);
	 Integer maxInteger = findMax(intList);
	 System.out.println("Max Integer:" + maxInteger);
	 Double maxDouble = findMax(doubleList);
	 System.out.println("Max Double:" + maxDouble);

	}

}
