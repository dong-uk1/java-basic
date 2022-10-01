package 클래스사용하기;

import 클래스만들기.강아지;
//class 의 위치를 지정함
import 클래스만들기.전화기;

public class 내방프로젝트 {

	public static void main(String[] arg) {
		//전화기 한 대 넣어보세요
		전화기 p1 = new 전화기(); // 자동완성하면 클래스 위치도 찾아줘서 편함
		//p1은 참조형 변수(주소)
		
		System.out.println(p1);
		
		p1.size = 11;
		p1.speaker = "바나나사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		
		//전화기 1대 추가
		//전화기 속성 기능
		
		전화기 p2 = new 전화기();
		
		p2.size = 22;
		p2.speaker = "소니";
		p2.사진을찍다();
		
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		
		//강아지 1마리 추가
		//강아지 속성 동작
		
		강아지 d1 = new 강아지();
		
		d1.color = "black";
		d1.bark = "bark";
		d1.꼬리를흔들다();
		
		System.out.println(d1.color);
		System.out.println(d1.bark);
		
		
		
	
  }
}
