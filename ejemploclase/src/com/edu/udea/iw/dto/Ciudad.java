/*Autor: Viviana Londoño
 *
 * 
 * */

package com.edu.udea.iw.dto;

public class Ciudad {
	private long codigo;
	private String nombre;
	private String codigoArea;
	
	public long getCodigo(){
		return this.codigo;
	}
	
	public void setCodigo(long codigo){
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigoArea() {
		return codigoArea;
	}

	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
	
}
