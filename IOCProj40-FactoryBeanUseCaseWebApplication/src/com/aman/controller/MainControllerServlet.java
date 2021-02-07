package com.aman.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aman.service.CBFindScoreService;

public class MainControllerServlet extends HttpServlet {
	
	private ApplicationContext ctx  ;
	private CBFindScoreService service;
	
	@Override
	public void init() throws ServletException {
		
		//Create IOContainer
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		service = ctx.getBean("cbService",CBFindScoreService.class);
	
	}
		
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int mid = 0;
		String score = null;
		RequestDispatcher rd = null;
		
		//read request param values
		mid =Integer.parseInt(req.getParameter("mid"));
		//use Local Service
		score = service.findScore(mid);
		//keep score in request scope
		req.setAttribute("scoreBoard",score);
		//forward to show
		rd = req.getRequestDispatcher("/showScore.jsp");
		rd.forward(req, res);
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	      doGet(req,res);
	}
	
	@Override
	public void destroy() {
       service = null;
       ((AbstractApplicationContext) ctx).close();
	}

}
