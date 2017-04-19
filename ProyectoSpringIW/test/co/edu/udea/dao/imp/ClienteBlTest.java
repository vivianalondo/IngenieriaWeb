package co.edu.udea.dao.imp;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.bl.ClienteBl;
import co.edu.udea.dao.ClienteDAO;
import co.edu.udea.dto.Cliente;
import co.edu.udea.exception.MyException;

@RunWith(SpringJUnit4ClassRunner.class)//Anotacion para correr la prueba con otro runner
@Transactional //Anotación para indicar que la clase es de tipo transaccional 
@ContextConfiguration(locations="classpath:SpringConfig.xml") //Anotación para decirle a spring donde está el archivo de configuración de spring y cargarlo al inicio

public class ClienteBlTest {
	
	@Autowired //Para decirle que lo inyecte -- Inicializa la variables(Spring lo hace)
	private ClienteBl clienteBl;
	
	@Test
	public void testObtener() {
		List<Cliente> resultado = null;
		
		try{
			resultado = clienteBl.obtener();
			for(Cliente cliente:resultado){
			    System.out.println(cliente.getNombres());
			}
			assertTrue(resultado.size()>0);
		}catch(MyException e){
			fail(e.getMessage());
		}
	}

}
