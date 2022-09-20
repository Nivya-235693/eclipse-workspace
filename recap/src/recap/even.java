package recap;
import java.util.Scanner;

public class even {
	public static void main(String[] args) {
		System.out.println("The even numbers between 1 and 100 are");
		for(int i=1;i<=100;i++) {
			if(i%2==0)
				System.out.println(i);
		}	
	}
}
