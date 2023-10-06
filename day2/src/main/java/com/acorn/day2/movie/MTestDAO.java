package com.acorn.day2.movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MTestDAO {
	@Autowired
	DataSource ds;

	public ArrayList<Movie> select() {
		String sql = "select * from movietbl";
		
		ArrayList<Movie> list =  new ArrayList<Movie>();
		
		
		try {
			Connection con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Movie  m = new Movie( );
				m.setTitle(rs.getString(1));
				m.setPrice( rs.getString(2));				
				list.add(m);
			 
			}
			//
			rs.close();
			pst.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}
}
