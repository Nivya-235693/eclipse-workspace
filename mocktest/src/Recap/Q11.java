package Recap;
import java.util.*;

public class Q11 {
	public static void main(String args[]){
        LinkedList<String> l = new LinkedList<String>();
        l.add("Anu");
        l.add("Suhail");
        l.add("Karthika");
        l.add("Nishad");
        l.add("Nivya");
        System.out.println("The elements of LinkedList are: ");
        System.out.println(l);
       LinkedList<String> clone = (LinkedList<String>)l.clone();
       System.out.println("Cloned LinkedList: ");
       System.out.println(clone);
    }
}
