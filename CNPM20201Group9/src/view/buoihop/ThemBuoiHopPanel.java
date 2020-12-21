package view.buoihop;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import model.BuoiHop;
import utility.ReadFile;
import utility.WriteFile;
import javax.swing.SwingConstants;
import model.DiemDanh;
import model.HoKhau;
import services.BuoiHopService;
import services.DiemDanhService;
import services.HoKhauService;

public class ThemBuoiHopPanel extends JPanel{
	private static ThemBuoiHopPanel instance;
	private XemVanBan xem;
	private JTextField txtDiaDiem;
	private JTextField txtNguoiThucHien;
	private JTextArea txtNoiDung;
	private JTextField txtTime;

	private ThemBuoiHopPanel(JPanel panBuoiHop, JPanel panMainBuoiHop) {
		initComponents(panBuoiHop, panMainBuoiHop);
	}
	
	private void initComponents(JPanel panBuoiHop, JPanel panMainBuoiHop) {
		setBackground(new Color(135, 206, 235));
		setBounds(0, 0, 710, 442);
		setLayout(null);
		
		JPanel panThemTieuDe = new JPanel();
		panThemTieuDe.setBounds(6, 6, 642, 181);
		panThemTieuDe.setBorder(new LineBorder(new Color(255, 0, 255), 2, true));
		add(panThemTieuDe);
		panThemTieuDe.setLayout(null);
		
		JLabel lblChuDe = new JLabel("Chủ đề : ");
		lblChuDe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblChuDe.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblChuDe.setBounds(6, 85, 97, 16);
		panThemTieuDe.add(lblChuDe);
		
		JLabel lblThoiGian = new JLabel("Thời gian :");
		lblThoiGian.setHorizontalAlignment(SwingConstants.RIGHT);
		lblThoiGian.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblThoiGian.setBounds(6, 121, 90, 16);
		panThemTieuDe.add(lblThoiGian);
		
		JLabel lbDiaDiem = new JLabel("Địa điểm :");
		lbDiaDiem.setHorizontalAlignment(SwingConstants.RIGHT);
		lbDiaDiem.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lbDiaDiem.setBounds(6, 157, 90, 16);
		panThemTieuDe.add(lbDiaDiem);
		
		txtDiaDiem = new JTextField();
		txtDiaDiem.setColumns(10);
		txtDiaDiem.setBounds(97, 153, 499, 26);
		panThemTieuDe.add(txtDiaDiem);
		
		JTextArea txtChuDe = new JTextArea();
		txtChuDe.setWrapStyleWord(true);
		txtChuDe.setLineWrap(true);
		txtChuDe.setBounds(103, 5, 511, 96);
		panThemTieuDe.add(txtChuDe);
		
		JButton btnX3 = new JButton("x");
		btnX3.setForeground(new Color(255, 0, 0));
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDiaDiem.setText("");
			}
		});
		btnX3.setBounds(592, 156, 22, 20);
		panThemTieuDe.add(btnX3);
		
		JButton btnX2 = new JButton("x");
		btnX2.setForeground(new Color(255, 0, 0));
		btnX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTime.setText("");
			}
		});
		btnX2.setBounds(248, 121, 22, 20);
		panThemTieuDe.add(btnX2);
		
		JButton btnX1 = new JButton("x");
		btnX1.setForeground(new Color(255, 0, 0));
		btnX1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtChuDe.setText("");
			}
		});
		btnX1.setBounds(614, 5, 22, 20);
		panThemTieuDe.add(btnX1);
		
		JLabel lblNguoiThucHien = new JLabel("Người thực hiện :");
		lblNguoiThucHien.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNguoiThucHien.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNguoiThucHien.setBounds(295, 122, 143, 16);
		panThemTieuDe.add(lblNguoiThucHien);
		
		txtNguoiThucHien = new JTextField();
		txtNguoiThucHien.setColumns(10);
		txtNguoiThucHien.setBounds(440, 118, 156, 26);
		panThemTieuDe.add(txtNguoiThucHien);
		
		JButton btnX4 = new JButton("x");
		btnX4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNguoiThucHien.setText("");
			}
		});
		btnX4.setForeground(Color.RED);
		btnX4.setBounds(592, 121, 22, 20);
		panThemTieuDe.add(btnX4);
		
		txtTime = new JTextField();
		txtTime.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtTime.getText().equals("dd/mm/yyyy") | txtTime.getText().equals("")) {
					txtTime.setText("//");
				}
			}
		});
		txtTime.setText("dd/mm/yyyy");
		txtTime.setBounds(97, 118, 156, 26);
		panThemTieuDe.add(txtTime);
		txtTime.setColumns(10);
		
		JButton btnAdd = new JButton("");
		btnAdd.setBounds(660, 36, 44, 49);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                                List<HoKhau> hks = new ArrayList<HoKhau>();
                                hks = HoKhauService.layDanhSachHoKhau();
                                for(HoKhau hoKhau : hks) {
                                    DiemDanhService.themDiemDanh(new DiemDanh(hoKhau.getSoHoKhau(),"BH" + (BuoiHopPanel.danhSachBuoiHop.size() + 1),"Không tham gia"));
                                }
				SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
				try {
					SimpleDateFormat fmt1 = new SimpleDateFormat("yyyyMMdd");
                                        long millis=System.currentTimeMillis();  
                                        java.sql.Date now=new java.sql.Date(millis);
                                        long tmp = Long.parseLong(fmt1.format(fmt.parse(txtTime.getText()))) - Long.parseLong(fmt1.format(now));
                                        String s = null;
                                        if(tmp > 0) {
                                            s = "Chưa diễn ra";
                                        } else if(tmp < 0) {
                                            s = "Đã diễn ra";
                                        } else {
                                            s = "Đang diễn ra";
                                        }
                                    BuoiHopPanel.danhSachBuoiHop.add(new BuoiHop("BH" + (BuoiHopPanel.danhSachBuoiHop.size() + 1), txtChuDe.getText(), fmt.parse(txtTime.getText()), txtDiaDiem.getText(), 0, s));
                                    new BuoiHopService().updateBuoiHop(new BuoiHop("BH" + (BuoiHopPanel.danhSachBuoiHop.size()), txtChuDe.getText(), fmt.parse(txtTime.getText()), txtDiaDiem.getText(), 0, s));
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showConfirmDialog(null, "Thêm thành công!");
				txtChuDe.setText("");
				txtTime.setText("");
				txtNguoiThucHien.setText("");
				txtDiaDiem.setText("");
				txtNoiDung.setText("");
			}
		});
		btnAdd.setIcon(new ImageIcon("images/Add-icon.png"));
		add(btnAdd);
		
		JButton btnExport = new JButton("");
		btnExport.setBounds(660, 135, 44, 52);
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser window = new JFileChooser();
				int value = window.showSaveDialog(null);

				if(value == JFileChooser.APPROVE_OPTION) {
					WriteFile.writeFile(window.getSelectedFile().getAbsoluteFile(), xem.getFileContent());
					JOptionPane.showMessageDialog(null,"Đã lưu thành công!");
				}
			}
		});
		btnExport.setIcon(new ImageIcon("images/dow-icon.png"));
		add(btnExport);
		
		JButton btnBack = new JButton("");
		btnBack.setBounds(660, 6, 44, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				panBuoiHop.setVisible(true);
			}
		});
		btnBack.setIcon(new ImageIcon("images/back.png"));
		add(btnBack);
		
		txtNoiDung = new JTextArea();
		txtNoiDung.setBounds(6, 191, 698, 245);
		txtNoiDung.setBorder(new LineBorder(new Color(218, 112, 214), 2, true));
		txtNoiDung.setLineWrap(true);
		txtNoiDung.setWrapStyleWord(true);
		add(txtNoiDung);
		
		JButton btnView = new JButton("");
		btnView.setBounds(660, 85, 44, 48);
		add(btnView);
		btnView.setIcon(new ImageIcon("images/text-icon.png"));
		btnView.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFileChooser window = new JFileChooser();
			int value = window.showOpenDialog(panMainBuoiHop);
			if(value == JFileChooser.APPROVE_OPTION) {
				Calendar calendar = Calendar.getInstance();
				String fileContent = ReadFile.readFile(window.getSelectedFile());
				fileContent = fileContent.replace("Province", "Hà Nội");
				fileContent = fileContent.replace("diaDiem", txtDiaDiem.getText());
				fileContent = fileContent.replace("thoiGian", txtTime.getText());
				fileContent = fileContent.replace("noiDung", txtNoiDung.getText());
				fileContent = fileContent.replace("nguoiThucHien", txtNguoiThucHien.getText());
				fileContent = fileContent.replace("DD", calendar.get(Calendar.DAY_OF_MONTH) + "");
				fileContent = fileContent.replace("MM", calendar.get(Calendar.MONTH) + "");
				fileContent = fileContent.replace("YYYY", calendar.get(Calendar.YEAR) + "");
				xem = XemVanBan.getInstance(fileContent, ThemBuoiHopPanel.getInstance(panBuoiHop, panMainBuoiHop));
				setVisible(false);
				xem.setVisible(true);
				panMainBuoiHop.add(xem);
			}
		}
		});
	}
	public static ThemBuoiHopPanel getInstance(JPanel panBuoiHop, JPanel panMainBuoiHop) {
		if(instance == null) {
			instance = new ThemBuoiHopPanel(panBuoiHop, panMainBuoiHop);
		}
		return instance;
	}
	
	public void setFileContent(String fileContent) {
		this.setFileContent(fileContent);
	}
}
