package com.aman.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOContainerMonitoringLogicConfiguration implements ApplicationListener {
	
	private long start, end;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
     // System.out.println(event.toString());	
		if(event.toString().contains("Refreshed")) {
		start=System.currentTimeMillis();
	}
		else if(event.toString().contains("Closed")) {
			end=System.currentTimeMillis();
			System.out.println("IOContainer has Stayed in Execution "+(end-start)+"ms");
		 
		}
	}

}
