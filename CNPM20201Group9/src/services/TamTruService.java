/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import model.TamTru;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Vu
 */
public class TamTruService {
    public static List<TamTru> layDanhSachTamTru(){
        Connection conn = null;
        PreparedStatement preStatement = null;
        ResultSet resultSet = null;
        String sql;
        List<TamTru>  danhSachTamTru = null;

        try{
            danhSachTamTru = new ArrayList<TamTru>();
            conn = (Connection) ConnectToDB.getConnection();
            sql = "SELECT * FROM tamtrutable;";
            preStatement=conn.prepareCall(sql);
            resultSet = preStatement.executeQuery();
            
            while(resultSet.next()){
                TamTru tamTru = new TamTru();
                tamTru.setMaGiayTamTru(resultSet.getString("magiaytamtru"));
                tamTru.setMaDinhDanh(resultSet.getString("madinhdanh"));
                tamTru.setSoDienThoai(resultSet.getString("sodienthoai"));
                tamTru.setTuNgay((resultSet.getDate("tungay")));
                tamTru.setDenNgay(resultSet.getDate("denngay"));
                tamTru.setLyDo(resultSet.getString("lydo"));
                tamTru.setTinhTrang(resultSet.getString("tinhtrang"));
                danhSachTamTru.add(tamTru);
            }
        }catch (Exception ex) {
              //ex.printStackTrace();
        }   
        return danhSachTamTru;
    }
    
    public int themTamTru(TamTru tamTru) {
        Connection conn = null;
        PreparedStatement preStatement = null;
        String sql;
        SimpleDateFormat fmt;
        
        try{
            fmt = new SimpleDateFormat("yyyy-MM-dd");
            conn = (Connection) ConnectToDB.getConnection();
            sql = "INSERT INTO tamtrutable(magiaytamtru, madinhdanh, sodienthoai, tungay, denngay, lydo, tinhtrang) VALUES (?,?,?,?,?,?,?)";
            preStatement=conn.prepareStatement(sql);
            preStatement.setString(1, tamTru.getMaGiayTamTru());
            preStatement.setString(2, tamTru.getMaDinhDanh());
            preStatement.setString(3, tamTru.getSoDienThoai());
            preStatement.setString(4, fmt.format(tamTru.getTuNgay()));
            preStatement.setString(5, fmt.format(tamTru.getDenNgay()));
            preStatement.setString(6, tamTru.getLyDo());
            preStatement.setString(7, tamTru.getTinhTrang());
            preStatement.executeUpdate();
            return 1;
        }catch (Exception ex) {
              //ex.printStackTrace();
              return 0;
        }   
    }
    
    public int capNhatTamTru(TamTru tamTru, String magiaytamtrucu){
        Connection conn = null;
        PreparedStatement preStatement = null;
        String sql;
        SimpleDateFormat fmt;
        try{
            fmt = new SimpleDateFormat("yyyy-MM-dd");
            conn = (Connection) ConnectToDB.getConnection();
            sql="UPDATE tamtrutable SET magiaytamtru=?, sodienthoai=?, tungay=?, denngay=?, lydo=? WHERE magiaytamtru=?";
            preStatement=conn.prepareStatement(sql);
            
            preStatement.setString(1, tamTru.getMaGiayTamTru());
            preStatement.setString(2, tamTru.getSoDienThoai());
            preStatement.setString(3, fmt.format(tamTru.getTuNgay()));
            preStatement.setString(4, fmt.format(tamTru.getDenNgay()));
            preStatement.setString(5, tamTru.getLyDo());
            preStatement.setString(6, magiaytamtrucu);
            preStatement.executeUpdate();
            return 1;
        }catch(Exception ex){
            ex.printStackTrace();
            return 0;
        }
    }
    
    public TamTru timTamTru(String magiaytamtru){
        TamTruService tamTruService = new TamTruService();
        List<TamTru> danhSachTamTru = tamTruService.layDanhSachTamTru();
        for (TamTru i : danhSachTamTru) {
            if ( magiaytamtru.equals(i.getMaGiayTamTru())) {
                return i;
            }
        }
        return null;
    }
}
