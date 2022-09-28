package 순차문;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//
		
		System.out.print("나의 이름은? ");
		String name = sc.next();
		
		System.out.print("나의 키는? ");
		Double tall = sc.nextDouble();
		
		System.out.print("나의 몸무게는? ");
		Double weight = sc.nextDouble();
		
		System.out.print("나는 저녁을 먹었나요? ");
		Boolean dinner = sc.nextBoolean();
		
		sc.nextLine();
		//Line은 엔터를 인식, 위에서 엔터를 쳤기때문에 좌우명이 입력되지 않음
		// 빈 Line 하나를 만들어서 엔터 무시
		//코테에서 정도만 씀
		System.out.print("나의 좌우명은? ");
		String motto = sc.nextLine();
		
		
		System.out.println("-----------------");
		
		//
		
		System.out.println("내 이름은 "+ name +"입니다");
		System.out.println("내 내년 키는 " + (tall+11) +"입니다");
		System.out.println("내 내년 몸무게는 "+ (weight-10) +"입니다");
		System.out.println("나는 저녁을 "+ dinner +"했습니다");
		System.out.println("나의 좌우명은 "+ motto +"입니다");
		

	}

}
