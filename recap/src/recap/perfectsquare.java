package recap;
import java.util.Scanner;

public class perfectsquare {
	public static void main(String[] args) {
		int n,i;
		double sq;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		n= in.nextInt();
		sq=Math.sqrt(n);
		if((sq - Math.floor(sq)) == 0){
			System.out.println("perfect number");
		}
		else {
			System.out.println("not perfect number");
		}
	}
}
