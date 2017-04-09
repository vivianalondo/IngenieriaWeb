package co.edu.udea.dao;

import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

/**
 * @author Viviana Londo�o
 *
 */
public interface UsuarioDAO {

	/**
	 * 
	 * @param login
	 * @return
	 * @throws MyException
	 */
	public Usuario obtener(String login) throws MyException; 
}