package revision;
import java.util.Scanner;

public class arrsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[20];
		int n,s=0;
		System.out.println("Enter number of elements : ");
		n=sc.nextInt();
		if(n==0 || n<0) {
			System.out.println("Invalid Range");
			System.exit(0);
		}
		else {
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
		}
			for(int i=0;i<n;i++) {
				s=arr[i]+s;
				System.out.print(s+" ");
			}
		}
	}
}
