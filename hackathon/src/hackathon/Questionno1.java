package hackathon;
public class Questionno1 {
	public static void main(String[] args) {
		int a[][]={{1,2,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,5,3},{9,2,4}}; 
		System.out.println("The first matrix is ");
		for(int k=0;k<3;k++) {
			for(int m=0;m<3;m++) 
				System.out.print(a[k][m]+" ");
			System.out.println();
		}
		System.out.println("The second matrix is ");
		for(int k=0;k<3;k++) {
			for(int m=0;m<3;m++) 
				System.out.print(b[k][m]+" ");
			System.out.println();
		}
		int c[][]=new int[3][3];
		System.out.println("The sum of the two matrices is:");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
					c[i][j]=a[i][j]+b[i][j];   
					System.out.print(c[i][j]+" ");    
		}    
		System.out.println();
		}
	}
}