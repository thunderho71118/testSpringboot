
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
		SpringApplication.run(Application.class, args);
	}

}