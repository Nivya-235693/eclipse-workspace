package recap;
import java.util.Scanner;
import java.util.*;

public class palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String b="";
		System.out.println("enter the string :");
		String a = sc.next();
		String t=a;
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(b.compareTo(t)==0) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}
}
