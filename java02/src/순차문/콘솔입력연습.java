package 순차문;

import java.util.Scanner;

public class 콘솔입력연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 을 새로 만들어서
		// 이클립스의 콘솔뷰에서 입력을 받아보자

		Scanner sc = new Scanner(System.in);
		// System.in >> 키보드
		// System.out >> 모니터
		
		
		// Scanner 은 입력전에 무엇을 입력할 지 먼저 프린트하는게 좋음
		System.out.print("이름을 입력 : ");
		String name = sc.next(); // 입력을 String으로 받는다
		//println은 프린트하고 줄바꿈 >> ln 빼면 바로 옆으로 들어감
		System.out.println("입력받은 이름은 " +  name +"입니다.");
		
		System.out.print("소속을 입력 : ");
		String com = sc.next();
		System.out.println("입력받은 소속은 " + com + "입니다");
	}

}
