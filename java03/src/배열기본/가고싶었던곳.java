package 배열기본;

import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

public class 가고싶었던곳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String 작년[] = new String[3];
		String 올해[] = new String[3];
		int 동일 = 0;

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 작년.length; i++) {

			System.out.print("작년에 가고 싶었던 곳 " +(i+1)+"순위: ");
			작년[i] = s.next();

		}

		for (int i = 0; i < 올해.length; i++) {
			System.out.print("올해 가고 싶은 곳 " +(i+1)+"순위: ");
			올해[i] = s.next();
			
			if (작년[i].equals(올해[i])) {
			동일++;
			
		}
		
		

		}
		System.out.println("작년과 올해 가고 싶은 곳이 동일한 곳은 " + 동일 + "곳이다.");

	}

}
