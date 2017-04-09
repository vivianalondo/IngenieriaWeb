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

@RunWith(SpringJUnit4ClassRunner.class)//Anotaciones para correr la prueba con otro runner
@Transactional //Para decir que la clase es de tipo transacional 
@ContextConfiguration(locations="classpath:SpringConfig.xml") //Decirle a spring donde está el archivo de config. de spring para que cargue al inicio

public class CIudadDAOImpTest {
	
	@Autowired //Para decirle que lo inyecte -- Inicializa la variables(Spring lo hace)
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
