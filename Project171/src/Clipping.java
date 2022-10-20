import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clipping extends JFrame {
	Clipping() {
		setTitle("이미지 그리기");
		class MyPanel extends JPanel {
			BufferedImage balloons;
			public MyPanel() {
				try {
					balloons = ImageIO.read(new File("C:\\Users\\USER\\Pictures\\images/balloons.png"));
				} catch (IOException e) {
					
				}
			}
			
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setClip(30, 20, 240, 170);  // 클리핑 영역 설정
				g.drawImage(balloons, 0, 0, null);
			}
		}
		
		add(new MyPanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 260);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Clipping();
	}
}