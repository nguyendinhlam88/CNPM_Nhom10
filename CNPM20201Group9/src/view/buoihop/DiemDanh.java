package view.buoihop;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import model.BuoiHop;
import model.HoKhau;
import services.HoKhauService;

public class DiemDanh extends JPanel {
	private JTable bangDiemDanh;
	private JTextField txtChuDe;
	private JTextField txtSoLuong;
	private JTextField txtTimKiem;
	private JLabel lblTeenHooj;
	private JLabel lbSearch;
	private List<HoKhau> danhSachHoKhau;


	public DiemDanh(BuoiHop buoiHop, JPanel buoiHopPanel) {
		initComponents(buoiHop, buoiHopPanel);
	}
	
	private void initComponents(BuoiHop buoiHop, JPanel buoiHopPanel) {
		setBackground(new Color(135, 206, 235));
		setBounds(0, 0, 710, 442);
		setLayout(null);
		
		JScrollPane scrollBangDiem = new JScrollPane();
		scrollBangDiem.setBounds(6, 55, 480, 381);
		add(scrollBangDiem);
		
		bangDiemDanh = new JTable();
		bangDiemDanh.setSurrendersFocusOnKeystroke(true);
		bangDiemDanh.setBorder(new LineBorder(new Color(0, 0, 0)));
		bangDiemDanh.setBackground(Color.white);
		bangDiemDanh.setForeground(Color.DARK_GRAY);
		bangDiemDanh.setSelectionBackground(Color.white);
		bangDiemDanh.setGridColor(new Color(0, 0, 205));
		bangDiemDanh.setSelectionForeground(Color.RED);
		bangDiemDanh.setRowHeight(30);
		bangDiemDanh.setAutoCreateRowSorter(true);
		bangDiemDanh.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		bangDiemDanh.setFillsViewportHeight(true);
		Object[] columns = {"ID", "Số hộ khẩu", "Chủ hộ", "Điểm", "Điểm danh"};
		DefaultTableModel model = (DefaultTableModel) bangDiemDanh.getModel();
		model.setColumnIdentifiers(columns);
		model.setRowCount(0);
		
		danhSachHoKhau = HoKhauService.layDanhSachBuoiHop();
		for(HoKhau hoKhau : danhSachHoKhau) {
			model.addRow(new Object[] {hoKhau.getIdHoKhau(), hoKhau.getSoHoKhau(), hoKhau.getTenChuHo(), hoKhau.getDiemTichLuy(), "Chưa"});
		}
		
		scrollBangDiem.setViewportView(bangDiemDanh);
		bangDiemDanh.getColumnModel().getColumn(0).setPreferredWidth(10);
		bangDiemDanh.getColumnModel().getColumn(1).setPreferredWidth(30);
		bangDiemDanh.getColumnModel().getColumn(2).setPreferredWidth(120);
		bangDiemDanh.getColumnModel().getColumn(3).setPreferredWidth(20);
		bangDiemDanh.getColumnModel().getColumn(4).setPreferredWidth(40);
		bangDiemDanh.getTableHeader().setResizingAllowed(false);
		bangDiemDanh.getTableHeader().setReorderingAllowed(false);
		
		JLabel lblNewLabel = new JLabel("Chủ đề :");
		lblNewLabel.setFont(new Font("PT Sans Narrow", Font.PLAIN, 20));
		lblNewLabel.setBounds(6, 17, 61, 26);
		add(lblNewLabel);
		
		txtChuDe = new JTextField();
		txtChuDe.setFont(new Font("PT Sans", Font.PLAIN, 20));
		txtChuDe.setEditable(false);
		txtChuDe.setText(buoiHop.getChuDe());
		txtChuDe.setBorder(null);
		txtChuDe.setBackground(new Color(135, 206, 235));
		txtChuDe.setBounds(77, 6, 409, 47);
		add(txtChuDe);
		txtChuDe.setColumns(10);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setEditable(false);
		txtSoLuong.setForeground(new Color(255, 99, 71));
		txtSoLuong.setHorizontalAlignment(SwingConstants.CENTER);
		txtSoLuong.setBounds(640, 389, 64, 47);
		txtSoLuong.setText(buoiHop.getSoLuong() + "");
		add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		JLabel lblSNgiTham = new JLabel("Số lượng :");
		lblSNgiTham.setFont(new Font("PT Sans Narrow", Font.PLAIN, 20));
		lblSNgiTham.setBounds(498, 399, 83, 26);
		add(lblSNgiTham);
		
		lblTeenHooj = new JLabel("Tên chủ hộ :");
		lblTeenHooj.setFont(new Font("PT Sans Narrow", Font.PLAIN, 20));
		lblTeenHooj.setBounds(498, 38, 100, 26);
		add(lblTeenHooj);
		
		txtTimKiem = new JTextField();
		txtTimKiem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(model.getRowCount() != danhSachHoKhau.size()) {
					model.setRowCount(0);
					capNhatBangBuoiHop(model);
				}
			}
		});
		txtTimKiem.setBounds(498, 55, 166, 43);
		add(txtTimKiem);
		txtTimKiem.setColumns(10);
		
		JButton btnBack = new JButton("");
		btnBack.setBounds(660, 6, 44, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				buoiHopPanel.setVisible(true);
			}
		});
		btnBack.setIcon(new ImageIcon("images/back.png"));
		add(btnBack);
		
		lbSearch = new JLabel("");
		lbSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String tenChuHo = txtTimKiem.getText().toLowerCase().trim();
				
				if(tenChuHo.equals("")) JOptionPane.showMessageDialog(null, "Vui lòng nhập tên chủ hộ để tìm!");
				else {
					int n = model.getRowCount();
					for(int i = n - 1; i >= 0; i--) {
						if(!danhSachHoKhau.get(i).getTenChuHo().toLowerCase().contains(tenChuHo)) {
							model.removeRow(i);
						}
					}
				}
			}
		});
		lbSearch.setIcon(new ImageIcon("images/icon-search.png"));
		lbSearch.setBounds(670, 56, 34, 42);
		add(lbSearch);
		
		JButton btnDiemDanh = new JButton("điểm danh");
		btnDiemDanh.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSoLuong.setText(String.valueOf(Integer.parseInt(txtSoLuong.getText()) + 1));
				int valueSelected = bangDiemDanh.getSelectedRow();
				if(valueSelected == -1) JOptionPane.showMessageDialog(null, "Vui lòng chọn trong bảng để điểm danh");
				else  {
					String tenChuHo = (String) model.getValueAt(valueSelected, 2);
					buoiHop.setSoLuong(buoiHop.getSoLuong() + 1);
					int i = 0;
					for(HoKhau hoKhau : danhSachHoKhau) {
						if(hoKhau.getTenChuHo().equals(tenChuHo)) {
							hoKhau.setDiemTichLuy(hoKhau.getDiemTichLuy() + 1);
							if(model.getRowCount() != danhSachHoKhau.size()) {
								model.setRowCount(0);
								capNhatBangBuoiHop(model);
							}
							model.setValueAt("Tham Gia", i, 4);
						}
						i++;
					}
				}
			}
		});
		btnDiemDanh.setBounds(564, 119, 100, 29);
		add(btnDiemDanh);
	}
	
	private void capNhatBangBuoiHop(DefaultTableModel model) {
		for(HoKhau hoKhau : danhSachHoKhau) {
			model.addRow(new Object[] {hoKhau.getIdHoKhau(), hoKhau.getSoHoKhau(), hoKhau.getTenChuHo(), hoKhau.getDiemTichLuy(), "Chưa"});
		}
	}
}
