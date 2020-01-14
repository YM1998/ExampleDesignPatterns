package com.patterns.creacionales.abstractFactory;

public class FactoryGeneric {

	
	public static IAbstractFactory getFactory(int factory) {
		if(factory==Parametros.FACTORY_SELECCIONES)
			return new SeleccionFactory();
		else if(factory==Parametros.FACTORY_CLUBES)
			return new ClubesFactory();
		
		return null;
	}
	
}
