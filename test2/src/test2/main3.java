package test2;
import java.util.Scanner;

public class main3 {
	   public static Candidate getCandidateDetails() throws InvalidSalaryException{
	        System.out.println("Enter candidate details");
	        Scanner in = new Scanner(System.in);
	        System.out.println("Name");
	        String name=in.nextLine();
	        System.out.println("gender");
	        String gender=in.nextLine();
	        System.out.println("Ecxpected Salary");
	        Double expectedSalary=in.nextDouble();
	        Candidate candidate = new Candidate();
	        if(expectedSalary<10000) {
	                throw new InvalidSalaryException("Registration Failed .Salary cannot be less than 10000");
	            }
	        else
	            {
	                candidate.setExpectedSalary(expectedSalary);
	                return candidate;
	            }
	   }
	   public static void main(String[] args){
	        try {
	           Candidate c = getCandidateDetails();
	            System.out.println("Registration Succesful");
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }     
	   }
}
