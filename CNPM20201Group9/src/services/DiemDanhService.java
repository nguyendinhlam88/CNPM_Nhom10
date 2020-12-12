/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.DiemDanh;

/**
 *
 * @author DELL
 */
public class DiemDanhService {
    public static List<DiemDanh> layDanhSachDiemDanh() {
		Connection conn = null;
		PreparedStatement preStatement = null;
		ResultSet resultSet = null;
		String sql;
		List<DiemDanh> danhSachDiemDanh = null;
		DiemDanh diemDanh;
		
		try {
			danhSachDiemDanh = new ArrayList<DiemDanh>();
			conn = (Connection) ConnectToDB.getConnection();
			sql = "SELECT * FROM diemdanhtable";
			preStatement = conn.prepareStatement(sql);
			resultSet = preStatement.executeQuery();
			
			if(resultSet.isBeforeFirst() == false) {
				return null;
			} else {
				while(resultSet.next()) {
					diemDanh = new DiemDanh(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
					danhSachDiemDanh.add(diemDanh);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
                }
		return  danhSachDiemDanh;	
	}
    public static void themDiemDanh(DiemDanh diemDanh){
            Connection conn = null;
            PreparedStatement preStatement = null;
            ResultSet resultSet = null;
            String sql;
            SimpleDateFormat fmt;
            try {
                fmt = new SimpleDateFormat("yyyy-MM-dd");
                conn = (Connection) ConnectToDB.getConnection();
                sql = "INSERT INTO diemdanhtable(sohokhau,idbuoihop,trangthai) values (?,?,?)";
                preStatement = conn.prepareStatement(sql);
                preStatement.setString(1, diemDanh.getSoHoKhau());
                preStatement.setString(2, diemDanh.getMaBuoiHop());
                preStatement.setString(3, diemDanh.getTrangThai());
                preStatement.executeUpdate();

            }catch (Exception e) {
                    e.printStackTrace();
                }
        }
    public static void capNhapDiemDanh (DiemDanh diemDanh){
        Connection conn = null;
        PreparedStatement preStatement = null;
        String sql;
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try{
            conn = (Connection) ConnectToDB.getConnection();
            sql="UPDATE diemdanhtable SET trangthai = ? WHERE sohokhau=? and idbuoihop =?";
            preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, diemDanh.getTrangThai());
            preStatement.setString(2, diemDanh.getSoHoKhau());
            preStatement.setString(3, diemDanh.getMaBuoiHop());
            preStatement.executeUpdate();
        }catch (Exception ex) {
              ex.printStackTrace();
        }   
    }    
}
