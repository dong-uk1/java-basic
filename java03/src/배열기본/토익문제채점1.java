package 배열기본;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class 토익문제채점1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int 답안지[] = new int[990];
		int 내답안[] = new int[990];
		int 점수 = 0;

		Random r = new Random();

			System.out.println("번호:\t답안\t내답");
			System.out.println("--------------");
		
			for (int i = 0; i < 답안지.length; i++) {
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;
			
			System.out.println(i + 1 + ":\t" + 답안지[i] + "\t" + 내답안[i]);

		}

		

	
		
		
		for (int i = 0; i < 답안지.length; i++) {

			if (내답안[i] == 답안지[i]) {
				점수++;
			}

		}
		
		System.out.println("내 점수 : "+점수);
		
		if (점수 > (답안지.length/4)) {
			System.out.println("잘 찍었네");
		} else {
			System.out.println("운이 없네");
			
		}

	}

}
