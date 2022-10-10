import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyAdapterDemo extends JFrame {
	public KeyAdapterDemo() {
		setTitle("Ű ���");
		JLabel l = new JLabel("", JLabel.CENTER);
		JTextField t = new JTextField(10);
		add("North", t);
		add("Center", l);
		
		t.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					l.setText("�Է��� ���ڿ� : " + t.getText());
				}
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 120);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new KeyAdapterDemo();
	}
}