package com.aman.dao;

import com.aman.bo.EmployeeBO;
import com.aman.bo.StudentBO;

public class UniversityDAOImpl implements UniversityDAO {
	
	public UniversityDAOImpl() {
		System.out.println("UniversityDAOImpl:0-Param Constructor");
	}

	@Override
	public int insertStudentData(StudentBO bo) {
		System.out.println("inserting student Data::"+bo);
		return 1;
	}

	@Override
	public int insertEmployeeData(EmployeeBO bo) {
		System.out.println("inserting Employee Data::"+bo);
		return 1;
	}

}
