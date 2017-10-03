package java_example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection buildConnection() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Driver loaded");
		String URL = "jdbc:oracle:thin:@localhost:1521:XE";
		String UID = "system";
		String PWD = "oracle";
		Connection conn = DriverManager.getConnection(URL, UID, PWD);
		System.out.println("Connected..");
		return conn;
	}

}
