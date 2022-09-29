package 배열기본;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장예매시스템 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame();
		f.setSize(550,750);
		
		//레이아웃 부품 지정
		//물처럼 흐르듯 왼쪽부터 하나씩 순서대로 붙여주는 배치 부품을 만들어서 f에 설정
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
//		JButton b1 = new JButton("좌석1");
//		JButton b2 = new JButton("좌석2");
//		JButton b3 = new JButton("좌석3");
//		
//		f.add(b1); // 붙이는 함수
//		f.add(b2);
//		f.add(b3);
//		
		
		int[] seat = new int[500];
		
		
		for (int i = 0; i < 500; i++) {
			JButton b =new JButton(i+"");
			f.add(b);
			
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String s = e.getActionCommand(); // 버튼위의 글자를 가져다 줌
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false);
					b.setBackground(Color.red);
					int index = Integer.parseInt(s);
					seat[index] = 1;
					
					int count = 0;
					for (int j : seat) {
						if (j == 1){
							count++;
						}
					}
					int cost = 13000 * count;
					// 13000원, 결제금액
					JOptionPane.showMessageDialog(f,"예약된 자석은" + count + "개");
					JOptionPane.showMessageDialog(f,"총 결제금액은 " + cost + "원 입니다");
					

					
				}
			});
		}
		
		
		f.setVisible(true); // 위에 있는걸 보여주기 때문에 맨 밑에 있어야 하는 코드
	}

}
