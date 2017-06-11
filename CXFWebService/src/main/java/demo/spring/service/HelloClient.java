package demo.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {
	
	public static void main(String[] args) {
		
	
		System.out.println("First Commit after checkout");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
		HelloWorld client = (HelloWorld)context.getBean("helloClient");
		client.sayHi("World");
		
	}
	

}
