package com.patterns.comportamiento.chainResponsability;

public class FormaBlack implements IFormaPago {

	private IFormaPago next;
	

	public void request(Integer monto) {
		if(monto<100) {
			System.out.println("Tarjeta Black .......");
			return;
		}
		
		if(next!=null)
		   next.request(monto);
		
	}
	

	public void setNext(IFormaPago formaPago) {
		this.next=formaPago;
		
	}

	public IFormaPago getNext() {		
		return next;
	}

}
