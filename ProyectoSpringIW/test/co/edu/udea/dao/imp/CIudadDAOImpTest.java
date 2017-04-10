package co.edu.udea.dao.imp;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.dao.CiudadDAO;
import co.edu.udea.dto.Ciudad;
import co.edu.udea.exception.MyException;

/**
 * Test para hacer las pruebas de los métodos de Ciudad
 * @author: Viviana Londoño
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)//Anotacion para correr la prueba con otro runner
@Transactional //Anotación para indicar que la clase es de tipo transaccional 
@ContextConfiguration(locations="classpath:SpringConfig.xml") //Anotación para decirle a spring donde está el archivo de configuración de spring y cargarlo al inicio

public class CIudadDAOImpTest {
	
	@Autowired //Para indicar la inyeccion
	private CiudadDAO ciudadDAO;

	public void testObtener() {
		List <Ciudad> ciudades = null;
		try{
			ciudades = ciudadDAO.obtener();
			assertTrue(ciudades.size()>0);   
			
		}
		catch(MyException e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	
	@Test
	public void testObtener1() {
		Ciudad ciudad = null;
		try
		{
			ciudad = ciudadDAO.obtener(1l);
			assertEquals(ciudad.getNombre(),"Medellin");
		}
		catch(MyException e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	

}
