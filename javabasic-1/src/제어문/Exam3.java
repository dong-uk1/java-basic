package 제어문;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exam3 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 204, 153));
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		f.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("먹고싶은 음식");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 78, 143, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("당신의 나이는?");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(12, 208, 156, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_2.setBounds(12, 394, 143, 50);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_3.setBounds(12, 472, 143, 50);
		f.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(197, 78, 240, 50);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(197, 208, 240, 50);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(197, 394, 240, 50);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(197, 472, 240, 50);
		f.getContentPane().add(t4);
		
		JButton b1 = new JButton("어디로 갈까?");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String w1 = t1.getText();
				if (w1.equals("아메리카노") || w1.equals("홍차") || w1.equals("아이스 아메리카노")) {
					JOptionPane.showMessageDialog(f, "카페 가세요");

				} else {
					JOptionPane.showMessageDialog(f, "물이나 마셔요");

				}
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 18));
		b1.setBounds(197, 138, 240, 33);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("나의 내년 나이는?");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String old = t2.getText();
				int old1 = Integer.parseInt(old);
				
				JOptionPane.showMessageDialog(f, ++old1);
				
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 18));
		b2.setBounds(197, 268, 240, 33);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("두 과목 점수의 평균은?");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k = t3.getText();
				String m = t4.getText();
				
				double k1 = Double.parseDouble(k);
				double m1 = Double.parseDouble(m);
				
				double avg = (k1+m1) / 2;
				
				JOptionPane.showMessageDialog(f, avg);
				
				
				
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 18));
		b3.setBounds(197, 532, 240, 33);
		f.getContentPane().add(b3);

	}

}
