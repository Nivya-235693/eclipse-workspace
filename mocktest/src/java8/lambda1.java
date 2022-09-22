package java8;

interface MyFunctionalInterface {

	//A method with single parameter
    public int incrementByFive(int a);
}
public class lambda1 {

   public static void main(String args[]) {
        // lambda expression with single parameter num
    	MyFunctionalInterface f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
    }
}


