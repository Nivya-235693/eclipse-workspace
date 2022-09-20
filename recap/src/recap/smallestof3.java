package recap;
import java.util.Scanner;

public class smallestof3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		int i=sc.nextInt();
		int j =sc.nextInt();
		int k = sc.nextInt();
		int temp;
		temp=i<j?i:j;
		temp=temp<k?temp:k;
		System.out.println("The smallest of 3 number is "+temp);	
	}
}
