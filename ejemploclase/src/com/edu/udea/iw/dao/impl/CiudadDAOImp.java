package com.edu.udea.iw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edu.udea.iw.dao.CiudadDAO;
import com.edu.udea.iw.dao.DataSource;
import com.edu.udea.iw.dto.Ciudad;
import com.edu.udea.iw.exception.MyException;

public class CiudadDAOImp implements CiudadDAO{
	
	@Override
	public List<Ciudad> obtener() throws MyException {
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		List<Ciudad> lista = new ArrayList<Ciudad>();
		
		try{
			con = DataSource.getConnection();
			ps = con.prepareStatement("select * from ciudades");
			rs = ps.executeQuery();
			while(rs.next()){
				Ciudad ciudad = new Ciudad();
				ciudad.setCodigo(rs.getLong("codigo"));
				ciudad.setNombre(rs.getString("nombre"));
				ciudad.setCodigoArea(rs.getString("codigoArea"));
				lista.add(ciudad);
			}
			
		}catch(SQLException e){
			throw new MyException("Error consultando", e);
			
		}finally{
			try{
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			}catch(SQLException e){
				throw new MyException("Error cerrando", e);
			}
		}
		
		return lista;
	}
	
	/*Implementación del método para obtener ciudades por código*/
	@Override
	public Ciudad obtener(Long codigo) throws MyException {
	
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		Ciudad ciudad = null;
		
		try{
			con = DataSource.getConnection();
			ps = con.prepareStatement("select * from ciudades where codigo = ?");
			ps.setLong(1, codigo);
			rs = ps.executeQuery();
			if (rs.next()){
				ciudad = new Ciudad();
				ciudad.setCodigo(rs.getLong("codigo"));
				ciudad.setNombre(rs.getString("nombre"));
				ciudad.setCodigoArea(rs.getString("codigoArea"));
			}
			
		}catch(SQLException e){
			throw new MyException("Error consultando", e);
			
		}finally{
			try{
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (con != null)
					con.close();
			}catch(SQLException e){
				throw new MyException("Error cerrando", e);
			}
		}
		
		return ciudad;
	}
}
