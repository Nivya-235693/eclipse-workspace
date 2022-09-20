package recap;
import java.util.Scanner;

public class largestandsmallest {

	public static void main(String[] args) {
		String a="hey I am Nivya";
		String ar[]=a.split(" ");
		String l=ar[0];
		String s=ar[0];
		for(int k=1;k<(ar.length);k++) {
			if(s.length()>=ar[k].length())
				s=ar[k];
			if(l.length()<=ar[k].length())
				l=ar[k];
		}
		System.out.println("largest word is "+l);
		System.out.println("smallest is "+s);
	}
}
