package co.edu.udea.dao;

import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

/**
 * Interface para definir los m�todos de usuario
 * @author Viviana Londo�o
 *
 */
public interface UsuarioDAO {

	/**
	 * 
	 * @param Recibe el login
	 * @return Retorna el usuario con el login ingresado
	 * @throws MyException
	 */
	public Usuario obtener(String login) throws MyException; 
}