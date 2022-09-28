package 반복문;

import java.util.Iterator;

public class for문연습3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 33; i <= 222; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

		System.out.println("----------------");

		for (int j = 55; j <= 4500; j = j + 2) {
			sum1 = sum1 + j;
		}

		System.out.println(sum1);

		System.out.println("----------------");

		for (int i = 0; i <= 6000; i = i + 5) {
			sum2 = sum2 + i;

		}
		System.out.println(sum2);

		System.out.println("----------------");

		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum3 >= 100) {
				break; // break를 포함하고 있는 블럭, for문을 멈춤
			}

			else if (i % 5 == 0) {
				//아래 연산 하지 말고 반복
				continue;
			}

			sum3 = sum3 + i;

		}
		System.out.println(sum3);

	}

}
