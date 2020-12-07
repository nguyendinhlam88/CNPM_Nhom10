package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;

import model.BuoiHop;
import model.HoKhau;

public class HoKhauService {
	
	public static List<HoKhau> layDanhSachBuoiHop() {
		Connection conn = null;
		PreparedStatement preStatement = null;
		ResultSet resultSet = null;
		String sql;
		List<HoKhau>  danhSachHoKhau = null;
		HoKhau hoKhau;
		
		try {
			danhSachHoKhau = new ArrayList<HoKhau>();
			conn = (Connection) ConnectToDB.getConnection();
			sql = "SELECT * FROM hokhautable";
			preStatement = conn.prepareStatement(sql);
			resultSet = preStatement.executeQuery();
			
			if(resultSet.isBeforeFirst() == false) {
				return null;
			} else {
				resultSet.next();
				hoKhau = new HoKhau(resultSet.getString(1),  resultSet.getString(2), resultSet.getString(3), resultSet.getString(5), resultSet.getInt(7));
				danhSachHoKhau.add(hoKhau);
				while(resultSet.next()) {
					hoKhau = new HoKhau(resultSet.getString(1),  resultSet.getString(2), resultSet.getString(3), resultSet.getString(5), resultSet.getInt(7));
					danhSachHoKhau.add(hoKhau);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
                }
		return  danhSachHoKhau;	
	}
	
//	public static void updateBuoiHopTable(ArrayList<BuoiHop> danhSachBuoiHop) {
////		String sql = "UPDATE TABLE ";
//	}
}
