package com.patterns.comportamiento.templateMethod;

public class MasterCard extends TemplateMethod{

	@Override
	public void conectar() {
		System.out.println("Conectandose a Master");
		
	}

	@Override
	public void ejecutarPago() {
		System.out.println("Ejecutando pago en  Master");
		
	}

	@Override
	public void terminarPago() {
		System.out.println("pago terminado  Master");
		
	}

}
