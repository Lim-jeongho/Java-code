import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		setTitle("텍스트필드 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름 "));
		c.add(new JTextField("임정호", 20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("컴퓨터전자공학과", 20));
		c.add(new JLabel("주소 "));
		c.add(new JTextField("경기도 구리시", 20));
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextFieldEx();
	}
}