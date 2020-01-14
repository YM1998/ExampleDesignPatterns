package com.patterns.comportamiento.chainResponsability;



public class AppMain {

	public static void main(String[] args) {
		HandleRequest handle=new  HandleRequest();
		handle.request(99);			
		handle.request(87);
		handle.request(101);
		handle.request(105);
		handle.request(200);
		handle.request(300);
		handle.request(10000);
		
	}
}
