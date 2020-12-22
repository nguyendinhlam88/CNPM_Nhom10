/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nhankhau;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import controller.NhanKhauManagerController;
import controller.TamVangManagerController;
import services.HoKhauService;
/**
 *
 * @author Vu
 */
public class ChiTietNhanKhauFR extends javax.swing.JFrame {

    /**
     * Creates new form ChitietFR
     */
    SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    NhanKhauManagerController nhanKhauControl = new NhanKhauManagerController();
    TamVangManagerController tamVangControl = new TamVangManagerController();
    HoKhauService hoKhauService = new HoKhauService();
    /*TamvangController controltamvang = new TamvangController();
    LichsuController controllichsu = new LichsuController();
    Nhankhau trangthaicu=new Nhankhau();
    Nhankhau trangthaimoi=new Nhankhau();
    */
    private void update(){
        nhanKhauControl.hienThiChiTiet(txtMaDinhDanh, txtHoTen, txtBiDanh, txtNgaySinh, txtNoiSinh, comboboxGioiTinh, 
                                       txtDiaChiHienTai, txtNguyenQuan, txtDanToc, txtNgheNghiep, txtNoiLamViec, 
                                       txtSoCMND, txtNgayCapCMND, txtNoiCapCMND, txtQuanHeChuHo, txtNoiThuongTruTruoc, 
                                       txtNgayDkThuongTru, txtGhiChu, txtTrangThai);
    }
    
    private void setUnlock(boolean t){
        txtMaDinhDanh.setEditable(t);
        txtHoTen.setEditable(t);
        txtBiDanh.setEditable(t);
        txtNgaySinh.setEditable(t);
        txtNoiSinh.setEditable(t);
        txtDiaChiHienTai.setEditable(t);
        comboboxGioiTinh.setEnabled(t);
        txtNguyenQuan.setEditable(t);
        txtDanToc.setEditable(t);
        txtNgheNghiep.setEditable(t);
        txtNoiLamViec.setEditable(t);
        txtSoCMND.setEditable(t);
        txtNgayCapCMND.setEditable(t);
        txtNoiCapCMND.setEditable(t);
        txtQuanHeChuHo.setEditable(t);
        txtNoiThuongTruTruoc.setEditable(t);
        txtNgayDkThuongTru.setEditable(t);
        txtGhiChu.setEditable(t);
        txtTrangThai.setEditable(t);
    }
    
