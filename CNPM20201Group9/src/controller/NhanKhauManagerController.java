package controller;

import java.util.ArrayList;

import model.NhanKhau;

public class NhanKhauManagerController {
	private ArrayList<NhanKhau> danhSachNhanKhau;
	
	public NhanKhauManagerController() {
		danhSachNhanKhau = new ArrayList<NhanKhau>();
	}
	
	public void themNhanKhau(NhanKhau nhanKhau) {
		danhSachNhanKhau.add(nhanKhau);
	}
	
	public void thayDoiNhanKhau(NhanKhau nhanKhau, String ngayChuyen, String noiChuyen, String ghiChu) {
		nhanKhau.setNgayChuyen(ngayChuyen);
		nhanKhau.setNoiChuyen(noiChuyen);
		nhanKhau.setGhiChu(ghiChu);
	}
	
	public void thayDoiNhanKhau(NhanKhau nhanKhau) {
		nhanKhau.setGhiChu("Đã qua đời!");
	}

}
