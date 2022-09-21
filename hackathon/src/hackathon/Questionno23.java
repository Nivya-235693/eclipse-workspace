package hackathon;
import java.util.Scanner;

public class Questionno23 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string ");
		String n=sc.next();
		char ch;
		String rev="";
		for(int i=0;i<n.length();i++) {
			ch=n.charAt(i);
			rev=ch+rev; 
		}
		System.out.println("The string after reversal is "+rev);
	}
}
