package com.BikkadIT.DISetterInjection.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	
	public void DaoMetho() {
		
		
		
		
		System.out.println("Dao Method");
	}

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	System.out.println("Dao Contructor Setter");
	}
	
	
}
