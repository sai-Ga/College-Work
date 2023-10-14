//w/ the use of generic method implement swapping of intArray.

package practical1;
import java.util.*;


 	class Swap{
	public <T> void swap(T[] A, int i, int j) {
		T temp = A[i];
        A[i] = A[j];
        A[j] = temp;
	}
}


public class Swap_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap s = new Swap();
		Integer[] intArray = {1,2,3,5,4};
		System.out.println("Before Swap :"+Arrays.toString(intArray));
		s.swap(intArray,0,4); //2 and 3 are index positions of element in the array.
		System.out.println("After Swap :"+Arrays.toString(intArray));

	}

}
