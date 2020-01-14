package com.patterns.comportamiento.chainResponsability;

public class FormaEfectivo implements IFormaPago {

	private IFormaPago next;
	
	
	public void setNext(IFormaPago formaPago) {
		this.next=formaPago;
		
	}

	public IFormaPago getNext() {		
		return next;
	}

	public void request(Integer monto) {
		if(monto>=100 && monto<200) {
			System.out.println("Efectivo .......");
			return;
		}
		
		if(next!=null)
		   next.request(monto);
		
	}

}
