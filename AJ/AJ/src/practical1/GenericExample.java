package practical1;
import java.util.*;

class allType<T>{
	@SuppressWarnings("unused")
	private T content;
	public allType() {
		content = null;
	}
	public allType(T content) {
		this.content = content;
		
	}
	public void addElement( T content) {
	List<T> list = new ArrayList<>();
	list.add(content);
	 System.out.println(list);
	 }
	
}

public class GenericExample {
	public static void main(String[] args) {
		
		allType<Integer> intElement = new allType<>();
		intElement.addElement(23);
		allType<String> stringElement = new allType<>();
		stringElement.addElement("Acer");
		
	}

}
