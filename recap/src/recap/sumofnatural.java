package recap;
import java.util.Scanner;

public class sumofnatural {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the limit of natural numbers ");
		int l = sc.nextInt();
		int sum=0;
		for(int i=1;i<=l;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of natural numbers for the mentioned limit is "+sum);
	}
}
