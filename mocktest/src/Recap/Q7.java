package Recap;
import java.util.LinkedList;

public class Q7 {
	public static void main(String args[]){
	      LinkedList<String> l1 = new LinkedList<String>();
	      l1.add("Java");
	      l1.add("Python");
	      l1.add("C++");
	      System.out.println("The list is defined as: " +l1);
	      l1.addFirst("DS");
	      l1.addLast("R");
	      System.out.println("The list after adding elements at first and last pos is : ");
	      System.out.println(l1);
	   }
}
