package 배열기본;

public class 배열여러개활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] 식구 = { "아버지", "어머니", "나" };
		int[] 나이 = { 100, 50, 20 };
		double[] 키 = { 177.7, 156.4, 164.2 };

		System.out.println(식구[2] + " " + 나이[2] + " " + 키[2]);

		for (int i = 0; i < 키.length; i++) {
			
			System.out.println(식구[i] + " " + 나이[i] + " " + 키[i]);
		}
		

	}

}
