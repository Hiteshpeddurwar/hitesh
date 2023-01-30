package com.BikkadIT.DISetterInjection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.stereotype.Controller;

import com.BikkadIT.DISetterInjection.Service.StudentService;

@Controller
public class StudentController {
	
	
	
	private StudentService studentservice;
	
	
	
	
	@Autowired
	public void setStudentservice(StudentService studentservice) {
		
		this.studentservice = studentservice;
	System.out.println("Student Controller Class Setter");
	}




	public void ControllerMethod() {
		
		
		System.out.println("Controller Method");
		
		studentservice.ServiceMethod();
	}

}
