package practicalsession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

	public static void main(String[] args) {
		
	ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
	Laptop lap=(Laptop)context.getBean("laptop");
	System.out.println(lap);
	
	 Person per=(Person)context.getBean("person"); 
	 System.out.println(per);
	 
	}
	
}
