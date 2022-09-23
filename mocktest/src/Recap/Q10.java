package Recap;
import java.util.Collections;
import java.util.LinkedList;

public class Q10 {
	public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Anu");
        linkedList.add("Nishadh");
        linkedList.add("Karthika");
        linkedList.add("Suhail");
        linkedList.add("Nivya");
        linkedList.add("Himesh");
        System.out.println("Actual LinkedList:");
        System.out.println(linkedList);
        Collections.shuffle(linkedList);
        System.out.println("Results after shuffle operation:" );
        System.out.println(linkedList);
   }
}