package 반복문;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 숫자맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int target = r.nextInt(100); // 100 이하로 랜덤
		
//		int target = 88;
		int count = 0;
		int wrong = 0;
				
	

		
		while (true) { // 무한루프
			//String data = JOptionPane.showInputDialog("생각한 숫자는? : ");
			//int data2 = Integer.parseInt(data);
			
			System.out.print("생각한 숫자는? : ");
			int data2 = sc.nextInt();
			
			if (data2 == target) {
				//JOptionPane.showMessageDialog(null, "정답입니다");
				//무한루프를 끝내는 처리를 해야함
				//break; // while의 break, if는 알아서 break
				count++;
				System.out.print("정답입니다. : " + target);
				System.out.println(" 전체 시도 횟수는 : " + count);
				
				System.exit(0); // 이 프로그램 자체를 끝내라
				// 이 이후의 프로세스들은 파괴되어 실행되지 않음
				
			} else {
				//JOptionPane.showMessageDialog(null, "오답입니다");
				System.out.println("오답입니다");
				count++;
				wrong++;
				
				if (data2 > target) {
					System.out.print("너무 큽니다. ");
					System.out.println("틀린 횟수는 : " + wrong);

					
				} else {
					System.out.print("너무 작습니다. ");
					System.out.println("틀린 횟수는 : " + wrong);


				}
			} 
		}//while
		
		//루프를 끝내지 않아서 이 이후에 도달이 안돼서 오류 unreachable code
		//System.exit(0); 때문에 강제 종료되어 실행되지 않음
		//JOptionPane.showMessageDialog(null, "다음에 또 오세요");

	}

}
