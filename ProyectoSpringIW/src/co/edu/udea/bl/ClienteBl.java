package co.edu.udea.bl;

import java.util.Date;
import java.util.List;

import co.edu.udea.dao.ClienteDAO;
import co.edu.udea.dao.UsuarioDAO;
import co.edu.udea.dto.Cliente;
import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

public class ClienteBl {
	
	private ClienteDAO clienteDAO;
	private UsuarioDAO usuarioDAO;

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	
	public List<Cliente> obtener() throws MyException{
		return clienteDAO.obtener();
	}
	
	/**
	 * Método para guardar un cliente. Hacemos las validaciones de campos no nulos
	 * 
	 **/
	public void guardar (String cedula, String nombre, String apellidos, String email, String usuarioCrea) throws MyException{
		//Validar que los campos no sean nulos
		if(cedula==null|| "".equals(cedula)){
			throw new MyException("La cédula no puede estar vacía");
		}
		if(apellidos==null|| "".equals(apellidos)){
			throw new MyException("Los apellidos no puede estar vacía");
		}
		if(nombre==null|| "".equals(nombre)){
			throw new MyException("El nombre no puede estar vacía");
		}
		if(email==null|| "".equals(email)){
			throw new MyException("El email no puede estar vacía");
		}
		if(usuarioCrea==null|| "".equals(usuarioCrea)){
			throw new MyException("UsuarioCrea no puede estar vacía");
		}
		//Validar que el correo electrónico sea válido
		
		//Validar que el usuario exista, utilizando el mpetodo de usuarioDAO
		Usuario usuario = usuarioDAO.obtener(usuarioCrea);
		if (usuario==null) {
			throw new MyException("UsuarioCrea no existe en el sistema");
		}
		//Validar que la cédula a ingresar no exista en la bd Crear mpetodo en cliente dao para obtener cliente dado la cédula
		
		//Creamos un objeto cliente y comenzamos a llenarlo
		Cliente cliente = new Cliente();
		cliente.setCedula(cedula);
		cliente.setNombres(nombre);
		cliente.setApellidos(apellidos);
		cliente.setUsuarioCrea(usuario);
		cliente.setEmail(email);
		cliente.setFechaCreacion(new Date());
		cliente.setEliminado(Boolean.FALSE);
	}


}
