package ejemploclase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ciudades {
	
	public static void main(String[] args){
		consultarCiudades();
	}
		
		//Función para consultar ciudades
		public static void consultarCiudades(){
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemploclase","root","root");
				ps = con.prepareStatement("select *from ciudades");
				rs = ps.executeQuery();
				
				while (rs.next()){
					System.out.println(rs.getString("codigo")+":"+rs.getString("Nombre"));
				}
			}catch (ClassNotFoundException e){
				e.printStackTrace();
			}catch (SQLException e){
				e.printStackTrace();
			}finally{
				try{
					rs.close();
					ps.close();
					con.close();
				}catch (SQLException e){
					
				}
		
			}
			
		}

}
