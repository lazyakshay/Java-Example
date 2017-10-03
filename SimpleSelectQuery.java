package java_example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SimpleSelectQuery {
	
	public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.buildConnection();
			stmt = conn.createStatement();
			String SQL = "select * from fruits";
			rs = stmt.executeQuery(SQL);
			while(rs.next()){
				String name = rs.getString(1);
				String taste = rs.getString(2);
				String color = rs.getString(3);
				System.out.println(name + ","+ taste + ","+ color);
				
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try {
			rs.close();
			stmt.close();
			conn.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

}
