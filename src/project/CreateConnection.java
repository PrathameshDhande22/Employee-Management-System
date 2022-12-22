package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Creates the connection with the MYSQL Database using JDBC;
 * 
 * @author Prathamesh
 *
 */
public class CreateConnection {
	final private static String url = "jdbc:mysql://localhost:3306/employee";
	final private static String password = "prathamesh";
	final private static String username = "root";
	private static Connection con;

	public static Connection createc() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
