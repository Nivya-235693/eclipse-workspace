package recap3;

public class lowertriangle {

	public static void main(String[] args) {
		int rows, cols;  
		int a[][] = {{1, 2, 3},{8, 4, 6}, {4, 5, 7}};
		rows = a.length;    
        cols = a[0].length;
		if(rows != cols){    
            System.out.println("Matrix should be a square matrix");    
        }    
        else {    
            System.out.println("Lower triangular matrix: ");    
            for(int i = 0; i < rows; i++){    
                for(int j = 0; j < cols; j++){    
                  if(j > i)    
                    System.out.print("0 ");    
                  else    
                    System.out.print(a[i][j] + " ");    
              }    
              System.out.println();    
          }    

	}
	}
}
