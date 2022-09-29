package 배열기본;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class 배열_입력받아처리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

	
		System.out.println(a[0] + a[2]);
		
		
		String b[] = new String[3];
		
		b[0] = "자바";
		b[1] = "스프링";
		b[2] = "JSP";
		
		System.out.println(b[0] + " 보다는 " +b[1] );
		
		
	}

}
