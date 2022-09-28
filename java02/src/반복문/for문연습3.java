package 반복문;

import java.util.Iterator;

public class for문연습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int sum1 = 0;
		
		for (int i = 1; i <= 10000; i++) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		System.out.println("----------------");
		
		for (int j = 3; j <= 11; j++) {
			sum1 = sum1 + j;			
		}
		
		System.out.println(sum1);
	}

}
