import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("����մϴ�!");
		ImageIcon heart = new ImageIcon("C:\\Users\\USER\\Pictures\\images/heart.png");
		JLabel imageLabel = new JLabel(heart);
		ImageIcon telephone = new ImageIcon("C:\\Users\\USER\\Pictures\\images/telephone.png");
		JLabel label = new JLabel("��ȭ�ɱ�", telephone, SwingConstants.CENTER);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		setSize(400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelEx();
	}
}