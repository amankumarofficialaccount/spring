package com.aman.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aman.dto.StudentDTO;
import com.aman.service.StudentService;
import com.aman.vo.StudentVO;

@Component("controller")
public final class MainController {
	
	@Autowired
	private StudentService service;

	
	public String processStudent(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		//Convert VO class obj data to DTO class object
		dto=new StudentDTO();
		dto.setSno(vo.getSno());
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use Service class object
		result=service.generateResult(dto);
		return result;
	}

}
