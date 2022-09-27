package 연산자;

public class 산술연산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스는 대문자로 하는게 나중에 편하다
		int a = 100;
		int b = 200;
		
		System.out.println("더한 값은 " + a+b);
		// 100200으로 출력 >>>방향으로 연산하기에 더한 값은 + a 가 스트링이 되어서
		// 산술연산이 아닌 스트링인 결과가 나옴
		System.out.println("더한 값은 " + (a+b));

	}

}
