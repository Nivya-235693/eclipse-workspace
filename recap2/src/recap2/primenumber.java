package recap2;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) {
			for(int j=2;j<=n/2;j++) {
				if(n%j==0)
					c = c+1;
				break;
			}	
		}
	if(c == 0)
		System.out.println("The number is prime");
	else
		System.out.println("The number is not prime");
	}
}
