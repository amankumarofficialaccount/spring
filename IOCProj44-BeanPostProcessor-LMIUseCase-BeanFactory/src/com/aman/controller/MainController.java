package com.aman.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.bpp.DOJBeanPostProcessor;
import com.aman.dto.EmployeeDTO;
import com.aman.dto.StudentDTO;
import com.aman.service.UniversityMgmtService;

public class MainController extends HttpServlet {
	
	//ApplicationContext ctx = null;
	DefaultListableBeanFactory factory  = null;
	XmlBeanDefinitionReader reader  = null;
	
	UniversityMgmtService service  = null;
	
	@Override
	public void init() throws ServletException {
		
		//ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		//get service class Object
		//service = ctx.getBean("userv",UniversityMgmtService.class);
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/aman/cfgs/applicationContext.xml");
		
		//Explicit Registration of Bean Post Processor
		factory.addBeanPostProcessor(new DOJBeanPostProcessor());
		
		service = factory.getBean("userv",UniversityMgmtService.class);
		
	
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name= null;
		String addrs = null;
		String email = null;
		long mobileNo = 0L;
		String desg = null;
		String course = null;
		String cap= null;
		StudentDTO stDTO = null;
		EmployeeDTO empDTO = null;
		String result  = null;
		
		RequestDispatcher rd = null;
		
		//read Form Data
		name = req.getParameter("name");
		email = req.getParameter("email");
		addrs = req.getParameter("addrs");
		mobileNo = Long.parseLong(req.getParameter("mobileNo"));
		cap = req.getParameter("s1");
		
		if(cap.equalsIgnoreCase("registerStudent")) {
			course = req.getParameter("course");
			
			//Prepare Student DTO
			stDTO = new StudentDTO();
			stDTO.setName(name);
			stDTO.setEmail(email);
			stDTO.setAddrs(addrs);
			stDTO.setMobileNo(mobileNo);
			stDTO.setCourse(course);
			
			//use Service
			result = service.registerStudent(stDTO);
			
		}
		
		else {
			
			desg = req.getParameter("desg");
			
			//Prepare Employee Desg
			empDTO = new EmployeeDTO();
			empDTO.setName(name);
			empDTO.setEmail(email);
			empDTO.setAddrs(addrs);
			empDTO.setMobileNo(mobileNo);
			empDTO.setDesg(desg);
			
			//use Service 
			result = service.registerEmployee(empDTO);
		}
		
		//Keep The Result in Request Scope
		req.setAttribute("resultMsg", result);
		//Forward Request To Result Page
		rd = req.getRequestDispatcher("/result.jsp");
		rd.forward(req, res);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  doGet(req,res);
	}
	
	@Override
	public void destroy() {
		service = null;
		//((AbstractApplicationContext) ctx).close();
		factory = null;
	}
	

}
