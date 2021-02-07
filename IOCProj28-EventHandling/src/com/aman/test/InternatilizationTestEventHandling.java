package com.aman.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InternatilizationTestEventHandling {

	public static void main(String[] args) {
		
		Locale locale = null, locale1 = null;
		ApplicationContext ctx  = null;
		String cap1 = null, cap2 = null, cap3 = null, cap4 = null;
		JFrame frame = null;
		JButton btn1=null, btn2=null, btn3=null, btn4=null;
		
		
		ctx = new ClassPathXmlApplicationContext("com/aman/cfgs/applicationContext.xml");
		locale = new Locale(args[0],args[1]);
		locale1 = new Locale("fr", "FR");
		
		//Get message
		cap1 = ctx.getMessage("btn.cap1", new Object[] {"कर्मचारी"}, "msg1", locale);
		cap2 = ctx.getMessage("btn.cap2", new Object[] {}, "msg2", locale);
		cap3 = ctx.getMessage("btn.cap3", new Object[] {}, "msg3", locale);
		cap4 = ctx.getMessage("btn.cap4", new Object[] {}, "msg4", locale);
		String cap11=ctx.getMessage("btn.cap1",new Object[] {"dept"}, "msg1", locale1);
		System.out.println(cap11);
		
		
		//Create Frame
		frame = new JFrame();
		frame.setTitle("EventHandling");
		frame.setLayout(new FlowLayout());
        frame.setSize(400, 500);
        
        btn1 = new JButton(cap1);
        btn2 = new JButton(cap2);
        btn3 = new JButton(cap3);
        btn4 = new JButton(cap4);
        
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Close Container
        
		((AbstractApplicationContext) ctx).close();
		

	}

}
