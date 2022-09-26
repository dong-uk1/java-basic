package 변수;

//부품의 위치를 알려줌
// import가 자동으로 생성되게 하려면, 자동완성으로 만들어야 함 (컨트롤 스페이스)
import javax.swing.JOptionPane;

public class 나의두번째부품 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력용
		//일반적으로 입력은 스트링으로 함 > int로 하면 컴퓨터가 잘 못알아먹음
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요");
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		String hob = JOptionPane.showInputDialog("당신의 취미는?");
		
		//출력용
		JOptionPane.showMessageDialog(null, "나의 나이는" + age);
		JOptionPane.showMessageDialog(null, "나의 이름은" + name);
		JOptionPane.showMessageDialog(null, "나의 취미는" + hob);

	}

}
