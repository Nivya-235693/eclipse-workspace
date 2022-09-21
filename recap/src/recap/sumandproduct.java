package recap;

import java.util.Scanner;

public class sumandproduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int i=sc.nextInt();
		int j =sc.nextInt();
		int sum=i+j;
		int p=i*j;
		System.out.println("The sum is "+sum);
		System.out.println("The product is "+p);
	}
}
