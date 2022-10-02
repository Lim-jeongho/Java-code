import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloEvent extends JFrame {
	HelloEvent() {
		setTitle("클릭 테스트");
		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 클릭했습니다.");
			}
		};
		JButton b = new JButton("클릭!");
		b.addActionListener(l);
		add(b);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(260, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloEvent();
	}
}