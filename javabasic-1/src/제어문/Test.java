package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		JButton btnNewButton = new JButton("남쪽");
		btnNewButton.setFont(new Font("휴먼매직체", Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		f.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("북쪽");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("서쪽");
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setFont(new Font("휴먼옛체", Font.BOLD, 15));
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setFont(new Font("새굴림", Font.BOLD, 16));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("중앙");
		btnNewButton_4.setBackground(new Color(153, 102, 204));
		f.getContentPane().add(btnNewButton_4, BorderLayout.CENTER);
		f.setVisible(true);
		
	}

}
