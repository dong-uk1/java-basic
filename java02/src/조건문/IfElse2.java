package 조건문;

public class IfElse2 {
	public static void main(String[] args) {

		int jumsu = 88;
		// result 안에는 쓰레기값이 들어가 있음
		String result = "";
		// result 공간을 초기화
		// 변수 선언할 때는 초기값을 넣어주는게 좋음 > 안그러면 에러 생기기 좋음
		
		// if else 는 조건이 맞으면 break를 걸고 아래의 조건을 실행하지 않음

		if (jumsu >= 90) {
			result = "A학점";

		} else if (jumsu >= 85 && jumsu < 90) {
			result = "B+학점";

		} else if (jumsu >= 80 && jumsu < 85 ) {
			result = "B-학점";

		
		} else if (jumsu >= 70) {
			result = "C학점";

		} else {
			result = "D학점";
		}

		System.out.println(result);
	}
}
