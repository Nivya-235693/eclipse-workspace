package JAVA8;
public class dateandtime {

	public static void main(String[] args) {
		System.out.println("Current Date: "+java.time.LocalDate.now());
		System.out.println("Current Time: "+java.time.LocalTime.now()); 
		System.out.println("Current Date & Time: "+java.time.LocalDateTime.now());
	}
}
