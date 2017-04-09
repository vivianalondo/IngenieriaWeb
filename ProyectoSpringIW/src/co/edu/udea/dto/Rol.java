package co.edu.udea.dto;

/**
 * Esta es la clase que contiene la información básica del rol, setters y getters POJO.
 * @author: Sandra Viviana Londoño C
 * @version: 23/03/2017 1.0
 */

public class Rol {
	private String codigo;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
}
