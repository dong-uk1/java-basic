package 반복문;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int iu = 0;
		int you = 0;
		int bts = 0;

		while (true) {
			System.out.println("");
			System.out.print("인기투표 : 1.아이유 2.유재석 3.BTS >>");
			int fav = sc.nextInt();

			if (fav == 1) {
				iu++;
				System.out.println("아이유 - " + iu + "/ 유재석  - " + you + "/ BTS  -" + bts);
			} else if (fav == 2) {
				you++;
				System.out.println("아이유 - " + iu + "/ 유재석  - " + you + "/ BTS  -" + bts);
			} else if (fav == 3) {
				bts++;
				System.out.println("아이유 - " + iu + "/ 유재석  - " + you + "/ BTS  -" + bts);
			} else {
				System.out.println("없는 번호");

			}

			while (true) {
				System.out.print("투표를 종료할까요? (o/x) ");
				String next = sc.next();
				if (next.equals("o")) {

					System.out.println("투표 결과 아이유 : " + iu + " 유재석 : " + you + " BTS : " + bts);
					System.out.println("투표를 종료합니다");
					System.exit(0);

				} else if (next.equals("x")) {
					System.out.println("계속합니다");
					break;

				}

				else {
					System.out.println("잘못된 입력입니다");
				}
			}

			// 굳이 while 안넣어도 돌아간다
			// 넣을거면 break 빼라
			// else(잘못된 입력) 도 빼야 맞다

		}

	}

}
