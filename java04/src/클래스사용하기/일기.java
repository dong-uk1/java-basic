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
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class 일기 {
	private static JTextField date;
	private static JTextField title;

	public static void open() {
		

		
		JFrame f = new JFrame();
		f.setType(Type.UTILITY);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel l2 = new JLabel("날짜");
		l2.setFont(new Font("굴림", Font.BOLD, 20));
		l2.setBounds(48, 59, 71, 35);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("제목");
		l3.setFont(new Font("굴림", Font.BOLD, 20));
		l3.setBounds(48, 124, 91, 35);
		f.getContentPane().add(l3);
		
		JLabel lblSodyd = new JLabel("내용");
		lblSodyd.setFont(new Font("굴림", Font.BOLD, 20));
		lblSodyd.setBounds(48, 198, 91, 35);
		f.getContentPane().add(lblSodyd);
		
		date = new JTextField();
		date.setFont(new Font("굴림", Font.BOLD, 15));
		date.setBounds(170, 61, 220, 35);
		f.getContentPane().add(date);
		date.setColumns(10);
		
		title = new JTextField();
		title.setFont(new Font("굴림", Font.BOLD, 15));
		title.setColumns(10);
		title.setBounds(170, 126, 220, 35);
		f.getContentPane().add(title);
		
		JTextPane text = new JTextPane();
		text.setBounds(170, 198, 220, 145);
		f.getContentPane().add(text);
		
		
		
		JButton save = new JButton("저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = date.getText();
				String s2 = title.getText();
				String s3 = text.getText();
				
				
				// 자바프로그램 밖에 있는 자원들을 연결할 때는
				// 프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				// 반드시 위험 상황이 발생하면 어떻게 처리할 지를 명시해 주어야 한다
				// 그게 try~catch 함수임    
				try {
					//file.txt 와 자바간 스트림(통로)을 만듦
					FileWriter file = new FileWriter(s1 + ".txt");
					//스트림을 통해 데이터를 보냄
					file.write(s1 + "\n"); // \n이면 엔터를 넣어줌 
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					//스트림이 닫힐 때 데이터를 다 보냈다고 인식
					file.close();
				} 
				
				
				catch (Exception e1) {
					System.out.println("파일 저장 중 에러발생");
				}
			}
		});
		save.setFont(new Font("굴림", Font.BOLD, 20));
		save.setBounds(275, 361, 130, 46);
		f.getContentPane().add(save);
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
  }
}
