package de.jd.a.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conntion {
	private static final String DRIVER="org.gjt.mm.mysql.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/shoppingcar";
	private static final String USER="root";
	private static final String PSW="123456";
	
	private Connection conn=null;
	
	public Connection getConnerctions() {
		try {
			Class.forName(DRIVER);
			conn= DriverManager.getConnection(URL, USER, PSW);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return conn;
	}
	
	public void close(Connection conn,PreparedStatement pasm,ResultSet rs) {
		
			try {
				if(rs!=null) {
				rs.close();
			} 
				if(pasm!=null) {
					pasm.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}	catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	} 
}
