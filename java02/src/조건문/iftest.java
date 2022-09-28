package 조건문;

public class iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "ok";
		
		if (data.equals("ok")) {
			System.out.println("긍정");
		
		//else를 쓰면 위에 if가 맞다면 아래쪽은 실행하지 않음
		//그래서 굳이 다 비교해야 하는 경우라면 else if 는 쓰면 안됨
		}else if (data.equals("no")) {
			System.out.println("부정");
		
		//자바에서는 if(50<= x <60); 이런거 안됨;;
		
		}else {
			System.out.println("잘 모르겠음");
		}

	}

}
