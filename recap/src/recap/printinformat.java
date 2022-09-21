package recap;

import java.util.Scanner;

public class printinformat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String i=sc.next();
		System.out.println("Enter roll no: ");
		int j=sc.nextInt();
		System.out.println("Enter area of interest: ");
		String m=sc.next();
		System.out.println("Hey my name is "+i+" my roll no is "+j+" my area of interest is "+m);
	}

}
