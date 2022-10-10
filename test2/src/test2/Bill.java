package test2;
import java.util.Scanner;
import java.util.*;

public class Bill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no of pizza brought");
		int p=sc.nextInt();
		System.out.print("enter the no of puffs brought");
		int pu=sc.nextInt();
		System.out.print("enter the no of cold drinks brought");
		int c=sc.nextInt();
		System.out.println();
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+p);
		System.out.println("No of puffs:"+pu);
		System.out.println("No of colddrinkS:"+c);
		int cost=(p*100)+(pu*20)+(c*10);
		System.out.println("Total price="+cost);
		System.out.println("ENJOY THE SHOW!!!");
	}
}
