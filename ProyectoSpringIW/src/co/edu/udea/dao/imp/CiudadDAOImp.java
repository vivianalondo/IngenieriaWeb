package co.edu.udea.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edu.udea.dao.CiudadDAO;
import co.edu.udea.dto.Ciudad;
import co.edu.udea.exception.MyException;

public class CiudadDAOImp implements CiudadDAO{
	
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
	
	@Override
	public List<Ciudad> obtener() throws MyException {
		List<Ciudad> ciudades = new ArrayList<>();
		Session session = null;
		
	try {
		//session = DataSource.getInstance().getSession();
		session = sessionFactory.getCurrentSession();
		//Usamos criteria cuando hay una condición en la bd 
		Criteria criteria = session.createCriteria(Ciudad.class);
		ciudades = criteria.list();
	} 
	catch (HibernateException e) {
		throw new MyException("Error consultando ciudades", e);
		}
	
	return ciudades;
	}

	@Override
	public Ciudad obtener(Long codigo) throws MyException {
		Ciudad ciudad= new Ciudad();
		Session session = null;
		try{
			session = sessionFactory.getCurrentSession();
			ciudad = (Ciudad) session.get(Ciudad.class,codigo);
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando ciudades", e);
		}
		return ciudad;
	}

	@Override
	public void guardar(Ciudad ciudad) throws MyException {
		Session session = null;
		try
		{
			//session = DataSource.getInstance().getSession();
			session = sessionFactory.getCurrentSession();
			session.save(ciudad);
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando ciudades", e);
		}// TODO Auto-generated method stub
			
	}

}
