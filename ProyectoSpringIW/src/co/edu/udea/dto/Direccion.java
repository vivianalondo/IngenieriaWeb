package co.edu.udea.dto;

/**
 * Esta es la clase que contiene la información básica de la dirección, setters y getters POJO.
 * @author: Viviana Londoño
 * @version: 1.0
 */
public class Direccion {
	
	private DireccionId id;
	private String direccion;
	private String telefono;
	private Ciudad ciudad;
	private Boolean preferida;
	
	public DireccionId getId() {
		return id;
	}
	public void setId(DireccionId id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public Boolean getPreferida() {
		return preferida;
	}
	public void setPreferida(Boolean preferida) {
		this.preferida = preferida;
	}
	
	

}
