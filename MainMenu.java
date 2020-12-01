package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

// import view.buoihop.BuoiHopPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainMenu extends JFrame {
	
	// BuoiHopPanel buoiHopPanel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainMenu() {
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 482);
		JPanel PanMain = new JPanel();
		PanMain.setBackground(SystemColor.textHighlight);
		PanMain.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(PanMain);
		PanMain.setLayout(null);
		
		JPanel panMenu = new JPanel();
		panMenu.setBackground(Color.CYAN);
		panMenu.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panMenu.setBounds(5, 5, 159, 442);
		PanMain.add(panMenu);
		panMenu.setLayout(null);
		
		JPanel pan1 = new JPanel();
		pan1.setBackground(Color.PINK);
		pan1.setBorder(new LineBorder(new Color(0, 0, 0)));
		pan1.setBounds(6, 6, 154, 66);
		panMenu.add(pan1);
		pan1.setLayout(null);
		
		JLabel lbTrangChu = new JLabel("Trang Chủ");
		lbTrangChu.setHorizontalAlignment(SwingConstants.CENTER);
		lbTrangChu.setIcon(new ImageIcon("images/homeIcon.png"));
		lbTrangChu.setBounds(0, 0, 154, 66);
		pan1.add(lbTrangChu);
		
		JPanel pan1_1 = new JPanel();
		pan1_1.setLayout(null);
		pan1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pan1_1.setBackground(Color.PINK);
		pan1_1.setBounds(7, 83, 153, 66);
		panMenu.add(pan1_1);
		
		JLabel lbNhanKhau = new JLabel("Nhân Khẩu");
		lbNhanKhau.setHorizontalAlignment(SwingConstants.CENTER);
		lbNhanKhau.setBackground(Color.PINK);
		lbNhanKhau.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lbNhanKhau.setIcon(new ImageIcon("images/people-icon.png"));
		lbNhanKhau.setBounds(0, 0, 153, 66);
		pan1_1.add(lbNhanKhau);
		
		JPanel pan1_2 = new JPanel();
		pan1_2.setLayout(null);
		pan1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		pan1_2.setBackground(Color.PINK);
		pan1_2.setBounds(7, 149, 153, 66);
		panMenu.add(pan1_2);
		
		JLabel lbHoKhau = new JLabel("Hộ Khẩu");
		lbHoKhau.setHorizontalAlignment(SwingConstants.CENTER);
		lbHoKhau.setBackground(Color.PINK);
		lbHoKhau.setIcon(new ImageIcon("images/red-home-icon.png"));
		lbHoKhau.setBounds(0, 0, 153, 66);
		pan1_2.add(lbHoKhau);
		
		JPanel pan1_3 = new JPanel();
		pan1_3.setLayout(null);
		pan1_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		pan1_3.setBackground(Color.PINK);
		pan1_3.setBounds(7, 215, 153, 70);
		panMenu.add(pan1_3);
		
		JLabel lbThongKe = new JLabel("Thống Kê");
		lbThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		lbThongKe.setBackground(Color.PINK);
		lbThongKe.setIcon(new ImageIcon("images/Analytics-icon.png"));
		lbThongKe.setBounds(0, 0, 153, 70);
		pan1_3.add(lbThongKe);
		
		JPanel panSuKien = new JPanel();
		panSuKien.setLayout(null);
		panSuKien.setBorder(new LineBorder(new Color(0, 0, 0)));
		panSuKien.setBackground(Color.PINK);
		panSuKien.setBounds(7, 285, 153, 70);
		panMenu.add(panSuKien);
		
		JLabel lbBuoiHop = new JLabel("Buổi Họp");
		lbBuoiHop.setBackground(Color.PINK);
		// lbBuoiHop.addMouseListener(new MouseAdapter() {
		// 	@Override
		// 	public void mouseClicked(MouseEvent e) {
		// 		panSuKien.setBackground(new Color(60, 179, 123));
		// 		updatePanMenu(buoiHopPanel);
		// 	}
		// 	@Override
		// 	public void mouseExited(MouseEvent e) {
		// 		panSuKien.setBackground(new Color(112, 128, 144));
		// 	}
		// });
		lbBuoiHop.setHorizontalAlignment(SwingConstants.CENTER);
		lbBuoiHop.setIcon(new ImageIcon("images/Meeting-icon.png"));
		lbBuoiHop.setBounds(0, 0, 153, 70);
		panSuKien.add(lbBuoiHop);
		
		JPanel pan1_3_1 = new JPanel();
		pan1_3_1.setLayout(null);
		pan1_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		pan1_3_1.setBackground(Color.PINK);
		pan1_3_1.setBounds(7, 367, 153, 70);
		panMenu.add(pan1_3_1);
		
		JLabel lbDangXuat = new JLabel("Đăng Xuất");
		lbDangXuat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainLogin login = new MainLogin();
				login.setVisible(true);
				dispose();
			}
		});
		lbDangXuat.setHorizontalAlignment(SwingConstants.CENTER);
		lbDangXuat.setIcon(new ImageIcon("images/out-icon.png"));
		lbDangXuat.setBounds(0, 0, 153, 70);
		pan1_3_1.add(lbDangXuat);
		
		// panMain : nơi add tất cả các Jpanel chính của các chức năng.	
		JPanel panMain = new JPanel();
		panMain.setBackground(Color.WHITE);
		panMain.setBounds(176, 5, 710, 442);
		panMain.setLayout(null);
		
		// Thêm các sự kiện của item : Buổi Họp.
		// buoiHopPanel = BuoiHopPanel.getInstance(panMain);
		// buoiHopPanel.setVisible(false);
		// panMain.add(buoiHopPanel);
		// PanMain.add(panMain);
		
	}
	
	// Thêm các panel vào đây để update sau mỗi lần click vào các mục khác nhau. 
	private void updatePanMenu(JPanel panel) {
		// buoiHopPanel.setVisible(false);
		// panel.setVisible(true);
	}
}
