import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame {
	private String [] fruits = {"apple", "banana", "mango", "kiwi", "pear", "peach", "strawberry", "melon", "orange", "blueberry"};
	private String [] names = {"jeongho", "jaemin", "yoojin", "hyeonjoo" };
	
	public ComboBoxEx() {
		setTitle("콤보박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		c.add(strCombo);
		JComboBox<String> nameCombo = new JComboBox<String>();
		
		for(int i=0; i<names.length; i++)
			nameCombo.addItem(names[i]);
		c.add(nameCombo);
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBoxEx();
	}
}