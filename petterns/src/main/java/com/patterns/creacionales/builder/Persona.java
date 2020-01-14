package com.patterns.creacionales.builder;

public class Persona {

	private final int id;
	private final String nombre;
	private final String apellido;
	private final String direccion;
	private final String telefono;
	private final String celular;
	
	private Persona(PersonaBuilder builder) {
		this.id=builder.id;
		this.nombre=builder.nombre;
		this.apellido=builder.apellido;
		this.direccion=builder.direccion;
		this.telefono=builder.telefono;
		this.celular=builder.celular;
	}
	
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", celular=" + celular + "]";
	}


	public static class PersonaBuilder{
		
		private  int id;
		private  String nombre;
		private  String apellido;
		private  String direccion;
		private  String telefono;
		private  String celular;
		
		
		public PersonaBuilder(int id,String nombre) {
		   this.nombre=nombre;
		   this.id=id;
		}
		
		public PersonaBuilder apellido(String apellido) {
			this.apellido=apellido;
			return this;
		}
		
		public PersonaBuilder telefono(String telefono) {
			this.telefono=telefono;
			return this;
		}
		
		public PersonaBuilder direccion(String direccion) {
			this.direccion=direccion;
			return this;
		}
		
		public PersonaBuilder celular(String celular) {
			this.celular=celular;
			return this;
		}
		
		public Persona build() {
			return new Persona(this);
		}
		
		
	}
	
	
}
