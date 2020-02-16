package com.patterns.comportamiento.observable;

public class Observable1 implements Observable{

	private static final String name="Observable1";
	
	@Override
	public void update(ISubject subject) {
		System.out.println(name+"------"+subject.getResult());
	}

}
