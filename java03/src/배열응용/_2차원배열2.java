package 배열응용;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class _2차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f = new JFrame();
		f.setSize(600,400);
		
		
		String[] header = {"컴퓨터","영어","수학","체육"};
		String[][] contents = {
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
			
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
				
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
				
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
				
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
				
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
				
				{"100","88","99","77"},
				{"60","87","79","78"},
				{"90","83","89","79"},
				
		};
		
		contents[0][0] = "999"; //가로 0번째줄의 0번째 자료를 바꿈
		contents[7][1] = "999";
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		//1차원 배열 하나가 for문 하나
		//contents.length 가 1차원 배열의 개수를 구해줌
		//이중for문
		for (int i = 0; i < contents.length; i++) { // 행 개수
			for (int j = 0; j < contents[i].length; j++) { //열 갯수, 모든 열의 개수가 다를 수 있다는 가정
				System.out.println(contents[i][j]);
				
			}
			
			
		}
		
		
		
		
		
		
		f.setVisible(true);
	}

}