    public ChiTietNhanKhauFR() {
        initComponents();
        labelSoHoKhau.setText(nhanKhauControl.soHoKhau);
        labelTenChuHo.setText(hoKhauService.timHoKhau(nhanKhauControl.soHoKhau).getTenChuHo());
        setUnlock(false);
        xacnhanbutton.setVisible(false);
        update();
        if(txtTrangThai.getText().equals("Tạm vắng")){
            captamvangbutton.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        xoabutton = new javax.swing.JButton();
        suabutton = new javax.swing.JButton();
        quaylaibutton = new javax.swing.JButton();
        captamvangbutton = new javax.swing.JButton();
        capnhatbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboboxGioiTinh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaDinhDanh = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtGhiChu = new javax.swing.JTextField();
        txtBiDanh = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtNoiSinh = new javax.swing.JTextField();
        txtNguyenQuan = new javax.swing.JTextField();
        txtDanToc = new javax.swing.JTextField();
        txtNgheNghiep = new javax.swing.JTextField();
        txtNoiLamViec = new javax.swing.JTextField();
        txtSoCMND = new javax.swing.JTextField();
        txtNgayCapCMND = new javax.swing.JTextField();
        labelSoHoKhau = new javax.swing.JLabel();
        txtNoiCapCMND = new javax.swing.JTextField();
        labelTenChuHo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtQuanHeChuHo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNoiThuongTruTruoc = new javax.swing.JTextField();
        txtDiaChiHienTai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNgayDkThuongTru = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();
        xacnhanbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        xoabutton.setText("Xóa");
        xoabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoabuttonActionPerformed(evt);
            }
        });

        suabutton.setText("Sửa");
        suabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suabuttonActionPerformed(evt);
            }
        });

        quaylaibutton.setText("Quay lại");
        quaylaibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaylaibuttonActionPerformed(evt);
            }
        });

        captamvangbutton.setText("Cấp giấy tạm vắng");
        captamvangbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                captamvangbuttonActionPerformed(evt);
            }
        });

        capnhatbutton.setText("Cập nhật trạng thái");
        capnhatbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhatbuttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã định danh:");

        comboboxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", " " }));

        jLabel2.setText("Họ tên:");

        jLabel3.setText("Bí danh:");

        jLabel4.setText("Ngày sinh:");

        jLabel5.setText("Nơi sinh:");

        jLabel19.setText("Ghi chú:");

        txtNoiSinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoiSinhActionPerformed(evt);
            }
        });

        txtNguyenQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNguyenQuanActionPerformed(evt);
            }
        });

        jLabel6.setText("Nguyên quán:");

        txtQuanHeChuHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuanHeChuHoActionPerformed(evt);
            }
        });

        jLabel20.setText("Địa chỉ hiện tại:");

        jLabel7.setText("Dân tộc:");

        jLabel8.setText("Nghề nghiệp:");

        txtNgayDkThuongTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayDkThuongTruActionPerformed(evt);
            }
        });

        jLabel9.setText("Nơi làm việc:");

        jLabel10.setText("Số CMND:");

        jLabel16.setText("Số hộ khẩu:");

        jLabel11.setText("Ngày cấp CMND:");

        jLabel22.setText("Giới tính:");

        jLabel12.setText("Nơi cấp CMND:");

        jLabel17.setText("Chủ hộ:");

        jLabel13.setText("Quan hệ với chủ hộ:");

        jLabel14.setText("Nơi thường trú trước:");

        jLabel15.setText("Ngày đăng kí thường trú:");

        jLabel18.setText("Trạng thái:");

        xacnhanbutton.setText("Xác nhận");
        xacnhanbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel16)
                .addGap(6, 6, 6)
                .addComponent(labelSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel17)
                .addGap(10, 10, 10)
                .addComponent(labelTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(txtMaDinhDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(10, 10, 10)
                .addComponent(txtQuanHeChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel20)
                .addGap(10, 10, 10)
                .addComponent(txtDiaChiHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(txtBiDanh, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(txtNoiLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(txtNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addComponent(txtSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel22)
                .addGap(10, 10, 10)
                .addComponent(comboboxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addComponent(txtNgayCapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(txtNguyenQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel12)
                .addGap(14, 14, 14)
                .addComponent(txtNoiCapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(10, 10, 10)
                .addComponent(txtNoiThuongTruTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(4, 4, 4)
                .addComponent(txtNgayDkThuongTru, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel19)
                .addGap(10, 10, 10)
                .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18)
                .addGap(7, 7, 7)
                .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(xacnhanbutton))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaDinhDanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuanHeChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiaChiHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel20))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBiDanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtNoiLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtSoCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(comboboxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtNgayCapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addComponent(txtNguyenQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtNoiCapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txtDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoiThuongTruTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayDkThuongTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xacnhanbutton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(capnhatbutton)
                        .addGap(23, 23, 23)
                        .addComponent(captamvangbutton)
                        .addGap(17, 17, 17)
                        .addComponent(xoabutton)
                        .addGap(19, 19, 19)
                        .addComponent(suabutton)
                        .addGap(19, 19, 19)
                        .addComponent(quaylaibutton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capnhatbutton)
                    .addComponent(captamvangbutton)
                    .addComponent(xoabutton)
                    .addComponent(suabutton)
                    .addComponent(quaylaibutton))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xoabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoabuttonActionPerformed
        // TODO add your handling code here:
       /* controlnhankhau.Xoanhankhau(txtMaDinhDanh.getText());
        if(controlnhankhau.size(controlnhankhau.sohokhau)==0){
            JOptionPane.showMessageDialog(this,"Hộ khẩu chưa có nhân khẩu !");
            this.dispose();
        }else{
            update(i);
        }*/
    }//GEN-LAST:event_xoabuttonActionPerformed

    private void suabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suabuttonActionPerformed
        // TODO add your handling code here:
        setUnlock(true);
        //trangthaicu=controlnhankhau.Luutrangthainhankhau(trangthaicu, txtSoHoKhau, txtMaDinhDanh, txtHoTen, txtBiDanh, txtNgaySinh, txtNoiSinh, txtNguyenQuan, txtDanToc, txtnghenghiep, txtnoilamviec, txtcmnd, txtngaycap, txtnoicap, txtquanhe, txtdiachicu, txtngaydkthuongtru, txtghichu, txtngaychuyendi, txtnoichuyen);
        jLabel18.setVisible(false);
        txtTrangThai.setVisible(false);
        xacnhanbutton.setVisible(true);
        xoabutton.setEnabled(false);
    }//GEN-LAST:event_suabuttonActionPerformed

    private void quaylaibuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaylaibuttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quaylaibuttonActionPerformed
    
    private void xacnhanbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanbuttonActionPerformed
        // TODO add your handling code here: 
        try{
            String madinhdanh=txtMaDinhDanh.getText();
            String hoten=txtHoTen.getText();
            String bidanh=txtBiDanh.getText();
            Date ngaysinh=fmt.parse(txtNgaySinh.getText());
            String noisinh=txtNoiSinh.getText();
            String diachihientai=txtDiaChiHienTai.getText();
            String gioitinh=(String)comboboxGioiTinh.getSelectedItem();
            String nguyenquan=txtNguyenQuan.getText();
            String dantoc=txtDanToc.getText();
            String nghenghiep=txtNgheNghiep.getText();
            String noilamviec=txtNoiLamViec.getText();
            String socmnd=txtSoCMND.getText();
            Date ngaycapcmnd=fmt.parse(txtNgayCapCMND.getText());
            String noicapcmnd=txtNoiCapCMND.getText();
            String quanhechuho=txtQuanHeChuHo.getText();
            String noithuongtrutruoc=txtNoiThuongTruTruoc.getText();
            Date ngaydkthuongtru=fmt.parse(txtNgayDkThuongTru.getText());
            String ghichu=txtGhiChu.getText();
            
            int i = nhanKhauControl.capNhatNhanKhauThuongTru(madinhdanh, hoten, bidanh, ngaysinh, noisinh, diachihientai, gioitinh, nguyenquan, dantoc, nghenghiep, noilamviec, socmnd, ngaycapcmnd, noicapcmnd, quanhechuho, noithuongtrutruoc, ngaydkthuongtru, ghichu);
            //trangthaimoi=controlnhankhau.Luutrangthainhankhau(trangthaimoi, txtSoHoKhau, txtMaDinhDanh, txtHoTen, txtBiDanh, txtNgaySinh, txtNoiSinh, txtNguyenQuan, txtDanToc, txtnghenghiep, txtnoilamviec, txtcmnd, txtngaycap, txtnoicap, txtquanhe, txtdiachicu, txtngaydkthuongtru, txtghichu, txtngaychuyendi, txtnoichuyen);
            //controllichsu.LuuLichSuSuaNhanKhau(trangthaicu, trangthaimoi);
            if(i==1){
                JOptionPane.showMessageDialog(this," Cập nhật nhân khẩu thành công ");
            }else{
                JOptionPane.showMessageDialog(this," Cập nhật thất bại ");
            }
            setUnlock(true);
            jLabel18.setVisible(true);
            txtTrangThai.setVisible(true);
            xacnhanbutton.setVisible(false);
            xoabutton.setEnabled(true);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_xacnhanbuttonActionPerformed

    private void capnhatbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhatbuttonActionPerformed
        // TODO add your handling code here:
        update();
        
    }//GEN-LAST:event_capnhatbuttonActionPerformed

    private void captamvangbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_captamvangbuttonActionPerformed
        // TODO add your handling code here:
        tamVangControl.setSoHoKhau(labelSoHoKhau.getText());
        tamVangControl.setMaDinhDanh(txtMaDinhDanh.getText());
        new ThemTamVangFR().setVisible(true);
    }//GEN-LAST:event_captamvangbuttonActionPerformed

    private void txtNoiSinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoiSinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoiSinhActionPerformed

    private void txtNguyenQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNguyenQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNguyenQuanActionPerformed

    private void txtQuanHeChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuanHeChuHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuanHeChuHoActionPerformed

    private void txtNgayDkThuongTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayDkThuongTruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayDkThuongTruActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChiTietNhanKhauFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietNhanKhauFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietNhanKhauFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietNhanKhauFR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietNhanKhauFR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton capnhatbutton;
    private javax.swing.JButton captamvangbutton;
    private javax.swing.JComboBox<String> comboboxGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelSoHoKhau;
    private javax.swing.JLabel labelTenChuHo;
    private javax.swing.JButton quaylaibutton;
    private javax.swing.JButton suabutton;
    private javax.swing.JTextField txtBiDanh;
    private javax.swing.JTextField txtDanToc;
    private javax.swing.JTextField txtDiaChiHienTai;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaDinhDanh;
    private javax.swing.JTextField txtNgayCapCMND;
    private javax.swing.JTextField txtNgayDkThuongTru;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtNguyenQuan;
    private javax.swing.JTextField txtNoiCapCMND;
    private javax.swing.JTextField txtNoiLamViec;
    private javax.swing.JTextField txtNoiSinh;
    private javax.swing.JTextField txtNoiThuongTruTruoc;
    private javax.swing.JTextField txtQuanHeChuHo;
    private javax.swing.JTextField txtSoCMND;
    private javax.swing.JTextField txtTrangThai;
    private javax.swing.JButton xacnhanbutton;
    private javax.swing.JButton xoabutton;
    // End of variables declaration//GEN-END:variables
}