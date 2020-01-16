package com.patterns.comportamiento.state;

public class Context {

	private IState state;
	
	public Context() {
		state=null;
	}

	
	public void currentState() {
		if(state!=null)
		   state.currentState();
	}
	
	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}
	
	
	
	
	
	
}
