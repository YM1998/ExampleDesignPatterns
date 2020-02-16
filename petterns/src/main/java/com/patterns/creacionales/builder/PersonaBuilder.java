package com.patterns.creacionales.builder;


public class PersonaBuilder {

	 private Persona persona;
	 
	
	  public PersonaBuilder(int id) {
		  persona=new Persona();
	  }
	
	
	  public PersonaBuilder nombre(String nombre) {
		   this.persona.setNombre(nombre);
		   return this;
		}
		
		public PersonaBuilder apellido(String apellido) {
			this.persona.setApellido(apellido);
			return this;
		}
		
		public PersonaBuilder telefono(String telefono) {
			this.persona.setTelefono(telefono);
			return this;
		}
		
		public PersonaBuilder direccion(String direccion) {
			this.persona.setDireccion(direccion);
			return this;
		}
		
		public PersonaBuilder celular(String celular) {
			this.persona.setCelular(celular);
			return this;
		}
		
		public Persona build() {
			return persona;
		}
}
