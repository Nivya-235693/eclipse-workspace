package recap2;
import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		int n,r,temp,res=0;
		System.out.println("enter the number ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(temp!=0) {
			r=temp%10;
			res=res+(r*r*r);
			temp=temp/10;
		}
		if(res==n) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}
}
