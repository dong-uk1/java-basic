package 배열기본;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class 랜덤한값배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lotto[] = new int[6];

		Random r = new Random();

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = r.nextInt(44)+1;
			
			

		}
		
		for (int i : lotto) {
			System.out.println(i);
		}

	}

}
