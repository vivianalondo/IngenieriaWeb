package com.edu.udea.iw.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.edu.udea.iw.dao.CiudadDAO;
import com.edu.udea.iw.dto.Ciudad;
import com.edu.udea.iw.exception.MyException;

public class CiudadDAOImpTest {

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
