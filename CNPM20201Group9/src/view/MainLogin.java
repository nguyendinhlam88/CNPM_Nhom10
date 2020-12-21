package view;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import model.TaiKhoan;
import services.TaiKhoanService;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class MainLogin extends JFrame {
	
	private static TaiKhoan taiKhoan;
	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	private JLabel lbThongBao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLogin frame = new MainLogin();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainLogin() {
		setIconImage(new ImageIcon("E:\\Users\\Vu\\Desktop\\cnpm\\CNPM_Nhom10\\images\\ios.png").getImage());
		setBackground(new Color(224, 255, 255));
		setType(Type.POPUP);
		setFont(new Font("PT Sans Narrow", Font.PLAIN, 18));
		setTitle("Đăng nhập - Phần mềm quản lý hộ khẩu\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 333);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 453, 307);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.setBackground(new Color(224, 255, 255));
		btnLogin.setVerticalAlignment(SwingConstants.BOTTOM);
		btnLogin.setFont(new Font("PT Sans Narrow", Font.PLAIN, 15));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = txtUserName.getText().trim();
				String password = String.valueOf((txtPassword.getPassword())).trim();
				if(userName.equals("") || password.equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ các trường thông tin", "Lỗi đăng nhập", JOptionPane.WARNING_MESSAGE);
				}
				taiKhoan = TaiKhoanService.checkTaiKhoan(userName, password);
				if(taiKhoan == null) {
					lbThongBao.setText("Tài khoản hoặc mật khẩu sai!");
					txtUserName.setText("");
					txtPassword.setText("");
				} else {
					MainMenu mainMenu = new MainMenu();
					mainMenu.setResizable(false);
					mainMenu.setVisible(true);
					dispose();
				}
			}
		});
		btnLogin.setBounds(88, 223, 294, 29);
		panel.add(btnLogin);
		
		JLabel lbPassword = new JLabel("");
		lbPassword.setIcon(new ImageIcon("images/l.png"));
		lbPassword.setBounds(97, 122, 30, 35);
		panel.add(lbPassword);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(97, 122, 30, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lbUser = new JLabel("");
		lbUser.setIcon(new ImageIcon(getClass().getResource("/images/m.png")));
                //new javax.swing.ImageIcon(getClass().getResource("/com/project1/image/Danh sách.png"))
		lbUser.setBounds(97, 53, 30, 35);
		panel.add(lbUser);
		
		txtUserName = new JTextField();
		txtUserName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUserName.setText("");
				lbThongBao.setText("");
			}
		});
		txtUserName.setText("Tên đăng nhập");
		txtUserName.setForeground(Color.WHITE);
		txtUserName.setBorder(null);
		txtUserName.setFont(new Font("PT Sans Narrow", Font.PLAIN, 18));
		txtUserName.setBackground(Color.PINK);
		txtUserName.setBounds(139, 62, 233, 26);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		
		JSeparator se1 = new JSeparator();
		se1.setForeground(Color.WHITE);
		se1.setBounds(96, 88, 276, 12);
		panel.add(se1);
		
		JSeparator se2 = new JSeparator();
		se2.setForeground(Color.WHITE);
		se2.setBounds(96, 156, 276, 19);
		panel.add(se2);
		
		txtPassword = new JPasswordField();
		txtPassword.setBorder(null);
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setBackground(Color.PINK);
		txtPassword.setFont(new Font("PT Sans Narrow", Font.PLAIN, 18));
		txtPassword.setBounds(139, 131, 233, 26);
		panel.add(txtPassword);
		
		lbThongBao = new JLabel("");
		lbThongBao.setForeground(Color.RED);
		lbThongBao.setBounds(106, 187, 266, 16);
		panel.add(lbThongBao);
	}
}
