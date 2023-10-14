//Practical 1. WAP to demo a Generic Class
package practical1;

class BoxDemo<T>{
	private T content; //T stands for "Type"
	 public BoxDemo() {
		 content=null;
	 }
	 public BoxDemo(T content) {
		 this.content=content;
	 }
	public T getContent () {
		return content;
	}
	 public void setContent(T content) {
		 this.content = content;
	 }
	 
}

public class Box_Generics {
	public static void main(String[] args) {
	//Create a Box to hold an integer
	BoxDemo<Integer> intBox = new BoxDemo<>();
	intBox.setContent(42);
	int intContent = intBox.getContent();
	System.out.println("Integer Content:" +intContent);
	//Create a Box to hold a string
	BoxDemo<String> stringBox = new BoxDemo<>();
	stringBox.setContent("Hello World!");
	String stringContent = stringBox.getContent();
	System.out.println("String Content:" +stringContent);
	//Create a Box to hold a Double
	BoxDemo<Double> doubleBox = new BoxDemo<>();
	doubleBox.setContent(42.12);
	double doubleContent = doubleBox.getContent();
	System.out.println("Double Content:" +doubleContent);
	
	}
}
