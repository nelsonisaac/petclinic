package com.SpringExample.SpringPrac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.SpringExample.SpringPrac","componentScanning"})
public class SpringPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPracApplication.class, args);
		
		
		
	//	System.out.println();
	}

}
