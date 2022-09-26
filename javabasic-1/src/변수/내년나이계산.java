package 변수;

import javax.swing.JOptionPane;

public class 내년나이계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력
		String age = JOptionPane.showInputDialog("올 해 나이 입력");
		// 스트링으로 받아 정수가 아님
		
		//처리
		int age2 = Integer.parseInt(age) +1;
		//문자를 정수로 변환
		
		//츨력
		JOptionPane.showMessageDialog(null, "내년 나이는 " + age2);
		

	}

}
