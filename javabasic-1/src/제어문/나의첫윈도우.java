package 제어문;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. jframe 부품을 만들어주자
		JFrame f = new JFrame();
		
		// 2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(51, 204, 153));
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 14));
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ehddn\\OneDrive\\바탕 화면\\이세돌\\비챤.gif"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("돌아간다");
		f.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		// 3. 새로 만든 부품을 "보여주세요" 설정
		f.setVisible(true);
		
	}

}
