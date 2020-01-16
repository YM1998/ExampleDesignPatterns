package com.patterns.comportamiento.templateMethod;

import com.patterns.comportamiento.templateMethod.FactoryTipoTarjeta.TIPOS_TARJETA;

public class AppMain {

	public static void main(String[] args) {
		TemplateMethod template=FactoryTipoTarjeta.buildTipoTarjeta(TIPOS_TARJETA.VISA);
		template.RealizarPago();
		
		System.out.println("--------------");
		
		TemplateMethod template2=FactoryTipoTarjeta.buildTipoTarjeta(TIPOS_TARJETA.MASTERCARD);
		template2.RealizarPago();
	}
	
}
