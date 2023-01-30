package com.BikkadIT.DISetterInjection.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.DISetterInjection.Dao.StudentDao;

@Service
public class StudentService {

	
	private StudentDao studentDao;
	
	
	@Autowired
	public void setStudentDao(StudentDao studentDao) {
		System.out.println("StudentService Class Setter");
		
		this.studentDao = studentDao;
	}



	public void ServiceMethod() {
		
		
		System.out.println("Service Method");
	
	studentDao.DaoMetho();
	
	}
	
}
