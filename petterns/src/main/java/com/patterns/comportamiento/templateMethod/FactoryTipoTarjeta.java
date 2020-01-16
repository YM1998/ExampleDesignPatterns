package com.patterns.comportamiento.templateMethod;

public class FactoryTipoTarjeta {

	
	public static TemplateMethod  buildTipoTarjeta(TIPOS_TARJETA tarjeta) {
		switch (tarjeta) {
		case VISA:
			return new Visa();		
		case MASTERCARD:
			return new MasterCard();					
		default:
			return new Visa();
		}
	}
	
	
	
	public enum TIPOS_TARJETA{
		
		VISA(1),MASTERCARD(2);
		
		private int valor;
		
		private TIPOS_TARJETA(int valor){
			this.valor=valor;
		}
		
		public int getValor() {
			return valor;
		}
		
	}
	
}
