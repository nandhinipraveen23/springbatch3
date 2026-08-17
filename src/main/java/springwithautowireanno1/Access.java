package springwithautowireanno1;

import java.awt.SystemColor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {

		 
 		BeanFactory context= new ClassPathXmlApplicationContext("bean7.xml");
		Employee e1=context.getBean("employee",Employee.class);	
	 
		Address a1= context.getBean("address",Address.class);
	 
		a1.setDoorno(2);
		a1.setCity("Chennai");
		a1.setPincode(1233);

		e1.setId(2);
		e1.setName("p");
		e1.setSalary(232323);

		

	
		System.out.println(e1);
		

	}

}
