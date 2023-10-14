//Define a generic interface for a stack
package practical1;

interface Stack<T>{
	void push (T item);
	T pop();
	boolean isEmpty();
}

//Create a class that implements the generic interface
class GenericStack<T> implements Stack<T>{
	private T[] stackArray;
	private int top;
	private int maxSize;
	@SuppressWarnings ("unchecked")
	public GenericStack(int maxSize) {
		this.maxSize = maxSize;
		this.stackArray= (T[]) new Object[maxSize];
		this.top = -1;
		
	}
	@Override 
	public void push(T item) {
		if(top < maxSize -1) {
			stackArray[++top]=item;
			}else {
				System.out.println("Stack is full. Cannot push\t"+ item);
			}
	}
	@Override
	public T pop() {
		if(!isEmpty()) {
			return stackArray[top--];
		} 
		else {
			System.out.println();
			System.out.println("Stack is empty");
			return null;
			
		}
	}
	@Override
	public boolean isEmpty() {
		return  top == -1;
	}
}




public class Stack_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create a stack  of integers
	
Stack<Integer> intStack = new GenericStack<>(5);
intStack.push(10);
intStack.push(20);
intStack.push(60);
intStack.push(23);
System.out.println();
System.out.println("Popped item:" + intStack.pop());
System.out.println();
System.out.println("Is stack Empty?" + intStack.isEmpty());

//create a stack  of integers

Stack<String> stringStack = new GenericStack<>(5);
stringStack.push("DELL");
stringStack.push("HP");
stringStack.push("LENOVO");
stringStack.push("ACER");
System.out.println();
System.out.println("Popped item:" + stringStack.pop());
System.out.println();
System.out.println("Is stack Empty?" + stringStack.isEmpty());

		
	}

}
