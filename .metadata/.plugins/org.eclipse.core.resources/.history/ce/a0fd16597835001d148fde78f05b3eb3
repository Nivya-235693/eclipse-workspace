package List;
import java.io.*;

class Fibona extends Thread
{
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
               System.out.print("Enter the Limit for fabonacci: ");
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               int n = Integer.parseInt(br.readLine());
               System.out.println("\n=================================");
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

class Reverse extends Thread
{
     public void run()
     {
          try
          {
               System.out.println("\nReverse of 1 to 10 is: ");
               System.out.println("=================================");
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
               System.out.println("\n=================================\n\n");
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

class fibonacci {

	public static void main(String[] args) {
		try
        {
             Reverse rev = new Reverse();
             rev.start();
             Fibona fib = new Fibona();
             fib.start();
             fib.sleep(4000);
        }
        catch (Exception ex)
        {
             ex.printStackTrace();
        }
	}
}
