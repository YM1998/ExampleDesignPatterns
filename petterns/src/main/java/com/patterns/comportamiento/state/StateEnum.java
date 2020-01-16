package com.patterns.comportamiento.state;

public enum StateEnum {

   START(1),STOP(2);
	
	private int id;
	
	private StateEnum(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	
}
