package com.patterns.creacionales.builder;

public class AppMain {

	public static void main(String[] args) {
		
		Persona persona= Persona.build(1).
				  nombre("Yesid")
				 .apellido("Murillo")
				 .celular("3128373")
				 .build();
		System.out.println(persona);
	}
}
