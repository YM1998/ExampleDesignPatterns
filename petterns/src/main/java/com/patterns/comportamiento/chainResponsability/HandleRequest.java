package com.patterns.comportamiento.chainResponsability;

import java.util.ArrayList;
import java.util.List;

public class HandleRequest implements IFormaPago{

    private IFormaPago next;
	private List<IFormaPago> list;
	
	public HandleRequest() {
		list=new ArrayList<IFormaPago>();
		list.add(new FormaBlack());
		list.add(new FormaEfectivo());
		list.add(new FormaPlatinum());
		list.add(new FormaTarjetaGold());
	}
	
	public void setNext(IFormaPago formaPago) {
		this.next=formaPago;
	}

	public IFormaPago getNext() {		
		return next;
	}

	public void request(Integer monto) {
	  this.setNext(list.get(0));
	  
	  for (int i = 0; i < list.size()-1; i++) 
		   list.get(i).setNext(list.get(i+1));
	  	
	  this.next.request(monto);	  
	}

}
