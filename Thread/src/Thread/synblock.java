package Thread;

class SynchTest {
      void printNumber(int n)
      {  
            synchronized(this)
            {
                  System.out.println("Table of "+n);
                  System.out.println("==========");
                  for(int i=1;i<=10;i++)
                  {  
                        System.out.println(n+" * "+i+" = "+(n*i));  
                        try
                        {  
                              Thread.sleep(400);  
                        }
                        catch(Exception e)
                        {
                              System.out.println(e);
                        }  
                  }  
            }  
      }
}
class MyThread1 extends Thread
{  
      SynchTest t;  
      MyThread1(SynchTest t)
      {
            this.t=t;  
      }  
      public void run()
      {
            t.printNumber(7);  
      }  
}
public class synblock
{  
      public static void main(String args[])
      {  
            SynchTest obj = new SynchTest();  
            MyThread1 t1=new MyThread1(obj);
            t1.start();     
      }  
}