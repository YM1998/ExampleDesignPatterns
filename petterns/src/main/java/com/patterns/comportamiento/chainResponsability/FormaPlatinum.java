package com.patterns.comportamiento.chainResponsability;

public class FormaPlatinum implements IFormaPago {

	private IFormaPago next;
	
	
	public void setNext(IFormaPago formaPago) {
		this.next=formaPago;
		
	}

	public IFormaPago getNext() {		
		return next;
	}

	public void request(Integer monto) {
		if(monto>=200 && monto<400) {
			System.out.println("Tarjeta Platinumm .......");
			return;
		}
		
		if(next!=null)
		   next.request(monto);
		
	}

}
