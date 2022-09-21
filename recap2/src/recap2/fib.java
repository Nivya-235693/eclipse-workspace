package recap2;
import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of fibonacci ");
		int i=sc.nextInt();
		int m=0,n=1;
		System.out.println(m);
		System.out.println(n);
		for(int k=0;k<(i-2);k++) {
			int t = m+n;
			System.out.println(t);
			m=n;
			n=t;
		}
	}
}
