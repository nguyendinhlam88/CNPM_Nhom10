package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import model.BuoiHop;

public class BuoiHopService {
	private static Connection conn;
	
	public static List<BuoiHop> layDanhSachBuoiHop() {
		PreparedStatement preStatement = null;
		ResultSet resultSet = null;
		String sql;
		List<BuoiHop>  danhSachBuoiHop = null;
		BuoiHop buoiHop;
		
		try {
			danhSachBuoiHop = new ArrayList<BuoiHop>();
			conn = (Connection) ConnectToDB.getConnection();
			sql = "SELECT * FROM buoihoptable";
			preStatement = conn.prepareStatement(sql);
			resultSet = preStatement.executeQuery();
			
			if(resultSet.isBeforeFirst() == false) {
				return null;
			} else {
				resultSet.next();
				buoiHop = new BuoiHop(resultSet.getString(1), resultSet.getString(2), resultSet.getDate(3), resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6));
				danhSachBuoiHop.add(buoiHop);
				while(resultSet.next()) {
					buoiHop = new BuoiHop(resultSet.getString(1), resultSet.getString(2), resultSet.getDate(3), resultSet.getString(4), resultSet.getInt(5), resultSet.getString(6));
					danhSachBuoiHop.add(buoiHop);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return  danhSachBuoiHop;	
	}
	
//	public static void updateBuoiHopTable(List<BuoiHop> danhSachBuoiHop) {
////		String sql = "Drop table BuoiHop";
//	}
}
