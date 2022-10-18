package revision;
import java.util.Scanner;
import java.util.*;
import java.util.Map.Entry;

public class sumpair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
		int l,s,f=0;
		System.out.println("Enter the number of elements in array");
		l=sc.nextInt();
		int arr[]= new int[l];
		System.out.println("Enter elements of array: ");
		for(int k=0;k<l;k++) {
			arr[k]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the desired sum value");
		s=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==s) {
					if(!(map.containsValue(arr[i])))
						map.put(arr[i], arr[j]);
				}
			}
		}
		for(Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println("("+m.getKey()+","+m.getValue()+")");
		}
	}
}