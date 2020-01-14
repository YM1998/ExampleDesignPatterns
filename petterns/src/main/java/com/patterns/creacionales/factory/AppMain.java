package com.patterns.creacionales.factory;

public class AppMain {

	public static void main(String[] args) {
		FormaPago efectivo=FormaPagoCreate.buildPayment(FormaPagoEnum.EFECTIVO);
		efectivo.realizarPago();
		
		FormaPago tarjeta=FormaPagoCreate.buildPayment(FormaPagoEnum.TARJETA);
		tarjeta.realizarPago();
		
	}
	
}
