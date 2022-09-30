package 배열응용;

public class 배열복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본 데이터를 다른 변수에 복사

		int math1 = 100;
		int math2 = math1;

		System.out.println(math1);
		System.out.println(math2);
		math2 = 90;
		System.out.println(math2);
		// 기본 데이터는 이렇게 복사해도 됨

		// 참조형 복사

		int[] n1 = { 100, 200, 300 };
		int[] n2 = n1; // 값이 복사가 된 게 아니라 주소가 복사된거임
		int[] n3 = n1.clone(); // 값 복사

		for (int i : n1) {
			System.out.println("n1 : " + i);
		}
		
		for (int i : n2) {
			System.out.println("n2 : " + i);
		}
		
		n2[0] = 200;

		for (int i : n1) {
			System.out.println("n1 : " + i);
		}
		System.out.println("");
		for (int i : n2) {
			System.out.println("n2 : " + i);
		}
		// 주소를 복사한거라 n2를 바꿨음에도 n1이 같이 바뀜
		
		System.out.println("");
		n3[0] = 700;
		for (int i : n1) {
			System.out.println("n1 : " + i);
		}
		System.out.println("");
		for (int i : n3) {
			System.out.println("n2 : " + i);
		}
		//n3만 바뀜
		
		
	}

}
