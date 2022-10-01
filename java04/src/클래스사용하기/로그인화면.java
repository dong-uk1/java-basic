package 클래스사용하기;

import javax.swing.JFrame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField id;
	private static JTextField pw;

	public static void main(String[] arg) {
		
		String a1 = "root";
		String a2 = "1234";
		
		JFrame f = new JFrame();
		f.setType(Type.UTILITY);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon("C:\\Users\\ehddn\\eclipse-workspace\\java04\\짱구.png"));
		l1.setBounds(133, 29, 204, 156);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("아이디");
		l2.setFont(new Font("굴림", Font.BOLD, 20));
		l2.setBounds(64, 212, 71, 35);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("비밀번호");
		l3.setFont(new Font("굴림", Font.BOLD, 20));
		l3.setBounds(64, 277, 91, 35);
		f.getContentPane().add(l3);
		
		id = new JTextField();
		id.setFont(new Font("굴림", Font.BOLD, 15));
		id.setBounds(201, 212, 220, 35);
		f.getContentPane().add(id);
		id.setColumns(10);
		
		pw = new JTextField();
		pw.setFont(new Font("굴림", Font.BOLD, 15));
		pw.setColumns(10);
		pw.setBounds(201, 277, 220, 35);
		f.getContentPane().add(pw);
		
		JButton login = new JButton("로그인");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id1 = id.getText();
				String pw1 = pw.getText();
				일기 diary = new 일기();
				if (id1.equals(a1) && pw1.equals(a2)) {
					System.out.println("로그인 되었습니다");
					JOptionPane.showMessageDialog(f, "로그인 되었습니다");
					
					diary.open();
					
					
				} else {
					System.out.println("잘못 입력하였습니다");
					JOptionPane.showMessageDialog(f, "잘못 입력하였습니다");

				}
				
			}
		});
		login.setFont(new Font("굴림", Font.BOLD, 20));
		login.setBounds(81, 361, 126, 46);
		f.getContentPane().add(login);
		
		JButton del = new JButton("리셋");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				pw.setText("");
				
			}
		});
		del.setFont(new Font("굴림", Font.BOLD, 20));
		del.setBounds(275, 361, 130, 46);
		f.getContentPane().add(del);
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
  }
}
