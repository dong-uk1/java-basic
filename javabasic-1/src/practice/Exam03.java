package practice;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tel = JOptionPane.showInputDialog("통신사 입력 : ");
		String num = JOptionPane.showInputDialog("전화번호 : ");
		String name = JOptionPane.showInputDialog("가입자 이름 : ");
		
	
	
		
		
		String total = name + "님은" + tel + "에 " + num +"입니다.";
		// 한 글자 이상은 무조건 이중따옴표
		
	
		
		JOptionPane.showMessageDialog(null, total);

	}

}
