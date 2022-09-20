package recap;

import java.util.Scanner;

public class gcd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int g=1;
		for(int k=1;k<=i&&k<=j;k++) {
			if(i%k==0&&j%k==0) {
				g=k;
			}
		}
		System.out.println("The GCD of the 2 numbers is "+g);	
	}
}
