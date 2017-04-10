package co.edu.udea.dao.imp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edu.udea.dao.UsuarioDAO;
import co.edu.udea.dto.Usuario;
import co.edu.udea.exception.MyException;

/**
 * Clase donde se implementan los m�todos de la interface Usuario
 * @author Viviana Londo�o
 *
 */
public class UsuarioDAOImp implements UsuarioDAO{
	
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
	 * Implementaci�n del m�todo obtener usuario seg�n login
	 */
	@Override
	public Usuario obtener(String login) throws MyException {
		Usuario usuario= new Usuario();
		Session session = null;
		try{
			//session = DataSource.getInstance().getSession();
			session = sessionFactory.getCurrentSession();	
			usuario = (Usuario) session.get(Usuario.class,login);
		}
		catch(HibernateException e)
		{
			throw new MyException("Error consultando ciudades", e);
		}
		return usuario;
	}


}
