package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		
		int a1 = 0;
		int a2 = 0;
		

		while (true) {

			//System.out.print("숫자입력 1 :");
			//int n1 = sc.nextInt();
			int n1 = r.nextInt(100);

			//System.out.print("숫자입력 2 :");
			//int n2 = sc.nextInt();
			int n2 = r.nextInt(100);

			if (n1 > n2) {
				a1++;
				System.out.println("앞 : "+n1+ " 뒤 : "+ n2   );
				System.out.println("앞 숫자가 더 큽니다.");
				System.out.println(a1+ " vs "+ a2   );
				
				
			} else if (n1 == n2) {
				System.out.println("동일함.");

			} else {
				a2++;
				System.out.println("앞 : "+n1+ " 뒤 : "+ n2   );
				System.out.println("뒷 숫자가 더 큽니다.");
				System.out.println(a1+ " vs "+ a2   );
				
			}

			
			
			while (true) {
				System.out.print("종료할까요? (o/x) ");
				String next = sc.next();
				if (next.equals("o")) {

					System.out.println("종료합니다");
					System.exit(0);

				} else if (next.equals("x")) {
					System.out.println("계속합니다");
					break;

				}

				else {
					System.out.println("잘못된 입력입니다");

				} 
			}

		} // while

	}

}
