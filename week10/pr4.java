package week10;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class pr4 extends JFrame {

	JLabel label;
	String text = "Love Java";

	public pr4() {
		setTitle("Left Ű�� ���ڿ� �ٲٱ� ����");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Love Java");
		label.addKeyListener(new MyKeyAdapter());
		label.setSize(200, 50);
		add(label);
		setSize(400, 200);
		setVisible(true);
		label.requestFocus();

	}

	public static void main(String[] args) {

		new pr4();
	}

	class MyKeyAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				label.setText(text);
				text = text.substring(1) + text.substring(0, 1);
				break;
			default:
				break;
			}
		}
	}

}