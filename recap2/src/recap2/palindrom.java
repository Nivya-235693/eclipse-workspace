package recap2;
import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		int r,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int temp=n;
		while(temp!=0) {
			r=temp%10;
			rev=(rev*10)+r;
			temp=temp/10;
		}
		if (rev==n) {
			System.out.println("It is a palindrom number");
		}
		else {
			System.out.println("not a palindrom number");
		}
	}

}
