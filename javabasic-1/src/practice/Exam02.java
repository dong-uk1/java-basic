package practice;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tall = JOptionPane.showInputDialog("키 입력 ");
		double tall1 = Double.parseDouble(tall);
		double tall2 = (tall1 - 100)*0.9;
		// 자바는 연산시 연산하는 데이터중 하나라도 실수라면 결과는 무조건 실수! 그래서 double 써야함
		
		JOptionPane.showMessageDialog(null, "적정 몸무게는 :" + tall2);
		
		
		

	}

}
