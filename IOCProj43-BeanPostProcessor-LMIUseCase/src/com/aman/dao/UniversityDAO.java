package com.aman.dao;

import com.aman.bo.EmployeeBO;
import com.aman.bo.StudentBO;

public interface UniversityDAO {
	
	public int insertStudentData(StudentBO bo);
	public int insertEmployeeData(EmployeeBO bo);
	

}
