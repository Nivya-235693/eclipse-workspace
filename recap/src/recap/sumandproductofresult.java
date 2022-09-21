package recap;

import java.util.Scanner;

public class sumandproductofresult {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int i=sc.nextInt();
		int j =sc.nextInt();
		int sum=i+j;
		int p=i*j;
		int sr=sum+p;
		int sp=sum*p;
		System.out.println("the sum of result is "+sr);
		System.out.println("the product of result is "+sp);
	}
}
