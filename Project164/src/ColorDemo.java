import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorDemo extends JFrame {
	ColorDemo() {
		setTitle("���� ��ȯ�ϱ�");
		JButton b = new JButton("���� ��ȯ");
		add(b);
		b.addActionListener(e -> {
			Color color = new Color((int) (Math.random() * 255.0),
					(int) (Math.random() * 255.0),
					(int) (Math.random() * 255.0));
			b.setBackground(color);
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ColorDemo();
	}
}