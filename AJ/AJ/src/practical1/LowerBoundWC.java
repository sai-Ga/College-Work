package practical1;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWC {
	private static void addElements(List<? super Integer> list) {
		// TODO Auto-generated method stub
		for (int i =1;i<=15;i++) {
			list.add(i);
		}
	}
	public static void main(String[] args) {
		List<Object> objectList = new ArrayList<>();
		addElements(objectList);
		System.out.println("Object List:" + objectList);
		List<Number> numberList= new ArrayList<>();
		addElements(numberList);
		System.out.println("NUmber List:" + numberList);
	}
	}


