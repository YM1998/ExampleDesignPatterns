package com.patterns.comportamiento.composite;

public class OpcionSheet extends OpcionComponent{

	public OpcionSheet(Opcion opcion) {
		super(opcion);		
	}

	@Override
	public void getTreet() {		
		System.out.println("Hijo----"+this.opcion.toString());
	}


	@Override
	public void add(OpcionComponent component) {
		// TODO Auto-generated method stub
	}

}
