package 연산자;

import javax.swing.JOptionPane;

public class 네이버로그인제대로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "root";
		String pw = "pass";
		
		String id2 = JOptionPane.showInputDialog("로그인 아이디");
		String pw2 = JOptionPane.showInputDialog("로그인 패스워드");
		
		//스트링은 기본형이 아니라 값을 비교할 때 연산자를 쓸 수 없음..
		
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		

	}

}
