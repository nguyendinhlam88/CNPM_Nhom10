package services;

import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectToDB {
	public static Connection getMysqlConnection(String dbName) throws SQLException, ClassNotFoundException{
		String hostName = "localhost";
		String userName = "root";
		String password = "";
		
		//Class.forName("com.mysql.jdbc.Driver");
		String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useUnicode=true&characterEncoding=utf-8";
		Connection conn = (Connection) DriverManager.getConnection(connectionUrl, userName, password);
		return conn;
	}
}
