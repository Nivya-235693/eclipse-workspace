package test2;
import java.util.*;
import java.util.Scanner;

public class concat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Inmates name: ");
		String s=sc.nextLine();
		System.out.print("Inmates fathers name: ");
		String f=sc.nextLine();
		s=s.concat(" ").concat(f);
		char[] cs=s.toCharArray();
		for(char c:cs) {
			if(Character.isDigit(c)||c=='!'||c=='@'||c=='#'||c=='$'||c=='%') {
				System.out.println("invalid name");
				System.exit(0);
			}
		}
		System.out.println(s.toUpperCase());
	}
}
