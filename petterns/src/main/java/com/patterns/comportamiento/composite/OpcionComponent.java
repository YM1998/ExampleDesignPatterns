package com.patterns.comportamiento.composite;

public abstract class OpcionComponent {

	protected Opcion opcion;
	

	public OpcionComponent(Opcion opcion) {
		super();
		this.opcion = opcion;
	}

	public abstract void getTreet();
	
	
	public abstract void add(OpcionComponent component);

	public Opcion getOpcion() {
		return opcion;
	}

	public void setOpcion(Opcion opcion) {
		this.opcion = opcion;
	}
	
	
	
	
}
