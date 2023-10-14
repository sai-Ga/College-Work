package practical1;
import java.util.*;
// Program to demonstrate generic class using list interface
public class Genericclasslist<T> {
	List<T> list1 =new ArrayList<>();
	public void listadd(T a) {
		list1.add(a);
		System.out.println("Added element :"+a);
		System.out.println(list1);
	}
	public void listremove(T a) {
		if(list1.contains(a)==true) {
			System.out.println("Before Removing:"+list1);
			list1.remove(a);
			System.out.println("After Removing :"+list1);
			System.out.println("Removed Element "+a);
		}else {
			System.out.println("Element Does not exist !!!!");
		}
	}
	public void listcontain(T searchitem) {
		if(list1.contains(searchitem)) {
			System.out.println(searchitem+" is in the list .");
		}
		else {
			System.out.println(searchitem+" is not in the list");
		}
	}
	public void listempty() {
		if(list1.isEmpty()==true) {
			System.out.println("List is Empty");
		}
		else {
			System.out.println("List is not Empty");
			System.out.println("List Contains "+list1);
		}
	}
	public void listsize() {
		System.out.println("List Size :"+list1.size());
	}
	public void listaddall() {
		List<T> list2 =new ArrayList<>();
		list2.addAll(list1);
		System.out.println("List 2:"+list2);
	}
	public void getlastelement() {
		int lastindex=list1.size()-1;
		if(list1.isEmpty()) {
			System.out.println("List Does not have element");
		}else {
			T a=list1.get(lastindex);
			System.out.println("List last element :"+a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Genericclasslist<String> gcs=new Genericclasslist<String>();
		stringoperations(gcs);
		Genericclasslist<Integer> gcsint=new Genericclasslist<Integer>();
		intoperations(gcsint);
		Genericclasslist<Double> gcsdou=new Genericclasslist<Double>();
		doubleoperations(gcsdou);
	}
	public static void doubleoperations(Genericclasslist<Double> gcsdou) {
		gcsdou.listadd(1.5);
		gcsdou.listadd(2.5);
		gcsdou.listadd(3.5);
		gcsdou.listadd(4.5);
		gcsdou.listremove(1.5);
		gcsdou.listcontain(2.5);
		gcsdou.listempty();
		gcsdou.getlastelement();
		gcsdou.listsize();
		gcsdou.listaddall();
	}
	public static void intoperations(Genericclasslist<Integer> gcsint) {
		gcsint.listadd(1);
		gcsint.listadd(2);
		gcsint.listadd(3);
		gcsint.listremove(1);
		gcsint.listcontain(2);
		gcsint.listempty();
		gcsint.getlastelement();
		gcsint.listsize();
		gcsint.listaddall();
	}
	public static void stringoperations(Genericclasslist<String> gcs) {
		gcs.listadd("hii");
		gcs.listadd("java");
		gcs.listremove("hii");
		gcs.listcontain("ram");
		gcs.listempty();
		gcs.listsize();
		gcs.getlastelement();
		gcs.listaddall();
	}

}
