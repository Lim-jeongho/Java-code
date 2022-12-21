import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));  // 레이블에 카운트 값 출력
			n++;
			try {
				Thread.sleep(1000);  // 1초 sleep
			}
			catch(InterruptedException e) {
				return;  // 인터럽트 예외 발생 시 스레드 종료
			}
		}
	}
	
}
public class RunnableTimerEx extends JFrame {
	public RunnableTimerEx() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		setSize(250, 150);
		setVisible(true);
		th.start(); // 타이머 스레드 실행
	}
	
	public static void main(String[] args) {
		new RunnableTimerEx();
	}

}
