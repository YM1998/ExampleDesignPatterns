package com.patterns.creacionales.factory;

public class FormaPagoCreate {

	
	public static FormaPago buildPayment(FormaPagoEnum formaPago) {
		switch (formaPago) {
		case EFECTIVO:
			return new FormaPagoEfectivo();
		case TARJETA:
			return new FormaPagoTarjeta();
		default:
			return new FormaPagoEfectivo();
		}
	}
	
}
