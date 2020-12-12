package view.buoihop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class XemVanBan extends JPanel {
	private String fileContent;
	private JTextPane txtNoiDung;
	private static XemVanBan instance;

	private XemVanBan(String content, JPanel themsuKienPanel) {
		this.fileContent = content;
		initComponents(themsuKienPanel);
	}
	
	private void initComponents(JPanel themsuKienPanel) {
		setBorder(null);
		setBackground(new Color(135, 206, 235));
		setBounds(0, 0, 710, 442);
		setLayout(null);
		
		JButton btnBack = new JButton("");
		btnBack.setBounds(660, 407, 44, 29);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				themsuKienPanel.setVisible(true);
			}
		});
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnBack.setIcon(new ImageIcon("images/back.png"));
		add(btnBack);
		
		JLabel lbTitle = new JLabel("Văn bản buổi họp");
		lbTitle.setFont(new Font("PT Sans", Font.PLAIN, 20));
		lbTitle.setBounds(6, 407, 164, 25);
		add(lbTitle);
		
		JButton btnSave = new JButton("Lưu");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNoiDung.setEditable(false);
			}
		});
		btnSave.setForeground(new Color(30, 144, 255));
		btnSave.setBounds(589, 407, 59, 29);
		add(btnSave);
		
		JButton btnChange = new JButton("Chỉnh Sửa");
		btnChange.setForeground(new Color(30, 144, 255));
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNoiDung.setEditable(true);
			}
		});
		btnChange.setBounds(466, 407, 117, 29);
		add(btnChange);
		
		txtNoiDung = new JTextPane();
		txtNoiDung.setBorder(new LineBorder(new Color(153, 50, 204), 4, true));
		txtNoiDung.setText(fileContent);
		txtNoiDung.setBounds(6, 6, 698, 388);
		add(txtNoiDung);
	}
	
	public String getFileContent() {
		return fileContent;
	}
	
	public static XemVanBan getInstance(String content, JPanel themsuKienPanel) {
		if(instance == null) {
			instance = new XemVanBan(content, themsuKienPanel);
		}
		return instance;
	}
}
