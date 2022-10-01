package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기장쓰기화면2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3;

	//public static void main(String[] args) {
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(503, 458);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC624\uB298\uB0A0\uC9DC");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(25, 24, 145, 38);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(Color.GREEN);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(197, 24, 267, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC624\uB298\uC81C\uBAA9");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2.setBounds(25, 96, 145, 38);
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBackground(Color.GREEN);
		t2.setBounds(197, 96, 267, 38);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uD30C\uC77C\uC5D0 \uC77C\uAE30 \uC800\uC7A5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				//자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할 때는
				//프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				//반드시 위험한 상황이 발생하면 어떻게 처리할지를 명시해주어야 한다.
				//try~cache
				try {
					//file.txt와 자바프로그램간 스트림(강물, 연결통로)를 만들어라!
					FileWriter file = new FileWriter(s1 + ".txt");
					//스트림을 통해서 데이터를 보내라.
					file.write(s1 + "\n"); //\n이면 엔터를 넣어준다.
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					//스트림이 닫힐 때 데이터를 다 보냈다고 인식함.
					file.close();
				} catch (Exception e1) {
					System.out.println("파일에 저장 중 에러발생함.!!!");
				}
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(44, 337, 387, 70);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC624\uB298\uB0B4\uC6A9");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_2_1.setBounds(25, 168, 145, 38);
		f.getContentPane().add(lblNewLabel_2_1);
		
		t3 = new JTextArea();
		t3.setFont(new Font("Monospaced", Font.BOLD, 30));
		t3.setBackground(Color.GREEN);
		t3.setBounds(197, 180, 267, 134);
		f.getContentPane().add(t3);
		
		
		f.setVisible(true);
	}
}
