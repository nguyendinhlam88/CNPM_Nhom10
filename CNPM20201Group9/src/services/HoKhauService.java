package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.text.SimpleDateFormat;

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
				hoKhau = new HoKhau(resultSet.getInt(1),  resultSet.getString(2), resultSet.getString(3), resultSet.getString(5), resultSet.getInt(11));
				danhSachHoKhau.add(hoKhau);
				while(resultSet.next()) {
					hoKhau = new HoKhau(resultSet.getInt(1),  resultSet.getString(2), resultSet.getString(3), resultSet.getString(5), resultSet.getInt(11));
					danhSachHoKhau.add(hoKhau);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
                }
		return  danhSachHoKhau;	
	}
	
        public static int themHoKhau(HoKhau hoKhau){
            Connection conn = null;
            PreparedStatement preStatement = null;
            ResultSet resultSet = null;
            String sql;
            SimpleDateFormat fmt;
            try {
                fmt = new SimpleDateFormat("yyyy-MM-dd");
                conn = (Connection) ConnectToDB.getConnection();
                sql = "INSERT INTO hokhautable(sohokhau, tenchuho, makhuvuc, diachi, ngaytao, ngaychuyendi, lydochuyen, nguoithuchien, ghichu, diem) values (?,?,?,?,?,?,?,?,?,?)";
                preStatement = conn.prepareStatement(sql);
                preStatement.setString(1, hoKhau.getSoHoKhau());
                preStatement.setString(2, hoKhau.getTenChuHo());
                preStatement.setString(3, hoKhau.getMakhuVuc());
                preStatement.setString(4, hoKhau.getDiaChi());
                preStatement.setString(5, fmt.format(hoKhau.getNgayTao()));
                preStatement.setString(6, fmt.format(hoKhau.getNgayChuyenDi()));
                preStatement.setString(7, hoKhau.getLyDoChuyen());
                preStatement.setString(8, hoKhau.getNguoiThucHien());
                preStatement.setString(9, hoKhau.getGhiChu());
                preStatement.setString(10, Integer.toString(hoKhau.getDiemTichLuy()));
                preStatement.executeUpdate();

                return 1;
            }catch (Exception e) {
                    //e.printStackTrace();
                    return 0;
                }
        }
        
        public static List<HoKhau> layDanhSachHoKhau() {
		Connection conn = null;
		PreparedStatement preStatement = null;
		ResultSet resultSet = null;
		String sql;
		List<HoKhau>  danhSachHoKhau = null;
		
		try {
                    danhSachHoKhau = new ArrayList<HoKhau>();
                    conn = (Connection) ConnectToDB.getConnection();
                    sql = "SELECT * FROM hokhautable WHERE sohokhau != '0'";
                    preStatement = conn.prepareStatement(sql);
                    resultSet = preStatement.executeQuery();

                    if(resultSet.isBeforeFirst() == false) {
                        return null;
                    } else {
                        while(resultSet.next()) {
                            HoKhau hoKhau = new HoKhau(resultSet.getInt("idhokhau"), resultSet.getString("sohokhau"), resultSet.getString("tenchuho"), resultSet.getString("diachi"), resultSet.getInt("diem"));
//                            hoKhau.setIdHoKhau(resultSet.getInt("idhokhau"));
//                            hoKhau.setSoHoKhau(resultSet.getString("sohokhau"));
//                            hoKhau.setTenChuHo(resultSet.getString("tenchuho"));
                            hoKhau.setMakhuVuc(resultSet.getString("makhuvuc"));
//                            hoKhau.setDiaChi(resultSet.getString("diachi"));
                            hoKhau.setNgayTao(resultSet.getDate("ngaytao"));
                            hoKhau.setNgayChuyenDi(resultSet.getDate("ngaychuyendi"));
                            hoKhau.setLyDoChuyen(resultSet.getString("lydochuyen"));
                            hoKhau.setNguoiThucHien(resultSet.getString("nguoithuchien"));
                            hoKhau.setGhiChu(resultSet.getString("ghichu"));
//                            hoKhau.setDiemTichLuy(resultSet.getInt("diem"));
                            danhSachHoKhau.add(hoKhau);
                        }
                        resultSet.close();
                    }
		} catch (Exception e) {
                    //e.printStackTrace();
                }
		return  danhSachHoKhau;	
	}
        
        public static HoKhau timHoKhau(String sohokhau) {
            HoKhauService hoKhauService = new HoKhauService();
            List<HoKhau> danhSachHoKhau = hoKhauService.layDanhSachHoKhau();
            for (HoKhau i : danhSachHoKhau) {
                if ( sohokhau.equals(i.getSoHoKhau())) {
                    return i;
                }
            }
            return null;
        }  
    
    public int capNhatHoKhau (HoKhau hoKhau, String sohokhau){
        Connection conn = null;
        PreparedStatement preStatement = null;
        String sql;
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try{
            conn = (Connection) ConnectToDB.getConnection();
            sql="UPDATE hokhautable SET sohokhau=? ,tenchuho=?, makhuvuc=?, diachi=?, ngaytao=?, ngaychuyendi=?, lydochuyen=?, nguoithuchien=?, ghichu=? WHERE sohokhau=?";
            preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, hoKhau.getSoHoKhau());
            preStatement.setString(2, hoKhau.getTenChuHo());
            preStatement.setString(3, hoKhau.getMakhuVuc());
            preStatement.setString(4, hoKhau.getDiaChi());
            preStatement.setString(5, fmt.format(hoKhau.getNgayTao()));
            preStatement.setString(6, fmt.format(hoKhau.getNgayChuyenDi()));
            preStatement.setString(7, hoKhau.getLyDoChuyen());
            preStatement.setString(8, hoKhau.getNguoiThucHien());
            preStatement.setString(9, hoKhau.getGhiChu());
            preStatement.setString(10, sohokhau);
            preStatement.executeUpdate();
            return 1;
        }catch (Exception ex) {
              ex.printStackTrace();
              return 0;
        }   
    }    
    
     public void capNhatTenChuHo(String tenChuHo, String soHoKhau){
            Connection conn = null;
            PreparedStatement preStatement = null;
            String sql;
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
            try{
                conn = (Connection) ConnectToDB.getConnection();
                sql="UPDATE hokhautable SET tenchuho=? WHERE sohokhau=?";
                preStatement=conn.prepareStatement(sql);

                preStatement.setString(1, tenChuHo);
                preStatement.setString(2, soHoKhau);

                preStatement.executeUpdate();
            }catch (Exception ex) {
                 ex.printStackTrace();

            }   
       }
     public static List<HoKhau> XuatDiem() {
		Connection conn = null;
		PreparedStatement preStatement = null;
		ResultSet resultSet = null;
		String sql;
		List<HoKhau>  danhSachHoKhau = null;
		
		try {
                    danhSachHoKhau = new ArrayList<HoKhau>();
                    conn = (Connection) ConnectToDB.getConnection();
                    sql = "SELECT * FROM hokhautable order by diem desc";
                    preStatement = conn.prepareStatement(sql);
                    resultSet = preStatement.executeQuery();

                    if(resultSet.isBeforeFirst() == false) {
                        return null;
                    } else {
                        while(resultSet.next()) {
                            HoKhau hoKhau = new HoKhau(resultSet.getInt("idhokhau"), resultSet.getString("sohokhau"), resultSet.getString("tenchuho"), resultSet.getString("diachi"), resultSet.getInt("diem"));
//                            hoKhau.setIdHoKhau(resultSet.getInt("idhokhau"));
//                            hoKhau.setSoHoKhau(resultSet.getString("sohokhau"));
//                            hoKhau.setTenChuHo(resultSet.getString("tenchuho"));
                            hoKhau.setMakhuVuc(resultSet.getString("makhuvuc"));
//                            hoKhau.setDiaChi(resultSet.getString("diachi"));
                            hoKhau.setNgayTao(resultSet.getDate("ngaytao"));
                            hoKhau.setNgayChuyenDi(resultSet.getDate("ngaychuyendi"));
                            hoKhau.setLyDoChuyen(resultSet.getString("lydochuyen"));
                            hoKhau.setNguoiThucHien(resultSet.getString("nguoithuchien"));
                            hoKhau.setGhiChu(resultSet.getString("ghichu"));
//                            hoKhau.setDiemTichLuy(resultSet.getInt("diem"));
                            danhSachHoKhau.add(hoKhau);
                        }
                        resultSet.close();
                    }
		} catch (Exception e) {
                    //e.printStackTrace();
                }
		return  danhSachHoKhau;	
	}
    public void capNhapDiem (HoKhau hoKhau){
        Connection conn = null;
        PreparedStatement preStatement = null;
        String sql;
        try{
            conn = (Connection) ConnectToDB.getConnection();
            sql="UPDATE hokhautable SET diem = ? WHERE sohokhau=?";
            preStatement=conn.prepareStatement(sql);
            preStatement.setInt(1, hoKhau.getDiemTichLuy());
            preStatement.setString(2, hoKhau.getSoHoKhau());
            preStatement.executeUpdate();
        }catch (Exception ex) {
              ex.printStackTrace();
        }   
    }       
}
