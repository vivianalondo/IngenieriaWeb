package co.edu.udea.dao;

import java.util.List;

import co.edu.udea.dto.Cliente;
import co.edu.udea.exception.MyException;

/**
 * Interface para definir los m�todos del cliente en el sistema
 * @author Viviana Londo�o
 *
 */
public interface ClienteDAO {

	
	/**
	 * Obtener todos los clientes de la base de datos ordenados por su fecha de creacion
	 * @return
	 * @throws MyException
	 */
	public List<Cliente> obtener()  throws MyException;
	public void guardar(Cliente cliente) throws MyException;
}
