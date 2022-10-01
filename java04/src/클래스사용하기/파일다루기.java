package 클래스사용하기;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class 파일다루기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = JOptionPane.showInputDialog("날짜");
		String s2 = JOptionPane.showInputDialog("제목");
		String s3 = JOptionPane.showInputDialog("내용");
		
		
		// 자바프로그램 밖에 있는 자원들을 연결할 때는
		// 프로그램이 실행되지 못하는 위험한 상황으로 인식해서
		// 반드시 위험 상황이 발생하면 어떻게 처리할 지를 명시해 주어야 한다
		// 그게 try~catch 함수임
		try {
			//file.txt 와 자바간 스트림(통로)을 만듦
			FileWriter file = new FileWriter("file.txt");
			//스트림을 통해 데이터를 보냄
			file.write(s1 + "\n"); // \n이면 엔터를 넣어줌 
			file.write(s2 + "\n");
			file.write(s3 + "\n");
			//스트림이 닫힐 때 데이터를 다 보냈다고 인식
			file.close();
		} 
		
		catch (Exception e) {
			System.out.println("파일 저장 중 에러발생");
		}
	}

}
