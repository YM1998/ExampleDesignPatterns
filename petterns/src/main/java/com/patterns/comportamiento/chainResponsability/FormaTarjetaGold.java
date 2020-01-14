package com.patterns.comportamiento.chainResponsability;

public class FormaTarjetaGold implements IFormaPago {

	private IFormaPago next;
	
	
	public void setNext(IFormaPago formaPago) {
		this.next=formaPago;
		
	}

	public IFormaPago getNext() {		
		return next;
	}

	public void request(Integer monto) {
		if(monto>=400 ) {
			System.out.println("Tarjeta Gold .......");
			return;
		}
		
		if(next!=null)
		   next.request(monto);
		
	}

}

