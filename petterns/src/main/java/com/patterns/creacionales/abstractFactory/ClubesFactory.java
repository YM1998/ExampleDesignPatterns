package com.patterns.creacionales.abstractFactory;

public class ClubesFactory implements IAbstractFactory<IClubes>{

	public IClubes create(int opcion) {
		if(opcion==Parametros.BARCELONA) {
			return new EquBarcelona();
		}else if(opcion==Parametros.CALI) {
			return new EquCali();
		}
		
		return null;
	}
}
