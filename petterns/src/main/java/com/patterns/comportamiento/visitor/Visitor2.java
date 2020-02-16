package com.patterns.comportamiento.visitor;

public class Visitor2 implements IVisitor{

	private static final String visitador="Visitador2";
	
	public void visit(Element1 element) {
		System.out.println(visitador+"...."+element.getElemento());
	}

	public void visit(Element2 element) {
		System.out.println(visitador+"...."+element.getElemento());
		
	}

	public void visit(Element3 element) {
		System.out.println(visitador+"...."+element.getElemento());
		
	}

}
