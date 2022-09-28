package 반복문;

import java.util.Iterator;

public class for문연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("★");
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("커피");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("커피우유");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"짱");
		}
		// 이렇게 써도 i++이 가장 나중에 실행된다
		
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
