
package com.edu.udea.iw.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.edu.udea.iw.exception.MyException;

//Clase para la conexion a la base de datos
public class DataSource {
	
	//Función para obtener la conexión
	public static Connection getConnection() throws MyException{
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemploclase","root","root");
		
		}catch(ClassNotFoundException e){
			throw new MyException("Driver no encontrado",e);
		}catch (SQLException e){
			throw new MyException("No puede establecer conexion",e);
		}
		return con;
	}
}
