package com.aman.beans;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {

		@Autowired
		@Qualifier("dtdc")
		private courier courier;
		
		public Flipkart() {
		System.out.println("Flipkart-0:paramConstructor");
		}
		
		public void setCourier(courier courier) {
			this.courier = courier;
		}
		
		
		public String  purchase(String items[]) {
			
			//generate order id
			Random rad = new Random();
			int orderid = rad.nextInt(700000);
			
			//deliver product
			String status = courier.deliver(orderid);
			return status+" Bill amount for order id "+orderid +" is 700000";
			
		}
	

}
