package co.edu.udea.dao;

import java.util.List;

import co.edu.udea.dto.Ciudad;
import co.edu.udea.exception.MyException;

/**
 * @author Viviana Londoño
 * @version 1.0
 */
public interface CiudadDAO {

	//Entrega la lista completa de las ciudades en la BD ordenadas por su nombre
	/**
	 * 
	 * @return la lista completa de las ciudades de la bd 
	 * @throws MyException
	 */
		public List<Ciudad> obtener() throws MyException;
		
	/**
	 * 
	 * @param código de la ciudad que se desea obtener
	 * @return una ciudad en base al código pasado por parametro 
	 * @throws MyException
	 */
		public Ciudad obtener(Long codigo) throws MyException; 
		
		public void guardar(Ciudad ciudad) throws MyException;
}
