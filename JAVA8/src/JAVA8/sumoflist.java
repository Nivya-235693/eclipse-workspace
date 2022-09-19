package JAVA8;
import java.util.ArrayList;
import java.util.List;

public class sumoflist {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>();
		list.add(2);
		list.add(8);
		list.add(5);
		list.add(1);
		int sum = list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println("the sum of the numbers is "+sum);

	}

}
