package recap;

public class swap {

	public static void main(String[] args) {
		int i=5;
		int j=6;
		System.out.println("initial value of i and j is "+i+" "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("reversed value of i and j is "+i+" "+j);
	}

}
