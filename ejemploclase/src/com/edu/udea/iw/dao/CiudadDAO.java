package com.edu.udea.iw.dao;
import java.util.List;

import com.edu.udea.iw.dto.Ciudad;
import com.edu.udea.iw.exception.MyException;

/*Interface para definir los elementos que va a proveer*/
public interface CiudadDAO {
	/*Entrega la lista completa de la base de datos*/
	public List<Ciudad> obtener() throws MyException;
	/*Método para filtrar ciudades por código*/
	public Ciudad obtener(Long codigo) throws MyException;
}
