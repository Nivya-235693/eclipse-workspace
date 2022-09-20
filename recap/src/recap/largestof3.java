package recap;
import java.util.Scanner;

public class largestof3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		int i=sc.nextInt();
		int j =sc.nextInt();
		int k = sc.nextInt();
		if(i>j && i>k) {
			System.out.println("The largest of the 3 number is "+i);
		}
		else if(j>k && j>i) {
			System.out.println("The largest of the 3 numbers is "+j);
		}
		else
			System.out.println("The largest of the 3 numbers is "+k);
	}
}
