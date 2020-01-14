package com.patterns.creacionales.abstractFactory;

public class AppMain {

	public static void main(String[] args) {
		IClubes barca=(IClubes)FactoryGeneric.getFactory(Parametros.FACTORY_CLUBES).create(Parametros.BARCELONA);
		System.out.println("Nombre: "+barca.getNombre() + "  Pais: "+barca.getPais() + "   Presupuesto: "+barca.getPresupuesto());
		
		IClubes cali=(IClubes)FactoryGeneric.getFactory(Parametros.FACTORY_CLUBES).create(Parametros.CALI);
		System.out.println("Nombre: "+cali.getNombre() + "  Pais: "+cali.getPais() + "   Presupuesto: "+cali.getPresupuesto());
		
		INaciones colombia=(INaciones)FactoryGeneric.getFactory(Parametros.FACTORY_SELECCIONES).create(Parametros.COLOMBIA);
		System.out.println("Nombre: "+colombia.getNombre() + "  Continente: "+colombia.getContinente() + "   Presupuesto: "+colombia.getPresupuesto());
		
		INaciones argentina=(INaciones)FactoryGeneric.getFactory(Parametros.FACTORY_SELECCIONES).create(Parametros.ARGENTINA);
		System.out.println("Nombre: "+argentina.getNombre() + "  Continente: "+argentina.getContinente() + "   Presupuesto: "+argentina.getPresupuesto());
		
		
	}
}
