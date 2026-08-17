package springwithautowireanno4;

import java.awt.SystemColor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {

		 
 		BeanFactory context= new ClassPathXmlApplicationContext("bean10.xml");
		Employee e1=context.getBean("employee",Employee.class);	
	 
		 ChennaiAddress c = context.getBean("chennaiAddress",ChennaiAddress.class);

		 HydAddress h = context.getBean("hydAddress",HydAddress.class);
 
		e1.setId(2);
		e1.setName("p");
		e1.setSalary(232323);

		
c.setCity("Chennai");
	
h.setCity("Hyd");
		System.out.println(e1);
		

	}

}
