package spring1withconstructor;

import java.awt.SystemColor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {

		 
		BeanFactory context= new ClassPathXmlApplicationContext("bean2.xml");

		Employee e1=context.getBean("empObj",Employee.class);	
		
		 
 
		System.out.println(e1);
		

	}

}
