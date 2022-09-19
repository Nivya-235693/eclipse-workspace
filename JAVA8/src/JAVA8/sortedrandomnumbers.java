package JAVA8;
import java.util.Random;

public class sortedrandomnumbers {
	public static void main(String[] args) {
		Random random=new Random();
		 random.ints(5,30,70).sorted().forEach(System.out::println);
	 }
}