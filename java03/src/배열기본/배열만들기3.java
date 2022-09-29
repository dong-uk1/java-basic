package 배열기본;

public class 배열만들기3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		
		System.out.println(a.length);
		
		a[0] = 100;
		a[4] = 500;
		a[2] = 200;
		
		System.out.println(a[0]);
		System.out.println(a[4]);
		System.out.println(a[2]);
		
		for (int i : a) {
			System.out.println(i);
		}
		
		
		for (int i = 0; i < a.length; i++) {

			System.out.println(i +") : "+ a[i]);
		}
		
		
	}

}
