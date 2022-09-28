package 순차문;

import java.util.Scanner;

import javax.swing.JButton;

public class 콘솔입력연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//입력 나이
		
		System.out.println("나에 대한 정보");
		
		
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		
		//처리
		int age2 = ++age;
		
		
		//출력
		System.out.println("내년 나이 : "+age2);

	}

}
