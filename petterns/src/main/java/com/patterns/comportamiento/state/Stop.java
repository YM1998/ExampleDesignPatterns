package com.patterns.comportamiento.state;

public class Stop implements IState{

	public void changeState(Context context) {
		System.out.println("Deteniendo ......");
	}

	public void currentState() {
		System.out.println("Detenido------");
	
	}
}
