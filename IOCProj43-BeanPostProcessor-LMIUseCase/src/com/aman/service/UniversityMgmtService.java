package com.aman.service;

import org.springframework.beans.BeanUtils;

import com.aman.bo.EmployeeBO;
import com.aman.bo.StudentBO;
import com.aman.dao.UniversityDAO;
import com.aman.dto.EmployeeDTO;
import com.aman.dto.StudentDTO;

public abstract class UniversityMgmtService {
	
	private UniversityDAO dao;

	public UniversityMgmtService(UniversityDAO dao) {
		this.dao = dao;
	}
	
	public abstract StudentBO createStudentBO();
	public abstract EmployeeBO createEmployeeBO();
	
	public String registerStudent(StudentDTO dto) {
		
		StudentBO stBO = null;
		int count = 0;
		
		//Create BO Class Object
		stBO = createStudentBO();
		//Convert DTO to BO
		BeanUtils.copyProperties(dto, stBO);
		
		count = dao.insertStudentData(stBO);
		
		if(count==0)
			return "Registration Not Succeeded";
		else 
			return "Registration Succeeded";
		
	}
	
	public String registerEmployee(EmployeeDTO dto) {
		
		EmployeeBO empBO = null;
		int count = 0;
		
		//create BO Class Object
		empBO = createEmployeeBO();
		//convert DTO to BO
		BeanUtils.copyProperties(dto, empBO);
		
		count = dao.insertEmployeeData(empBO);
		
		if(count==0)
			return "Registration Not Succeeded";
		else
			return "Registration Succeeded";
		
		
	}

}
