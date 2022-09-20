package JAVA8;
import java.util.ArrayList;
import java.util.List;

public class noofstring {
	public static void main(String[] args) {
		List <String> l = new ArrayList <String> ();
		l.add("apple");
		l.add("banana");
		l.add("grape");
		long c = l.stream().filter(str->str.length()>5).count();
		System.out.println("no of strings is which has more than 5 chara is: "+c);
	}
}
