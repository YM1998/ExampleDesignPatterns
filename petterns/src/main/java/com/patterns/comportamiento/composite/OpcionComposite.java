package com.patterns.comportamiento.composite;

import java.util.ArrayList;
import java.util.List;

public class OpcionComposite extends OpcionComponent{

	private List<OpcionComponent> list;

	public OpcionComposite(Opcion opcion) {
		super(opcion);
		list=new ArrayList<OpcionComponent>();
	}
	
	@Override
	public void getTreet() {
		System.out.println("Padre----"+this.opcion.toString());
		this.list.stream().forEach(x -> x.getTreet());
	}


	@Override
	public void add(OpcionComponent component) {		
		if(validateComponent(component)) 
			list.add(component);
		else
			list.stream().forEach(x->x.add(component));
		
	}
	
	private boolean validateComponent(OpcionComponent component) {
		return component.getOpcion().getIdPapa()==null && this.opcion.getIdPapa()==null ||
			   component.getOpcion().getIdPapa()==this.opcion.getId();
	}
	
	
	
}
