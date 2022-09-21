package hackathon;
import java.util.Scanner;

public class Questionno25 {
	public static void main(String[] args) {
		int d,odd=0,even=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		while(n>0) {
			d=n%10;
			if(d%2==0) {
				even=even+d; 
			}
			else {
				odd=odd+d;
			}
			n=n/10;
		}
		System.out.println("The sum of odd digits is "+odd);
		System.out.println("The sum of even digits is "+even);
	}
}
