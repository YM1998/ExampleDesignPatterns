package com.patterns.comportamiento.state;

public class Start implements IState{

	public void changeState(Context context) {
		System.out.println("Iniciando ......");
	}

	public void currentState() {
		System.out.println("Ejecutandose.........");
	
	}

}
