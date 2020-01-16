package com.patterns.comportamiento.state;

import java.lang.Thread.State;

public class AppMain {

	public static void main(String[] args) {
		Context contex=new Context();
		
		contex.setState(FactoryState.buildState(StateEnum.START));
		contex.currentState();
		
		contex.setState(FactoryState.buildState(StateEnum.STOP));
		contex.currentState();
	}
	
}
