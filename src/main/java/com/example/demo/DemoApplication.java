package com.example.demo;

//import org.apache.catalina.core.ApplicationContext;
import  org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		System.out.println("beginning application!");
		ApplicationContext context = (ApplicationContext) SpringApplication.run(DemoApplication.class, args);
		System.out.println("start application!");

		Outfit outfit = context.getBean(Outfit.class);
		System.out.println("Instance: " + outfit);
		outfit.wear();
	}

}
