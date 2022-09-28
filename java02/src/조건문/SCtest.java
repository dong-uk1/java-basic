package 조건문;

import java.util.Scanner;

public class SCtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 : ");
		String pass = sc.next();		
		
		
		
		
		switch (pass) {
		case "pass":
			System.out.println("들어오세요");
			break;

		default:
			System.out.println("나가세요");
			break;
		}
		
		
		
		String menu = sc.next();		
		
		switch (menu) {
		case "짜장면":
			System.out.println("중국집으로 가요");
			break;

		case "라면":
			System.out.println("분식집으로 가요");
			break;
		
		case "회":
			System.out.println("횟집으로 가요");
			break;

		default:
			System.out.println("그냥 안먹어요");
			break;
		}

	}

}
