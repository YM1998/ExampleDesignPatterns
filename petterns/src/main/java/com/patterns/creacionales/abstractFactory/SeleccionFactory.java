package com.patterns.creacionales.abstractFactory;

import org.w3c.dom.views.AbstractView;

public class SeleccionFactory implements IAbstractFactory<INaciones>{

	
	public INaciones create(int opcion) {
		if(opcion==Parametros.ARGENTINA) {
			return new EquArgentina();
		}else if(opcion==Parametros.COLOMBIA) {
			return new EquColombia();
		}
		
		return null;
	}
	

}
