package com.patterns.comportamiento.templateMethod;

public class Visa extends TemplateMethod{

	@Override
	public void conectar() {
		System.out.println("Conectandose a Visa");
		
	}

	@Override
	public void ejecutarPago() {
		System.out.println("Ejecutando pago en  Visa");
		
	}

	@Override
	public void terminarPago() {
		System.out.println("pago terminado  Visa");
		
	}

}