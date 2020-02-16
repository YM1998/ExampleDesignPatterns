package com.patterns.comportamiento.templateMethod;

public abstract class TemplateMethod {
	
	protected abstract void conectar();
	protected abstract void ejecutarPago();
	protected abstract void terminarPago();
	
	public void RealizarPago(){
		System.out.println("Metodo pago para trasancciones bancarias");
		conectar();
		ejecutarPago();
		terminarPago();
	}
	

}
