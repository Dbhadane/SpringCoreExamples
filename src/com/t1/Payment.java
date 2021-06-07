package com.t1;

public class Payment {
		 private int price;
	     private Order order;
	     
	     public Payment() {
			// TODO Auto-generated constructor stub
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		@Override
		public String toString() {
			return "Payment [price=" + price + ", order=" + order + "]";
		}
	     
		
	   
	}


