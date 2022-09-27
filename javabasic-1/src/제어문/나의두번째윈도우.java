package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의두번째윈도우 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(51, 204, 204));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		lblNewLabel.setBounds(62, 67, 53, 37);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		textField.setBounds(179, 71, 240, 31);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(179, 142, 240, 31);
		f.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		lblNewLabel_1.setBounds(62, 138, 89, 37);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("주소");
		lblNewLabel_1_1.setFont(new Font("휴먼편지체", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(62, 223, 89, 37);
		f.getContentPane().add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("휴먼편지체", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(179, 229, 240, 31);
		f.getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBackground(new Color(51, 102, 102));
		btnNewButton.setFont(new Font("휴먼편지체", Font.BOLD, 18));
		btnNewButton.setBounds(115, 342, 82, 42);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setFont(new Font("휴먼편지체", Font.BOLD, 18));
		btnNewButton_1.setBackground(new Color(51, 102, 102));
		btnNewButton_1.setBounds(293, 342, 82, 42);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ehddn\\OneDrive\\바탕 화면\\이세돌\\비챤.gif"));
		btnNewButton_2.setBounds(146, 67, 326, 261);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
