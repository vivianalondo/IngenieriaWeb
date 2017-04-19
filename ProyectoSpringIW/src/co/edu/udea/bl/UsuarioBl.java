package co.edu.udea.bl;

import java.util.List;

import co.edu.udea.dao.UsuarioDAO;
import co.edu.udea.dto.Cliente;
import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

public class UsuarioBl {
	
	private UsuarioDAO usuarioDAO;

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	
	/**
	 *Método para validar el usuario dados su login y pw 
	 * @throws MyException 
	 * 
	 **/
	public void validar(String login, String contrasena) throws MyException{
		//Validar que los campos no sean nulos
		if(login==null|| "".equals(login)){
			throw new MyException("La cédula no puede estar vacía");
		}
		if(login==null|| "".equals(login)){
			throw new MyException("Los apellidos no puede estar vacía");
		}
		//Validar que el usuario exista, utilizando el método de usuarioDAO
		Usuario usuario = usuarioDAO.obtener(login);
		if (usuario==null) {
			throw new MyException("Usuario no existe en el sistema");
		}else{
			if(usuario.getContrasena()==contrasena){
				System.out.println("Felicidades si existes para mi base de datos");
			}
		}
	}
	

}
