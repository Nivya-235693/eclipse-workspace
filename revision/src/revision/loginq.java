package revision;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class loginq {
	public static void main (String[] args)
	    {
	        System.out.println("Enter your ID");
	        Scanner scn = new Scanner(System.in);
	        String s = scn.nextLine();
	        int len = s.length();
	        
	        if (len ==12)
	        {
	            Pattern p = Pattern.compile("^GBL/([0-9]){3}/[0-9]{4}");
	            Matcher m = p.matcher(s);
	            boolean found = m.find();
	            
	            if (found) {
	                System.out.println("Login success");
	            }
	            else
	                System.out.println("Incorrect ID");
	        }
	    }
}