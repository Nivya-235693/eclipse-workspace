package JAVA8;
import java.util.Comparator;
import java.util.stream.Stream;

public class highandlow {

	public static void main(String[] args) {
		Integer highest = Stream.of(1,2,3,77,6,5)
				.max(Comparator.comparing(Integer::valueOf)).get();
		Integer lowest = Stream.of(1,2,3,77,6,5)
				.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("highest : " +highest);
		System.out.println("lowest : "+lowest);
	}
}
