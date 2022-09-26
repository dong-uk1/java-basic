package practice;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String width = JOptionPane.showInputDialog("가로 : ");
		String length = JOptionPane.showInputDialog("세로 : ");
		
		int width1 = Integer.parseInt(width);
		int length1 = Integer.parseInt(length);
		
		int quad = width1 * length1 ;
		
		JOptionPane.showMessageDialog(null, "사각형의 면적은 :" + quad);

	}

}
