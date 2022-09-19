package JAVA8;
import java.util.*;
import java.util.stream.IntStream;

public class coverttostream {

	public static void main(String[] args) {
		int a[] = {8,9,3,4,5};
		Arrays.sort(a);
		System.out.println("Sorted array is ");
	    for(int i:a)  
			System.out.print(i+" ");
		IntStream strm = Arrays.stream(a);
		System.out.println();
		System.out.println("The stream after convertion is :");
		strm.forEach(ar -> System.out.print(ar + " "));
	}
}


		
		
				
		
