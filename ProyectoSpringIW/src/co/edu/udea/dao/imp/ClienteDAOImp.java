package co.edu.udea.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import co.edu.udea.dao.ClienteDAO;
import co.edu.udea.dto.Cliente;
import co.edu.udea.exception.MyException;

/**
 * Clase donde se implementan los m�todos de la interface Cliente
 * @author Viviana Londo�o
 *
 */
public class ClienteDAOImp implements ClienteDAO{
	
private SessionFactory sessionFactory;
	
	

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Implementaci�n del m�todo obtener lista de clientes
	 */
	@Override
	public List<Cliente> obtener() throws MyException {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Session session= null;
		Criteria criteria =null;
		
		try{
			//session = DataSource.getInstance().getSession();
			session = sessionFactory.getCurrentSession();
			criteria = session.createCriteria(Cliente.class);
			criteria.addOrder(Order.asc("fechaCreacion"));  //ordenar criteria
			//Retornar la lista de clientes (select * from clientes order by Fecha Creacion asc;)
			clientes = criteria.list();
		}catch(HibernateException e)
		{
			throw new MyException("Error consultando la lista de clientes", e);
		}
		return clientes;
	}

	
	/**
	 * Implementaci�n del m�todo guardar cliente
	 */
	@Override
	public void guardar(Cliente cliente) throws MyException {
		// TODO Auto-generated method stub
				Session session = null;
				//Transaction tx = null;
				
				try{
					session = sessionFactory.openSession();
					session.save(cliente);
					session.flush();
				}catch(HibernateException e)
				{
					throw new MyException("Ocurri� un error guardando el cliente",e);
				}
		
	}

}
