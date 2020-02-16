package com.patterns.comportamiento.visitor;

public class Element1 implements IElement {

	
	public void accept(IVisitor visitor) {
		visitor.visit(this);		
	}
	
	public String getElemento() {
		return "Elemento1";
	}

}
