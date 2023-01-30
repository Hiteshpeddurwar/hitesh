package com.BikkadIT.DISetterInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.DISetterInjection.Controller.StudentController;

@SpringBootApplication
public class DiSetterInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DiSetterInjectionApplication.class, args);
	
		StudentController studentController = run.getBean(StudentController.class);
	
	studentController.ControllerMethod();
	}

}
