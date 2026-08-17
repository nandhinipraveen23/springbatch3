package springwithautowireanno3;

import java.awt.SystemColor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {

		 
 		BeanFactory context= new ClassPathXmlApplicationContext("bean9.xml");
		Employee e1=context.getBean("employee",Employee.class);	
	 
		 
 
		e1.setId(2);
		e1.setName("p");
		e1.setSalary(232323);

		

	
		System.out.println(e1);
		

	}

}
