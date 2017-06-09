package demo.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"webapp/WEB-INF/spring-config.xml"});
		HelloWorld client = (HelloWorld)context.getBean("helloClient");
		client.sayHi("World");
		
	}
	

}
