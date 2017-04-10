package co.edu.udea.dao;

import java.util.List;

import co.edu.udea.dto.Cliente;
import co.edu.udea.exception.MyException;

/**
 * Interface para definir los métodos de cliente
 * @author Viviana Londoño
 * @version 1.0
 */
public interface ClienteDAO {

	
	/**
	 * 
	 * @return Retorna la lista de los clientes que se encuentran en la BD ordenados por fecha 
	 * @throws MyException
	 */
	public List<Cliente> obtener()  throws MyException;
	
	/**
	 * 
	 * @param Se le envía el objeto cliente que se desea guardar
	 * @throws MyException
	 */
	public void guardar(Cliente cliente) throws MyException;
}
