package co.edu.udea.dao;

import java.util.List;

import co.edu.udea.dto.Ciudad;
import co.edu.udea.exception.MyException;

/**
 * Interface para definir los m�todos de ciudad
 * @author Viviana Londo�o
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
		 * @param Se le env�a el c�digo de la ciudad que se desea obtener
		 * @return Retorna una ciudad seg�n el c�digo pasado por parametro 
		 * @throws MyException
		 */
		public Ciudad obtener(Long codigo) throws MyException; 
		
		/**
		 * 
		 * @param Se le env�a un objeto de la ciudad que se desea guardar
		 * @throws MyException
		 */
		public void guardar(Ciudad ciudad) throws MyException;
}
