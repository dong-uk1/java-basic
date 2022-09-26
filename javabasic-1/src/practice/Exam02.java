package practice;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tall = JOptionPane.showInputDialog("키 입력 ");
		double tall1 = Double.parseDouble(tall);
		double tall2 = (tall1 - 100)*0.9;
		
		JOptionPane.showMessageDialog(null, "적정 몸무게는 :" + tall2);
		
		
		

	}

}
