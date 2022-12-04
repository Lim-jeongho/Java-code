import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerDemo extends JFrame {
	private JLabel [] keyMessage;  // 3���� �޼����� ����� ���̺� ������Ʈ �迭
	public KeyListenerDemo() {
		setTitle("keyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener((KeyListener) new MyKeyListener());
		keyMessage = new JLabel [3];
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);  // ���� ������ �Ӽ� ����
			keyMessage[i].setBackground(Color.YELLOW);
		}
		setSize(300, 150);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));  // Ű�� �ڵ� ���
			keyMessage[1].setText(Character.toString(keyChar));  // Ű�� �����ڵ� ���� ���
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));  // Ű�� �̸� ���ڿ� ���
			System.out.println("KeyPressed");
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("KeyReleased");
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("KeyTyped");
		}
	}
	public static void main(String[] args) {
		new KeyListenerDemo();
	}
}