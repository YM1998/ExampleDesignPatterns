package com.patterns.comportamiento.composite;

public class Opcion {

	private Integer id;
	private Integer idPapa;
	private String nombre;
	
	public Opcion(Integer id, Integer idPapa, String nombre) {
		super();
		this.id = id;
		this.idPapa = idPapa;
		this.nombre = nombre;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdPapa() {
		return idPapa;
	}
	public void setIdPapa(Integer idPapa) {
		this.idPapa = idPapa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Opcion [id=" + id + ", idPapa=" + idPapa + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
}
