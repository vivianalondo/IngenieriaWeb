package com.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

/**
 * Clase para generar casos de prueba de los métodos de la clase CiudadDAO
 * @author: Sandra Viviana Londoño C
 * @version: 14/03/2017 1.0
 */

import java.util.List;

import org.junit.Test;

import com.edu.udea.iw.dao.CiudadDAO;
import com.edu.udea.iw.dto.Ciudad;
import com.edu.udea.iw.exception.MyException;

public class CiudadDAOImpTest {

	/*
	 * Método para hacer pruebas al método que gnera la lista de las ciudades
	 */
	@Test
	public void testObtener() {
		CiudadDAO ciudadDAO = null;
		List<Ciudad> lista = null;
		try{
			ciudadDAO = new CiudadDAOImp();
			lista = ciudadDAO.obtener();
			assertTrue(lista.size()>0);
			
		}catch (MyException e){
			e.printStackTrace();
			fail (e.getMessage());
		}
	}
	
	/*
	 * Método para hacer pruebas al método que trae una ciudad según su código
	 */
	public void testObtener1() {
		CiudadDAO ciudadDAO = null;
		Ciudad ciudad = null;
		try{
			ciudadDAO = new CiudadDAOImp();
			ciudad = ciudadDAO.obtener(1l);
			assertTrue(ciudad!=null);
			
		}catch (MyException e){
			e.printStackTrace();
			fail (e.getMessage());
		}
	}

}
