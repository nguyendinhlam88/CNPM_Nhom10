package controller;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.HoKhau;
import model.NhanKhau;

public class HoKhauManagerController {
	ArrayList<HoKhau> danhSachHoKhau;
	
	public HoKhauManagerController() {
		danhSachHoKhau = new ArrayList<>();
	}
	
	public void themHoKhau(HoKhau hoKhau) {
		danhSachHoKhau.add(hoKhau);
	}
	
	public void thayDoiHoKhau(HoKhau hoKhau, String tenChuHo, String noiDungThayDoi, String ngayThayDoi) {
		hoKhau.setTenChuHo(tenChuHo);
		hoKhau.setGhiChu(hoKhau.getGhiChu() + "\n" + ngayThayDoi + " : " + noiDungThayDoi);
	}
	
	public void tachHo(HoKhau hoKhau, String maKhuVuc, String diaChi, String soHoKhau, String chuHoMoi, ArrayList<String> danhSachTen) {
		ArrayList<NhanKhau> danhSachNhanKhau = hoKhau.getDanhSachNhanKhau();
		HoKhau hoKhauMoi = new HoKhau("1", soHoKhau, chuHoMoi, diaChi, 0);
		NhanKhau nhanKhau;
		
		danhSachHoKhau.add(hoKhauMoi); 
		
		for(int i = 0; i < danhSachNhanKhau.size(); i++) {
			nhanKhau = danhSachNhanKhau.get(i);
			
			for(int j = 0; j < danhSachTen.size(); j++) {
				if(danhSachTen.get(j).equalsIgnoreCase(nhanKhau.getHoTen())) {
					hoKhauMoi.getDanhSachNhanKhau().add(nhanKhau);
					danhSachNhanKhau.remove(i);
				}
			}
		}
	}
	
	public void chuyenHoKhau(HoKhau hoKhau, Date ngayChuyenDi, String lyDoChuyen, String diaChiMoi) {
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String ngayChuyen  = df.format(ngayChuyenDi);
		
		hoKhau.setNgayChuyenDi(ngayChuyenDi);
		hoKhau.setLyDoChuyen(lyDoChuyen);
		hoKhau.setGhiChu(hoKhau.getGhiChu() + "\n" + ngayChuyen  + " : chuyển hộ khẩu -- "  + diaChiMoi);
	}
}
