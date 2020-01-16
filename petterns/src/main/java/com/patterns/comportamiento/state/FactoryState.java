package com.patterns.comportamiento.state;



public class FactoryState {

	public static IState buildState(StateEnum formaPago) {
		switch (formaPago) {
		case START:
			return new Start();
		case STOP:
			return new Stop();
		default:
			return new Start();
		}
	}
	
	
}
