package 배열응용;

public class String연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "감자,고구마,양파";
		String[] s2 = s.split(","); //쉼표를 기준으로 배열을 만듦
		
		for (String string : s2) {
			System.out.println(string);
		}

	
	}

}
