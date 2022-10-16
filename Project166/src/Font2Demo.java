import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Font2Demo extends JFrame {
	Font2Demo() {
		setTitle("��Ʈ �����ϱ�");
		add(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Font2Demo();
	}
}

class MyPanel extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font f1 = new Font("TimesRoman", Font.PLAIN, 10);
		Font f2 = new Font("TimesRoman", Font.BOLD, 12);
		Font f3 = new Font("TimesRoman", Font.ITALIC, 14);
		Font f4 = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 16);
		Font f5 = new Font("Helvetica", Font.PLAIN, 10);
		Font f6 = new Font("Courier", Font.PLAIN, 20);
		Font f7 = new Font("Dialog", Font.PLAIN, 30);
		
		g.setFont(f1);
		g.drawString("�ȳ��ϼ��� (TimesRoman Plain)", 10, 25);
		g.setFont(f2);
		g.drawString("�ȳ��ϼ��� (TimesRoman Bold)", 10, 50);
		g.setFont(f3);
		g.drawString("�ȳ��ϼ��� (TimesRoman Italic)", 10, 75);
		g.setFont(f4);
		g.drawString("�ȳ��ϼ��� (TimesRoman Bold & Italic)", 10, 105);
		g.setFont(f5);
		g.drawString("�ȳ��ϼ��� (Helvetica)", 10, 125);
		g.setFont(f6);
		g.drawString("�ȳ��ϼ��� (Courier)", 10, 150);
		g.setFont(f7);
		g.drawString("�ȳ��ϼ��� (Dialog)", 10, 185);
	}
}