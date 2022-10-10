package test2;
import java.util.Scanner;
import java.util.*;

public class fuel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount of petrol to fill up the tank: ");
		double i=sc.nextInt();
		if(i<0) {
			System.out.println(i+" is an invalid input");
		}
		else {
			System.out.println("enter the distance covered till the tank goes dry: ");
			double j=sc.nextInt();
		if(j<0) {
			System.out.println(j+" is an invalid input");	
		}
		else {
		System.out.println("Liters/100KM");
		double k= ((i/j)*100);
		System.out.println(String.format("%.2f",k));
		System.out.println("Miles/gallons");
		double m=(j*0.6214);
		double g=(i*0.2642);
		double x=(m/g);
		System.out.println(String.format("%.2f",x));
		}
		}
	}
}