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
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectToDB {
	/*public static Connection getMysqlConnection(String dbName) throws SQLException, ClassNotFoundException{
		String hostName = "localhost";
		String userName = "root";
		String password = "";
		
		//Class.forName("com.mysql.jdbc.Driver");
		String connectionUrl = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?useUnicode=true&characterEncoding=utf-8";
		Connection conn = (Connection) DriverManager.getConnection(connectionUrl, userName, password);
		return conn;
	}*/
    public static Connection getConnection() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String dbURL="jdbc:mysql://localhost:3306/congnghephanmem?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username= "root";
        String password="qwerty";
        try {
            Class.forName(driver);
            return DriverManager.getConnection(dbURL, username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectToDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
