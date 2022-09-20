package recap;
import java.util.Scanner;
import java.util.*;

public class placeofwork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the age ");
		i=sc.nextInt();
		System.out.println("Sex M/F? ");
		String a = sc.next();
		System.out.println("Marrital status Y/N? ");
		String b=sc.next();
		if(a.equals("F")) {
			System.out.println("works at urban area");
		}
		else if(a.equals("M")) {
			if(i>=20 && i<40) {
				System.out.println("can work at any location");
			}
			else if(i>=40 && i<60) {
				System.out.println("can work only at urban areas");
			}
			else {
				System.out.println("ERROR");
			}
		}
		else
			System.out.println("enter a valid sex");
	}
}
