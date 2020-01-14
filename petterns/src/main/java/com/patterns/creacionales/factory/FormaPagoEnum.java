package com.patterns.creacionales.factory;

public enum FormaPagoEnum {

	TARJETA(1),EFECTIVO(2);
	
	private int id;
	
	private FormaPagoEnum(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
}
