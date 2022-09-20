package recap;
import java.util.Scanner;

public class replaceword {
  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String s=sc.nextLine();
        
        System.out.println("ENTER THE SUB STRING");
        String sub=sc.nextLine();
        
        System.out.println("ENTER THE NEW SUB STRING");
        String subn=sc.nextLine();
        
        String sn=s.replace(sub, subn);
        
        System.out.println(sn);
   }
}