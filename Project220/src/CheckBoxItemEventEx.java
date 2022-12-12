import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {
	private JCheckBox [] fruits = new JCheckBox [3];
	private String [] names = {"���", "��", "ü��"};
	private JLabel sumLabel;
	public CheckBoxItemEventEx() {
		setTitle("üũ�ڽ��� ItemEvent ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("��� 1000��, �� 5000��, ü�� 20000��"));
		MyItemListener listener = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("���� 0�� �Դϴ�.");
		c.add(sumLabel);
		setSize(250,200);
		setVisible(true);
	}
	class MyItemListener implements ItemListener {
		private int sum = 0;
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0])
					sum += 1000;
				else if(e.getItem() == fruits[1])
					sum += 5000;
				else
					sum += 20000;
			}
			else {
				if(e.getItem() == fruits[0])
					sum -= 1000;
				else if(e.getItem() == fruits[1])
					sum -= 5000;
				else
					sum -= 20000;
			}
			sumLabel.setText("����" + sum + "�� �Դϴ�");
		}
	}
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}
}