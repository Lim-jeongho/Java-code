import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFramePanel extends JFrame {
	JFramePanel() {
		setTitle("�ȳ�, ����");
		JPanel p = new JPanel();
		JLabel l = new JLabel("�ȳ�, ����");
		JButton b = new JButton("��ư");
		p.add(l);
		p.add(b);
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		pack();  // ���뿡 �˸°� â ũ�⸦ ����
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFramePanel();
	}
}