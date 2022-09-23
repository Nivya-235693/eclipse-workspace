package Recap;
import java.util.*;

public class Q18 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] str = {"hello","world","hi","all" };
		s.addAll(Arrays.asList(str));
		System.out.println("The initial elements in hashset: "+s);
		s.clear();
		System.out.println("final hashset after clearing all elements is: "+s);

	}

}
