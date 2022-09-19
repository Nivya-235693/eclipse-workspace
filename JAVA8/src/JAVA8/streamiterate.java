package JAVA8;
import java.util.Random;

public class streamiterate {

	public static void main(String[] args) {
		Random r = new Random();
		r.ints().limit(5).forEach(System.out::println);
	}
}
