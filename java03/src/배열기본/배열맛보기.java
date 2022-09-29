package 배열기본;

public class 배열맛보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//무더기에 저장될 데이터를 미리 알고 있는 경우
		int[] 정답 = {1, 1, 2, 3 };
		// int[] : int 데이터가 무더기로 저장된 위치(주소)
		// 정답 : 주소가 저장됨
		// {1, 1, 2, 3 } : 무더기 영역에 저장된 정수 데이터들
		// 데이터의 총 갯수는 주소공간, length공간 까지 +2 해서 6개다
		
		System.out.println(정답);
		
		int[] 내답 = {1, 2, 4, 3};
		
		// 무더기에 저장될 데이터를 처음에 모르고 있다가 나중에 넣는 경우
		// 공간만 만들어 놓고 나중에 넣기
		
		int[] 공간들 = new int[1000];
		// 공간을 1000개 만들어라
		
		double[] height = {123.4, 234.2, 124.5};
		
		double[] save = new double[500];
		
		char[] gender = {'남', '여', '남'};
		
		String[] save1 = new String[333];

	}

}
