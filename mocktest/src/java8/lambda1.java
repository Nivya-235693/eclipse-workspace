package java8;
import java.util.*;

interface MyFunctionalInterface {
    public int incrementByFive(int a);
}
public class lambda1 {

   public static void main(String args[]) {
	   
	   Scanner sc=new Scanner(System.in);
    	MyFunctionalInterface f = (num) -> num+5;
    	System.out.println("Enter a number");
    	int n=sc.nextInt();
        System.out.println("The number entered + 5 is "+f.incrementByFive(n));
    }
}


