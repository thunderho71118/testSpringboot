
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("maybe run issue1!!!");

		System.out.println("other people modify!!!");

		SpringApplication.run(Application.class, args);
	}

}