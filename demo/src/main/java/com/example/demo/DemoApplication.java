package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.tool.MathFunctions;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		MathFunctions function=new MathFunctions();
		System.out.println(function.add(15, 10));
		System.out.println(function.sub(15,10));
		
		System.out.println("Making the changes after code is pushed to remote repository");
	}
}
