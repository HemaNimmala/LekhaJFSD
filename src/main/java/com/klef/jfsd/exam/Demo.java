package com.klef.jfsd.exam;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo 
{
	public static void main(String[] args) 
	  {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee)context.getBean("empbean");
		System.out.println(e.toString());
		context.close();
	  }
}
