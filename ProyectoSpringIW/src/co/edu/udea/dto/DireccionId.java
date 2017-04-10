package co.edu.udea.dto;

import java.io.Serializable;

/**
 * Esta es la clase que contiene la información del la dirección id para la clave primaria de la clase Direccion.
 * @author: Viviana Londoño
 * @version: 1.0
 */
public class DireccionId implements Serializable {
	private Long codigo;
	private Cliente cliente;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
