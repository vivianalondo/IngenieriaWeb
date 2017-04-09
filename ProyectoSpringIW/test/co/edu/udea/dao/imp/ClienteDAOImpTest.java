package co.edu.udea.dao.imp;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.dao.ClienteDAO;
import co.edu.udea.dto.Cliente;
import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

@RunWith(SpringJUnit4ClassRunner.class)//Anotaciones para correr la prueba con otro runner
@Transactional //Para decir que la clase es de tipo transacional 
@ContextConfiguration(locations="classpath:SpringConfig.xml") //Decirle a spring donde está el archivo de config. de spring para que cargue al inicio

public class ClienteDAOImpTest {

	@Autowired //Para decirle que lo inyecte -- Inicializa la variables(Spring lo hace)
	private ClienteDAO clienteDAO;
	
	@Test
	public void testObtener() {
		List<Cliente> resultado = null;
		
		try{
			resultado = clienteDAO.obtener();
			for(Cliente cliente:resultado){
			    System.out.println(cliente.getNombres());
			}
			assertTrue(resultado.size()>0);
		}catch(MyException e){
			fail(e.getMessage());
		}
	}

	@Test
	public void testGuardar() {
		Cliente cliente = null;
		Usuario usuario= null;
		
		try{
			cliente = new Cliente();
			cliente.setCedula("3344");
			cliente.setNombres("Sandra Viviana");
			cliente.setApellidos("Londono");
			cliente.setEmail("sviviana.londono@udea.edu.co");
			
			usuario = new Usuario();
			usuario.setLogin("elver");
			cliente.setUsuarioCrea(usuario);
			cliente.setFechaCreacion(new Date());
			clienteDAO.guardar(cliente);
			
		}catch(MyException e){
			fail(e.getMessage());
		}
	}

}
