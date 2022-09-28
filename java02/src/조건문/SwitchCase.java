package 조건문;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스위치 케이스는 정수(long은 안됨), char, String 가능
		// 자동 break 기능이 없어서 break 걸어줘야 함
		// 사용이 간단하긴 한데 제약이 좀 있다
		String name = "java";
		
		
		switch (name) {
		case "java":
			System.out.println("1103호로");
			break; // 케이스 사이에 브레이크를 안걸어주면 아래까지 다 실행해버림

		case "python":
			System.out.println("1104호로");
			break;
		
		case "linux":
			System.out.println("1102호로");
			break;
			

		default: // else와 동일 > 생략가능
			System.out.println("카운터로 가세요");
			break;
		}

	}

}
