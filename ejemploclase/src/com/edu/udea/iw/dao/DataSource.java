
package com.edu.udea.iw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.edu.udea.iw.exception.MyException;


/**
 * Esta es la clase para la conexion a la base de datos, utilizando singleton pattern
 * @author: Sandra Viviana Londo�o C
 * @version: 14/03/2017 1.0
 */

public class DataSource {
	
	//Creamos la variable privada para la conexi�n
	private static Connection con=null;
	
	/*
	 * M�todo para obtener la conexi�n.
	 * Se crea el m�todo est�tico que verifica si ya existe una instancia de la variable con,
	 * si esta ya existiera (con!=null) la retorna y termina el m�todo.
	 */
	public static Connection getConnection() throws MyException{
		
		try{
			if (con==null){
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemploclase","root","");
			}
		}catch(ClassNotFoundException e){
			throw new MyException("Driver no encontrado",e);
		}catch (SQLException e){
			throw new MyException("No puede establecer conexion",e);
		}
		return con;
	}
			
		
}
