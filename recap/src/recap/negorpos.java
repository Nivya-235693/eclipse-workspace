package recap;

import java.util.Scanner;

public class negorpos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers ");
		int i=sc.nextInt();
		if(i>0) {
			System.out.println("The number is positive");
		}
		else {
			System.out.println("the number is negative");
		}
	}
}
