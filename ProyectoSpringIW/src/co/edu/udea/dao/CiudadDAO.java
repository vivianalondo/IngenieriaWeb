package co.edu.udea.dao;

import java.util.List;

import co.edu.udea.dto.Ciudad;
import co.edu.udea.exception.MyException;

/**
 * Interface para definir los métodos de ciudad
 * @author Viviana Londoño
 * @version 1.0
 */
public interface CiudadDAO {

		/**
		 * 
		 * @return Entrega la lista completa de las ciudades que se encuentran en la BD
		 * @throws MyException
		 */
		public List<Ciudad> obtener() throws MyException;
		
		/**
		 * 
		 * @param Se le envía el código de la ciudad que se desea obtener
		 * @return Retorna una ciudad según el código pasado por parametro 
		 * @throws MyException
		 */
		public Ciudad obtener(Long codigo) throws MyException; 
		
		/**
		 * 
		 * @param Se le envía un objeto de la ciudad que se desea guardar
		 * @throws MyException
		 */
		public void guardar(Ciudad ciudad) throws MyException;
}
