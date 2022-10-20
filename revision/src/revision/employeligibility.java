package revision;

	 abstract class employee{
		protected int employeeId;
		protected String employeeName;
		protected double salary;
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	 abstract void calculateSalary();
}
	 class PermanentEmployee extends employee{
		 private double basicPay;
		 
		public double getBasicPay() {
			return basicPay;
		}

		public void setBasicPay(double basicPay) {
			this.basicPay = basicPay;
		}

	
		public PermanentEmployee(int employeeId,String employeeName,double basicPay) {
			super();
			this.basicPay = basicPay;
		}

		public void calculateSalary() {
			double PFAmount = basicPay * 0.12;
			double salary= PFAmount + basicPay;
			setSalary(salary);
		}
}
	 class TemporaryEmployee extends employee{
		 private int hoursWorked;
		 private int hourlyWages;
		 public int getHoursWorked() {
			return hoursWorked;
		}
		public void setHoursWorked(int hoursWorked) {
			this.hoursWorked = hoursWorked;
		}
		public int getHourlyWages() {
			return hourlyWages;
		}
		public void setHourlyWages(int hourlyWages) {
			this.hourlyWages = hourlyWages;
		}
		TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages){
			super();
			this.hourlyWages= hourlyWages;
			this.hoursWorked= hoursWorked;
		}
		void calculateSalary() {
			double salary = hoursWorked*hourlyWages;
			setSalary(salary);
		} 
}
	 class Loan{
		 public double CalculateLoanAmount(employee Employeeobj) {
			double loan=0.0;
			if(Employeeobj instanceof PermanentEmployee) {
				loan = 0.15*Employeeobj.getSalary();
			}else if(Employeeobj instanceof TemporaryEmployee) {
				loan = 0.10*Employeeobj.getSalary();
			}
			return loan;
			 
		 }
	 }
public class employeligibility {

	public static void main(String args[]) {
		 PermanentEmployee permanentemployee = new PermanentEmployee(101,"suhail",22000);
	        TemporaryEmployee temporaryemployee = new TemporaryEmployee(102,"nivya",6,1000);
	        
	        permanentemployee.calculateSalary();
	        temporaryemployee.calculateSalary();
	        
	        
	        Loan loan=new Loan();
	        
	        double permanentEmployeeLoan = loan.CalculateLoanAmount(permanentemployee);
	        double temporaryEmployeeLoan = loan.CalculateLoanAmount(temporaryemployee);
	        
	        System.out.println("Permanent Employee Salary:"+permanentemployee.getSalary());
	        System.out.println("permanent employee loan:"+permanentEmployeeLoan);
	        
	        System.out.println();
	        
	        System.out.println("Temporary Employee Salary:"+temporaryemployee.getSalary());
	        System.out.println("Temporary employee loan:"+temporaryEmployeeLoan);	
	}
}
