package 배열기본;

public class 배열만들기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = {1, 2, 3, 4, 5, 6, 7};
		// 변수의 개수 >> 9개
		System.out.println("s에 저장된 주소 : " + s);
		System.out.println(s[3]);
		System.out.println(s.length);
		
		
		int[] s2 = new int[5];
		// 변수의 개수 >> 7개?
		System.out.println("s2에 저장된 주소 : " + s2);
		System.out.println(s[0]);
		// 배열은 빈 공간을 여러개 만들 때 자동으로 초기화
		//int > 0, double > 0.0 , boolean > false로 자동 초기화
		
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		s2[s2.length-1] = 500;
		// s2[5] = 600;
		//	int[] s2 = new int[5]; 로 만든건 s2[4] 가 마지막임

		
		System.out.println(s2[4]);
		
	}

}
