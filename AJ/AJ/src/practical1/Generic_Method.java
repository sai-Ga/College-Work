//To implement a Generic Method.
package practical1;


public class Generic_Method {
	
	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Integer[] intArray = {1,2,3,5,4};
		Double[] doubleArray = {1.1,23.4,3.25,2.34,45.15};
		Character[] charArray = {'H','E','L','L','O'};
		System.out.println("Array integerArray contains:");
		printArray(intArray);
		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);
		System.out.println("\nArray characterArray contains:");
		printArray(charArray);
		
		
	}

}
