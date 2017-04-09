package co.edu.udea.dto;

/**
 * Esta es la clase que contiene la informaci�n b�sica de la ciudad, setters y getters POJO.
 * @author: Sandra Viviana Londo�o C
 * @version: 16/03/2017 1.0
 */

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
