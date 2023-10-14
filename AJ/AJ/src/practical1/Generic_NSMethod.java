//To implement Non-Static Generic method.
package practical1;



	class NS_GenericM{
	public <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	}
	
	public class Generic_NSMethod {
	public static void main(String[] args) {
		
		NS_GenericM nsgm = new NS_GenericM();
		Integer[] intArray = {1,2,3,5,4};
		Double[] doubleArray = {1.1,23.4,3.25,2.34,45.15};
		Character[] charArray = {'H','E','L','L','O'};
		System.out.println("Array integerArray contains:");
		nsgm.printArray(intArray);
		System.out.println("\nArray doubleArray contains:");
		nsgm.printArray(doubleArray);
		System.out.println("\nArray characterArray contains:");
		nsgm.printArray(charArray);
		
	}
	}
	