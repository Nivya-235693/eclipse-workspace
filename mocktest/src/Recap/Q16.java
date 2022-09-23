package Recap;
import java.util.*;

public class Q16 {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<String>();
		hashset.add("hello");
		hashset.add("world");
		hashset.add("hi");
		hashset.add("apple");
		System.out.println(hashset);
		Set<String> hashtotree = new TreeSet<String>(hashset);
		System.out.println(hashtotree);
	}

}
