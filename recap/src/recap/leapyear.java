package recap;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter the year ");
		year=sc.nextInt();
		if((year % 4 == 0 && ( year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
