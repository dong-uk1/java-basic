package 배열기본;

import java.util.Scanner;

public class 배열_입력받아처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		
		System.out.println(a.length);
		
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(i+"번째 숫자를 입력 : ");
			a[i] = s.nextInt();
			
		}	
		
		for (int i : a) {
			System.out.println(i);
		}
			
		
		System.out.println(a[0] + a[3]);
	}

}
