package spring1;

import java.awt.SystemColor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {

		 
		BeanFactory context= new ClassPathXmlApplicationContext("bean1.xml");
//		Employee e1=(Employee) context.getBean("empObj");
//		Employee e1=context.getBean(Employee.class);
		
		Employee e1=context.getBean("empObj",Employee.class);	
		
		Employee e2=context.getBean("empObj",Employee.class);
		System.out.println("before setter"+ e1);
		System.out.println("before setter"+ e2);
		System.out.println("is it singleton? "+ context.isSingleton("empObj"));
		e1.setName("pravin");
		e2.setName("ganga");
		 
//		e1.setSalary(123213);
//		e1.setId(3);
//		e1.setName("nandhini");
//		e1.setCity("Chennai");
//		
		
		System.out.println(e1);
		System.out.println(e2);
//		Employee e1 = new Employee();
//		Employee e2 = new Employee();
//		e1.setId(12);
//		e1.setName("devi");
//		
//		System.out.println(e1);
		

	}

}
