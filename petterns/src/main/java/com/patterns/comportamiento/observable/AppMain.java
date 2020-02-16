package com.patterns.comportamiento.observable;

public class AppMain {

	
	public static void main(String[] args) {
		ISubject subject1=new Subject1();
		subject1.attach(new Observable1());
		subject1.attach(new Observable2());
		subject1.setState("Estado1");
		subject1.setState("Estado2");
		
		ISubject subject2=new Subject2();
		subject2.attach(new Observable1());
		subject2.attach(new Observable2());
		subject2.setState("Estado1");
		subject2.setState("Estado2");
	}
}
