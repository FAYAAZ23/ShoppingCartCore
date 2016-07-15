package com.niit.shoppingcartcore;

//import java.lang.reflect.ParameterizedType;

//import org.springframework.context.access.ContextBeanFactoryReference;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Test {
	
	
	public static void main(String[] args){
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcartcore");
		context.refresh();
		context.getBean("category");
    	System.out.println("category is created");
	  product p = (product) context.getBean("product");
	 // category c = context.getBean("cat.object")
	  p.setId("100");
	  p.setName("fayaaz");
	  p.setPrice("1000");
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
	
	}

}
