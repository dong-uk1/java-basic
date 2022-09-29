package 배열기본;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기2 {

	// 전체 영역에서 특정 변수를 사용하려면 클래스 아래에 선언해야한다
	static int start = 2; // 전역변수

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 영화 제목
		String[] title = { "다만", "오케이", "짱구", "테넷", "해적" };

		// 포스터 파일
		String[] img = { "다만.png", "오케이.png", "짱구.png", "테넷.png", "해적.png" };

		// 평점
		double[] jumsu = { 9.9, 8.9, 7.9, 6.9, 5.9 };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setSize(436, 427);

		JLabel top = new JLabel("짱구");
		top.setBackground(new Color(240, 240, 240));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[start]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);

		JLabel under = new JLabel("7.9");
		under.setBackground(new Color(255, 255, 0));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);

		JButton left = new JButton("<<");
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start = start - 1;
				if (start < 0) {
					start = 4;
				}
				top.setText(title[start]);
				under.setText(jumsu[start] + "점");
				// 원래 double이라 안되는데 String인 "점"을 넣음으로 jumsu도 스트링이 됨
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
				
			}
		});
		left.setBackground(new Color(0, 255, 0));
		left.setFont(new Font("굴림", Font.BOLD, 59));
		f.getContentPane().add(left, BorderLayout.WEST);

		JButton right = new JButton(">>");
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start = start + 1;
				if (start == 5) {
					start = 0;
				} 
				top.setText(title[start]);
				under.setText(jumsu[start] + "점");
				
				center.setIcon(icon);

			}
		});
		right.setBackground(new Color(0, 255, 0));
		right.setFont(new Font("굴림", Font.BOLD, 59));
		f.getContentPane().add(right, BorderLayout.EAST);
		f.setVisible(true);

	}

}
