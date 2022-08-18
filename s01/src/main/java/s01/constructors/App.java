package s01.constructors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       @SuppressWarnings("resource")
	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("s01/constructors/SpringConfig.xml");
       
       Employee emp = (Employee) springContainer.getBean("emp"); 
       System.out.println(emp);
    }
}