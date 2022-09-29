package 배열기본;

public class 배열만들기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[5];

		num[0] = 100;
		num[1] = 200;
		
		//for-each : 하나씩 처음부터 뒤로가면서 꺼내오는 반복문
		// i는 int역할
		// 위치값이 필요 없음
		// 출력용
		for (int x : num) { // num에서 하나씩 꺼내와라
			System.out.println(x);
			
		}
		
		// 입,출력용
		for (int i = 0; i < num.length; i++) {

			System.out.println(num[i]);
		}
		
		
	}

}
