package com.example.demo;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import  org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void displayAllBeans(ApplicationContext context) {
		String[] allBeans = context.getBeanDefinitionNames();
		System.out.println("all size of bean is : " + allBeans.length);
		for(String beanName : allBeans) {
			System.out.println(beanName);
		}
	}
	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
		System.out.println("beginning application!");
		ApplicationContext context = (ApplicationContext) SpringApplication.run(DemoApplication.class, args);
		System.out.println("start application!");

		displayAllBeans(context);
		//test @componnent
		Outfit outfit = context.getBean(Outfit.class);
//		Outfit outfit = new Bikini();
		System.out.println("outfit instance : " + outfit);
		outfit.wear();

		//test !Autowrite
		Girl girl = context.getBean(Girl.class);
		System.out.println("girl instance: " + girl);
		System.out.println("girl outfit instance: " + girl.outfit);
		girl.outfit.wear();

//		Girl girl2 = new Girl(outfit);
//		System.out.println("girl instance: " + girl2);
//		System.out.println("girl outfit instance: " + girl2.outfit);
//		girl2.outfit.wear();

//		((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
		((BeanDefinitionRegistry) context).removeBeanDefinition("girl");
//		displayAllBeans(context);

	}

}
