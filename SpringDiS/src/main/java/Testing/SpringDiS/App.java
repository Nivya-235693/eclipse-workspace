package Testing.SpringDiS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("person.xml");  
    	System.out.println("welcome ");
    	Person  c =context.getBean("person",Person.class);
    	c.display();
    	
    			  
    			  
    }
}
