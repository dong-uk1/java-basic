package 조건문;

import java.util.Date;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 빨간 밑줄 클릭하고 f2 누르면 fix도움말 나옴
		Date date = new Date();
		int month = date.getMonth() + 1; // 한 달 적게 나온다 그래서 +1
		int day = date.getDay(); // 0이 일요일 6이 토요일 > int로 온다
		
		switch (day) {
		case 0:		case 6:
			System.out.println("주말엔 놀자");
			break;

		default:
			System.out.println("java 공부하자");
			break;
			
		}
		
		
		

	}

}
