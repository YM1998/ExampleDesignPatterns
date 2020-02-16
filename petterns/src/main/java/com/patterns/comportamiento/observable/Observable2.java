package com.patterns.comportamiento.observable;

public class Observable2 implements Observable{

	private static final String name="Observable2";
	
	@Override
	public void update(ISubject subject) {
		System.out.println(name+"------"+subject.getResult());
	}

}

