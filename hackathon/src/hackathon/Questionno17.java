package hackathon;
import java.util.Scanner;

public class Questionno17 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year ");
		int i=sc.nextInt();
		if(((i%100!=0)&&(i%4==0))||(i%400==0))
			System.out.println(i+" is a leap year");
		else
			System.out.println(i+" is not a leap year");
	}
}
