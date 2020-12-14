package view.buoihop;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.List;
import model.BuoiHop;
import services.BuoiHopService;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class BuoiHopPanel extends JPanel {
	
	private static BuoiHopPanel instance;
	private ThemBuoiHopPanel themBuoiHopPanel;
	private JPanel PanMain;
	private JTextField txtTimKiem;
	private DefaultTableModel model;
	private JTable bangBuoiHop;
	public static List<BuoiHop> danhSachBuoiHop;
	
	private BuoiHopPanel(JPanel panMainBuoiHop) {
		danhSachBuoiHop = BuoiHopService.layDanhSachBuoiHop();
		initComponents(panMainBuoiHop);
	}
	
	private void initComponents(JPanel panMainBuoiHop) {
		setBorder(null);
		setBackground(new Color(135, 206, 235));
		setBounds(0, 0, 710, 442);
		setLayout(null);
		
		bangBuoiHop = new JTable() {
			 public boolean isCellEditable(int row, int column) {                
	                return false;               
	        };
		};
		bangBuoiHop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedIndex = bangBuoiHop.getSelectedRow();
			}
		});
		bangBuoiHop.setShowGrid(false);
		bangBuoiHop.setSurrendersFocusOnKeystroke(true);
		bangBuoiHop.setBorder(new LineBorder(new Color(0, 0, 0)));
		bangBuoiHop.setBackground(Color.white);
		bangBuoiHop.setForeground(Color.DARK_GRAY);
		bangBuoiHop.setSelectionBackground(Color.white);
		bangBuoiHop.setGridColor(new Color(0, 0, 205));
		bangBuoiHop.setSelectionForeground(Color.RED);
		bangBuoiHop.setRowHeight(30);
		bangBuoiHop.setAutoCreateRowSorter(true);
		bangBuoiHop.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		bangBuoiHop.setFillsViewportHeight(true);
				
		Object[] columns = {"STT", "Mã buổi họp", "Chủ đề", "Thời gian", "Địa điểm", "Số lượng", "Trạng thái"};
		model = (DefaultTableModel) bangBuoiHop.getModel();
		model.setColumnIdentifiers(columns);
		model.setRowCount(0);
		capNhatBangBuoiHop(model);

		bangBuoiHop.getColumnModel().getColumn(0).setPreferredWidth(5);
		bangBuoiHop.getColumnModel().getColumn(1).setPreferredWidth(40);
		bangBuoiHop.getColumnModel().getColumn(2).setPreferredWidth(130);
		bangBuoiHop.getColumnModel().getColumn(3).setPreferredWidth(50);
		bangBuoiHop.getColumnModel().getColumn(4).setPreferredWidth(100);
		bangBuoiHop.getColumnModel().getColumn(5).setPreferredWidth(40);
		bangBuoiHop.getColumnModel().getColumn(6).setPreferredWidth(30);
		bangBuoiHop.getTableHeader().setResizingAllowed(false);
		bangBuoiHop.getTableHeader().setReorderingAllowed(false);
		
		
		JScrollPane scrollPane = new JScrollPane(bangBuoiHop);
		scrollPane.setBackground(Color.white);
		scrollPane.setForeground(Color.black);
		scrollPane.setBounds(6, 49, 698, 385);
		add(scrollPane);
		
		JButton btnThemBuoiHop = new JButton("Thêm buổi họp");
		btnThemBuoiHop.setForeground(new Color(0, 0, 255));
		btnThemBuoiHop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				themBuoiHopPanel = ThemBuoiHopPanel.getInstance(BuoiHopPanel.getInstance(panMainBuoiHop), panMainBuoiHop);
				setVisible(false);
				themBuoiHopPanel.setVisible(true);
				panMainBuoiHop.add(themBuoiHopPanel);
			}
		});
		btnThemBuoiHop.setBounds(313, 8, 130, 29);
		add(btnThemBuoiHop);
		
		JButton btnDiemDanh = new JButton("Điểm danh");
		btnDiemDanh.setForeground(new Color(0, 0, 255));
		btnDiemDanh.setBounds(455, 8, 130, 29);
		add(btnDiemDanh);
		
		txtTimKiem = new JTextField();
		txtTimKiem.setBounds(45, 7, 225, 30);
		add(txtTimKiem);
		txtTimKiem.setText("Nhập buổi họp để tìm kiếm");
		txtTimKiem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(model.getRowCount() != danhSachBuoiHop.size()) {
					model.setRowCount(0);
					capNhatBangBuoiHop(model);
				}
				if(txtTimKiem.getText().equalsIgnoreCase("Nhập buổi họp để tìm kiếm")) {
					txtTimKiem.setText("");
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(txtTimKiem.getText().trim().equals("")) {
					txtTimKiem.setText("Nhập buổi họp để tìm kiếm");
				}
			}
		});
		txtTimKiem.setColumns(10);
		
		JLabel lbSearch = new JLabel("");
		lbSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String tenBuoiHop = txtTimKiem.getText().toLowerCase().trim();
				if(tenBuoiHop.equals("")) JOptionPane.showMessageDialog(null, "Nhập buổi họp để tìm kiếm!");
				else {
					int n = model.getRowCount();
					for(int i = n - 1; i >= 0; i--) {
						if(!danhSachBuoiHop.get(i).getChuDe().toLowerCase().contains(tenBuoiHop)) {
							model.removeRow(i);
						}
					}
				}
			}
		});
		lbSearch.setIcon(new ImageIcon("images/icon-search.png"));
		lbSearch.setBounds(6, 8, 40, 29);
		add(lbSearch);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                            model.setRowCount(0);
                            capNhatBangBuoiHop(model);
			}
		});
		btnCapNhat.setForeground(new Color(0, 0, 255));
		btnCapNhat.setBounds(587, 8, 117, 29);
		add(btnCapNhat);
		btnDiemDanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = bangBuoiHop.getSelectedRow();
				if(value == -1) JOptionPane.showMessageDialog(null, "Vui lòng chọn buổi họp trong bảng để điểm danh.");
				else {
					BuoiHop buoiHop = danhSachBuoiHop.get(value);
                                        if(buoiHop.getTrangThai().equals("Đã diễn ra")) {
                                            JOptionPane.showMessageDialog(null, "Buổi họp đã diễn ra không thể điểm danh lại !");
                                        } else {
                                            DiemDanhPanel diemDanh = new DiemDanhPanel(buoiHop, BuoiHopPanel.getInstance(panMainBuoiHop));
                                            diemDanh.setVisible(true);
                                            setVisible(false);
                                            panMainBuoiHop.add(diemDanh);
                                    }
				}
			}
		});
	}
	
	public static BuoiHopPanel getInstance(JPanel panMainBuoiHop) {
		if(instance == null) {
			instance = new BuoiHopPanel(panMainBuoiHop);
		}
		return instance;
	}
	
	private void capNhatBangBuoiHop(DefaultTableModel model) {
		for(BuoiHop buoiHop : danhSachBuoiHop) {
			model.addRow(new Object[] {model.getRowCount(), buoiHop.getMaBuoiHop(), buoiHop.getChuDe(), new SimpleDateFormat("dd/MM/yyyy").format(buoiHop.getThoiGian()), buoiHop.getDiaDiem(), buoiHop.getSoLuong(), buoiHop.getTrangThai()});
		}
	}
}
