import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoLayoutDemo extends JFrame {
	NoLayoutDemo() {
		setTitle("���� ��ġ�� ��ġ");
		JPanel p = new JPanel();
		p.setLayout(null);
		JButton b1 = new JButton("��ư 1");
		b1.setBounds(10, 10, 60, 30);
		JButton b2 = new JButton("��ư 2");
		b2.setBounds(80, 20, 80, 25);
		JButton b3 = new JButton("Button 3");
		b3.setBounds(150, 30, 100, 30);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NoLayoutDemo();
	}
}