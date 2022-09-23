package Recap;
import java.util.*;

public class Q5 {
	public static void main(String[] args) {
	    ArrayList<String> input_list = new ArrayList<String>();
	    input_list.add("Hello");
	    input_list.add("my");
	    input_list.add("name");
	    input_list.add("is");
	    input_list.add("Nivya");
	    System.out.println("The list is defined as: " + input_list);
	    Collections.sort(input_list);
	    System.out.println("The sorted list is: " + input_list);
   }
}
