package com.patterns.comportamiento.chainResponsability;

public interface IFormaPago {

	public void setNext(IFormaPago formaPago);
	
	public IFormaPago getNext();
	
	public void request(Integer monto);
	
	
}
