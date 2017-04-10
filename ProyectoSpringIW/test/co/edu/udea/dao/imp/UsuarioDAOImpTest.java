package co.edu.udea.dao.imp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.dao.UsuarioDAO;
import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

/**
 * Test para hacer las pruebas de los métodos de Usuario
 * @author: Viviana Londoño
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)//Anotacion para correr la prueba con otro runner
@Transactional //Anotación para indicar que la clase es de tipo transaccional 
@ContextConfiguration(locations="classpath:SpringConfig.xml") //Anotación para decirle a spring donde está el archivo de configuración de spring y cargarlo al inicio

public class UsuarioDAOImpTest {
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Test
	public void testObtener() {
		Usuario usuario = null;
		try
		{
			usuario = usuarioDAO.obtener("elver");
			assertEquals(usuario.getNombres(), "Elver");
			System.out.println("Nombre " + usuario.getNombres() + " Rol:" +usuario.getRol().getNombre());
		}
		catch(MyException e)
		{
			fail(e.getMessage());
		}
	}

}
