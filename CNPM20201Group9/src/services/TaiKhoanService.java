package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import model.TaiKhoan;

public class TaiKhoanService {
	
	public static TaiKhoan checkTaiKhoan(String tenTaiKhoan, String matKhau) {
		TaiKhoan taiKhoan = null;
		Connection conn = null;
		PreparedStatement preStatement = null;
		ResultSet resultSet = null;
		String sql;
		
		try {
			conn = (Connection) ConnectToDB.getMysqlConnection("QuanLyDanPho");
			sql = "SELECT * FROM TAIKHOAN WHERE TAIKHOAN = ? AND MATKHAU = ?";
			preStatement = conn.prepareStatement(sql);
			preStatement.setString(1, tenTaiKhoan);
			preStatement.setString(2, matKhau);
			resultSet = preStatement.executeQuery();
			
			if(resultSet.isBeforeFirst() == false) {
				return taiKhoan;
			} else {
				resultSet.next();
				taiKhoan = new TaiKhoan(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return  taiKhoan;	
	}
}
