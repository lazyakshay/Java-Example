package java_example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ParameterizedINSERTQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		String SQL = "insert into fruits values(?,?,?)";
	
		try {
			conn = DBUtil.buildConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, "Sweetlime");
			pstmt.setString(2, "Sour");
			pstmt.setString(3, "Green");
			int uc = pstmt.executeUpdate();
			System.out.println(uc + " record inserted...");
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			try{
				pstmt.close();
				conn.close();
			} catch (SQLException e){
				e.printStackTrace();
			}
		}

	}

}
