package recap2;

import java.util.Scanner;

public class asciivalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char n=sc.next().charAt(0);
		int i=n;
		System.out.println("ascii  value is "+i);
	}
}
