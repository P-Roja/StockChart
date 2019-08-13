package com.StockPricing;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMvcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcExampleApplication.class, args);
	}
	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return (args) -> {
			System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
					Arrays.stream(ctx.getBeanDefinitionNames())
					.sorted()
					.forEach(name->System.out.println(name));
		};
		  
		  
	  }*/
		
		
}
