package 제어문;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1번
		char p1 = 'p';
		char p2 = 'q';
		// 같은 값이면 기본형이 더 빠르다

		if (p1 == p2) {
			System.out.println("PASS!");
		} else {
			System.out.println("재입력!");

		}

		// 2번
		String weight = JOptionPane.showInputDialog("어제의 몸무게");
		String weight2 = JOptionPane.showInputDialog("오늘의 몸무게");

		double w1 = Double.parseDouble(weight);
		double w2 = Double.parseDouble(weight2);

		if ((w1 - w2) > 2) {

			System.out.println("다이어트 성공");

		} else {
			System.out.println("다이어트 실패");

		}

		// 3번
		if (p1 == p2 && (w1 - w2) > 2) {
			System.out.println("오늘은 성공");

		} else {

			System.out.println("내일 다시 도전");
		}

		// 4번

		int 체육 = 66;
		int 수학 = 77;
		int 영어 = 88;
		int 국어 = 99;

		double sum = 체육 + 수학 + 영어 + 국어;
		//정수와 정수 계산은 무조건 정수, 계산 결과가 실수가 나오더라도 실수를 잘라서 정수로 만들어버림
		double avg = sum / 4;
		// 실수가 하나라도 섞이면 결과는 실수가됨
		// sum 이나 4를 실수로 만들어주면 됨  ex) 4> 4.0으로 고쳐쓰면 실수값으로 계산됨

		System.out.println("평균은 " + avg);

		// 5번

		final double PI = 3.14; // 상수 취급
		double rad = 2.2;

		double round = PI * (rad * rad);

		
		System.out.printf("%.2f", round);
	}

}
