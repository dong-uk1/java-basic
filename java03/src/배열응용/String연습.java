package 배열응용;

public class String연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sn = "931212-1035715";
		String phone = "011-245-1234";
		String phone1 = " 011-245-1234 "; // 공백도 하나의 문자로 친다
		String p = phone1.trim(); // 맨 앞과 뒤의 공백을 없애줌. 중간은 안됨
		String[] p2 = phone.split("-");
		
		if (phone.substring(0, 3).equals("011")) {
			System.out.println("sk");
		} else if (phone.substring(0, 2).equals("019")) {
			System.out.println("lg");

		} else {
			System.out.println("apple");

		}
		//
		
		if (phone.substring(4).length() >= 9 ) {
			System.out.println("최신폰");
			
		} else {
			System.out.println("올드폰");

		}
		
		if (p2[1].length() >= 4  ) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		//
		if (phone.length() > 10) {
			System.out.println("유효한 전화번호");
				
		} else {
			System.out.println("유효하지 않은 전화번호");

		}
		

	}

}
