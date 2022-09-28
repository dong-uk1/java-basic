package 조건문;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		java.util.Date date = new java.util.Date();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이번 달은 며칠 까지인가?");
		int month = sc.nextInt();
		
		// int month = date.getMonth()+1;
		
		
		switch (month) {
		case 4:
		case 6:
		case 7:
		case 11:
			System.out.println("30일 까지");
			break;
			
		case 2:
			System.out.println("28일 까지");
			
		default:
			System.out.println("31일 까지");
			break;
		}
		
		

	}

}
