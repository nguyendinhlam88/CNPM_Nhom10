package model;

import java.sql.Date;
import java.util.ArrayList;

public class HoKhau {
	private String idHoKhau;
	private String soHoKhau;
	private String tenChuHo;
	private String makhuVuc;
	private String diaChi;
	private Date ngayTao;
	private Date ngayChuyenDi;
	private String lyDoChuyen;
	private String nguoiThucHien;
	private String ghiChu;
	private int diemTichLuy;
	
	private ArrayList<NhanKhau> danhSachNhanKhau;
	
	public HoKhau(String idHoKhau, String soHoKhau, String tenChuHo, String diaChi, int diemTichLuy) {
		this.idHoKhau = idHoKhau;
		this.soHoKhau = soHoKhau;
		this.tenChuHo = tenChuHo;
		this.diaChi = diaChi;
		this.diemTichLuy = diemTichLuy;
	}

	public String getIdHoKhau() {
		return idHoKhau;
	}

	public void setIdHoKhau(String idHoKhau) {
		this.idHoKhau = idHoKhau;
	}

	public String getSoHoKhau() {
		return soHoKhau;
	}

	public void setSoHoKhau(String soHoKhau) {
		this.soHoKhau = soHoKhau;
	}

	public String getTenChuHo() {
		return tenChuHo;
	}

	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}

	public String getMakhuVuc() {
		return makhuVuc;
	}

	public void setMakhuVuc(String makhuVuc) {
		this.makhuVuc = makhuVuc;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public Date getNgayChuyenDi() {
		return ngayChuyenDi;
	}

	public void setNgayChuyenDi(Date ngayChuyenDi) {
		this.ngayChuyenDi = ngayChuyenDi;
	}

	public String getLyDoChuyen() {
		return lyDoChuyen;
	}

	public void setLyDoChuyen(String lyDoChuyen) {
		this.lyDoChuyen = lyDoChuyen;
	}

	public String getNguoiThucHien() {
		return nguoiThucHien;
	}

	public void setNguoiThucHien(String nguoiThucHien) {
		this.nguoiThucHien = nguoiThucHien;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public ArrayList<NhanKhau> getDanhSachNhanKhau() {
		return danhSachNhanKhau;
	}

	public void setDanhSachNhanKhau(ArrayList<NhanKhau> danhSachNhanKhau) {
		this.danhSachNhanKhau = danhSachNhanKhau;
	}

	public int getDiemTichLuy() {
		return diemTichLuy;
	}

	public void setDiemTichLuy(int diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}
}
