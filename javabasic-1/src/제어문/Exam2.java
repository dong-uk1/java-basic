package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam2 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		JButton plu = new JButton("더하기");
		plu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//버튼을 눌렀을 때 처리하고 싶은 내용을 입력 (actionPerformed안에)
				
				JOptionPane.showMessageDialog(f, "플러스버튼을 누르셨군요");
				//앞에 f는 뜨는 위치 설정하는 것
				
				// 1. 두 수를 가지고 와라
				String n1 = t1.getText(); // 200
				String n2 = t2.getText();
				
				// 2. 숫자로 변경
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				// 3. 결과 출력
				// JOptionPane.showMessageDialog(f, n11 + n22);
				f.setTitle("더한 결과는" + (n11 + n22)); // 라벨에다 결과 출력
				
				t1.setText(""); // 텍스트 초기화
				t2.setText("");
				t1.setBackground(Color.blue);
				t1.setForeground(Color.red);
				t2.setBackground(Color.blue);
				t2.setForeground(Color.red);
				
			}
		});
		plu.setFont(new Font("굴림", Font.BOLD, 18));
		plu.setBounds(96, 546, 94, 55);
		f.getContentPane().add(plu);
		
		JButton minu = new JButton("빼기");
		minu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(minu, "마이너스 버튼을 누르셨군요");
				
				// 1. 두 수를 가지고 와라
				String n1 = t1.getText(); // 200
				String n2 = t2.getText();
				
				// 2. 숫자로 변경
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				// 3. 결과 출력
				JOptionPane.showMessageDialog(f, n11 - n22);
				
				t1.setText("");
				t2.setText("");
			}
		});
		minu.setFont(new Font("굴림", Font.BOLD, 18));
		minu.setBounds(291, 546, 94, 55);
		f.getContentPane().add(minu);
		
		JLabel num1 = new JLabel("숫자 1");
		num1.setForeground(new Color(51, 0, 255));
		num1.setFont(new Font("굴림", Font.BOLD, 20));
		num1.setBounds(76, 388, 65, 43);
		f.getContentPane().add(num1);
		
		JLabel num2 = new JLabel("숫자 2");
		num2.setForeground(new Color(51, 0, 255));
		num2.setFont(new Font("굴림", Font.BOLD, 20));
		num2.setBounds(76, 469, 65, 43);
		f.getContentPane().add(num2);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 204, 0));
		t1.setBounds(178, 388, 226, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 204, 0));
		t2.setColumns(10);
		t2.setBounds(178, 469, 226, 34);
		f.getContentPane().add(t2);
		
		JLabel pic = new JLabel("");
		pic.setVerticalAlignment(SwingConstants.TOP);
		pic.setIcon(new ImageIcon("C:\\Users\\ehddn\\OneDrive\\바탕 화면\\제리감사.gif"));
		pic.setForeground(new Color(255, 255, 255));
		pic.setFont(new Font("굴림", Font.BOLD, 20));
		pic.setBounds(30, 10, 428, 341);
		f.getContentPane().add(pic);
		f.setVisible(true);


	}

}
