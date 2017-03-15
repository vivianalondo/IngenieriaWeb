
package com.edu.udea.iw.dao;
import java.util.List;

import com.edu.udea.iw.dto.Ciudad;
import com.edu.udea.iw.exception.MyException;

/**
 * Esta es la Interface para definir los elementos que va a proveer
 * @author: Sandra Viviana Londo�o C
 * @version: 14/03/2017 1.0
 */

public interface CiudadDAO {
	/*
	 * M�todo que entrega la lista completa de las ciudades existentes en la base de datos
	 */
	public List<Ciudad> obtener() throws MyException;
	/*
	 * M�todo para filtrar ciudades por codigo
	 */
	public Ciudad obtener(Long codigo) throws MyException;
}//Cierra la interface
