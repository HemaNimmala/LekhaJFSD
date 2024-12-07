package com.klef.jfsd.exam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course c = context.getBean(Course.class, "coursebean");
		System.out.println(c.toString());
		context.close();
	}
}
