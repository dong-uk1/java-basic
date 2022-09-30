package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class _2차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		
		String[] header = {"a","b","c"};
		String[][] contents = {
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"},
				{"1","2","3"}		
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		contents[0][0] = "999"; //가로 0번째줄의 0번째 자료를 바꿈
		contents[7][1] = "999";
		
		
		//1차원 배열 하나가 for문 하나
		//contents.length 가 1차원 배열의 개수를 구해줌
		//이중for문
		for (int i = 0; i < contents.length; i++) { // 행 개수
			for (int j = 0; j < contents[i].length; j++) { //열 갯수, 모든 열의 개수가 다를 수 있다는 가정
				System.out.print(contents[i][j]+" "); // i는 행, j는 열	// 한 줄임
			}
			System.out.println(); // 한줄하고 한줄 넘어가라는 의미에서 사용, 위엔 그냥 프린트니까
			
		}
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
