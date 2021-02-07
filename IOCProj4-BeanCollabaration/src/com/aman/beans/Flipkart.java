package com.aman.beans;

import java.util.Random;

public class Flipkart {

		
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
