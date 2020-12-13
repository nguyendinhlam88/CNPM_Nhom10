package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import services.BuoiHopService;
import view.buoihop.BuoiHopPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import view.buoihop.NewJPanel;

public class MainMenu extends JFrame {
	
	private BuoiHopPanel buoiHopPanel;
	private JPanel panTrangChu;
	private JPanel panHoKhau;
	private JPanel panNhanKhau;
	private JPanel panBuoiHop;
	private JPanel panThongKe;
	private JPanel panDangXuat;
	private JPanel panMain;
	private JPanel panScreen;

	public MainMenu() {
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 892, 482);
		panScreen = new JPanel();
		panScreen.setBackground(SystemColor.textHighlight);
		panScreen.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(panScreen);
		panScreen.setLayout(null);
		
		JPanel panMenu = new JPanel();
		panMenu.setBackground(Color.CYAN);
		panMenu.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panMenu.setBounds(5, 5, 159, 442);
		panScreen.add(panMenu);
		panMenu.setLayout(null);
		
		panTrangChu = new JPanel();
		panTrangChu.setBackground(new Color(135, 206, 235));
		panTrangChu.setBorder(new LineBorder(new Color(0, 0, 0)));
		panTrangChu.setBounds(6, 6, 154, 66);
		panMenu.add(panTrangChu);
		panTrangChu.setLayout(null);
		
		JLabel lbTrangChu = new JLabel("Trang Chủ");
		lbTrangChu.addMouseListener(new PanelButtonMouseAdapter(panTrangChu));
		lbTrangChu.setHorizontalAlignment(SwingConstants.CENTER);
		lbTrangChu.setIcon(new ImageIcon("images/e/homeIcon.png"));
		lbTrangChu.setBounds(0, 0, 154, 66);
		panTrangChu.add(lbTrangChu);
		
		panNhanKhau = new JPanel();
		panNhanKhau.setLayout(null);
		panNhanKhau.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panNhanKhau.setBackground(new Color(135, 206, 235));
		panNhanKhau.setBounds(7, 83, 153, 66);
		panMenu.add(panNhanKhau);
		
		JLabel lbNhanKhau = new JLabel("Nhân Khẩu");
		lbNhanKhau.addMouseListener(new PanelButtonMouseAdapter(panNhanKhau));
		lbNhanKhau.setHorizontalAlignment(SwingConstants.CENTER);
		lbNhanKhau.setBackground(new Color(135, 206, 235));
		lbNhanKhau.setIcon(new ImageIcon("images/people-icon.png"));
		lbNhanKhau.setBounds(0, 0, 153, 66);
		panNhanKhau.add(lbNhanKhau);
		
		panHoKhau = new JPanel();
		panHoKhau.setLayout(null);
		panHoKhau.setBorder(new LineBorder(new Color(0, 0, 0)));
		panHoKhau.setBackground(new Color(135, 206, 235));
		panHoKhau.setBounds(7, 149, 153, 66);
		panMenu.add(panHoKhau);
		
		JLabel lbHoKhau = new JLabel("Hộ Khẩu");
		lbHoKhau.addMouseListener(new PanelButtonMouseAdapter(panHoKhau));
		lbHoKhau.setHorizontalAlignment(SwingConstants.CENTER);
		lbHoKhau.setIcon(new ImageIcon("images/red-home-icon.png"));
		lbHoKhau.setBounds(0, 0, 153, 66);
		panHoKhau.add(lbHoKhau);
		
		panThongKe = new JPanel();
		panThongKe.setLayout(null);
		panThongKe.setBorder(new LineBorder(new Color(0, 0, 0)));
		panThongKe.setBackground(new Color(135, 206, 235));
		panThongKe.setBounds(7, 215, 153, 70);
		panMenu.add(panThongKe);
		
		JLabel lbThongKe = new JLabel("Thống Kê");
		lbThongKe.addMouseListener(new PanelButtonMouseAdapter(panThongKe));
		lbThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		lbThongKe.setIcon(new ImageIcon("images/Analytics-icon.png"));
		lbThongKe.setBounds(0, 0, 153, 70);
		panThongKe.add(lbThongKe);
		
		panBuoiHop = new JPanel();
		panBuoiHop.setLayout(null);
		panBuoiHop.setBorder(new LineBorder(new Color(0, 0, 0)));
		panBuoiHop.setBackground(new Color(135, 206, 235));
		panBuoiHop.setBounds(7, 285, 153, 70);
		panMenu.add(panBuoiHop);
		
		JLabel lbBuoiHop = new JLabel("Buổi Họp");
		lbBuoiHop.addMouseListener(new PanelButtonMouseAdapter(panBuoiHop) {
			@Override
			public void mouseClicked(MouseEvent e) {
				panTrangChu.setBackground(new Color(135, 206, 235));
				panHoKhau.setBackground(new Color(135, 206, 235));
				panNhanKhau.setBackground(new Color(135, 206, 235));
				panThongKe.setBackground(new Color(135, 206, 235));
				panDangXuat.setBackground(new Color(135, 206, 235));;
				panBuoiHop.setBackground(Color.pink);
				panMain.removeAll();
				panMain.revalidate();
				panMain.repaint();
				updatePanScreen(panBuoiHop);
				buoiHopPanel.setVisible(true);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(Color.pink);
			}
			
		});
		lbBuoiHop.setHorizontalAlignment(SwingConstants.CENTER);
		lbBuoiHop.setIcon(new ImageIcon("images/Meeting-icon.png"));
		lbBuoiHop.setBounds(0, 0, 153, 70);
		panBuoiHop.add(lbBuoiHop);
		
		panDangXuat = new JPanel();
		panDangXuat.setLayout(null);
		panDangXuat.setBorder(new LineBorder(new Color(0, 0, 0)));
		panDangXuat.setBackground(new Color(135, 206, 235));
		panDangXuat.setBounds(7, 367, 153, 70);
		panMenu.add(panDangXuat);
		
		JLabel lbDangXuat = new JLabel("Đăng Xuất");
		lbDangXuat.addMouseListener(new PanelButtonMouseAdapter(panDangXuat));
		lbDangXuat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//BuoiHopService.updateBuoiHopTable(BuoiHopPanel.danhSachBuoiHop);
				MainLogin login = new MainLogin();
				login.setVisible(true);
				dispose();
			}
		});
		lbDangXuat.setHorizontalAlignment(SwingConstants.CENTER);
		lbDangXuat.setIcon(new ImageIcon("images/out-icon.png"));
		lbDangXuat.setBounds(0, 0, 153, 70);
		panDangXuat.add(lbDangXuat);
				
		panMain = new JPanel();
		panMain.setBackground(Color.WHITE);
		panMain.setBounds(176, 5, 710, 442);
		panMain.setLayout(null);
		
		// Thêm các sự kiện của item : Buổi Họp.
		updatePanScreen(null);
		panMain.add(buoiHopPanel);
		panScreen.add(panMain);
		
	}

	// Cho các panel vào đây.
	private void updatePanScreen(JPanel panel) {
		buoiHopPanel = BuoiHopPanel.getInstance(panMain);
                NewJPanel e1 = new NewJPanel(); 
                e1.setVisible(true);
                panMain.add(e1);
		buoiHopPanel.setVisible(false);
		panMain.add(buoiHopPanel);
		if(panel != null) panel.setVisible(true);
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}

		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(Color.yellow);
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(135, 206, 235));
		}
	}
}
