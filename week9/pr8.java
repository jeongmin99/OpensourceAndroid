package week9;

import javax.swing.*;
import java.awt.*;

class top extends JPanel {
	public top() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}
class middle extends JPanel {
	public middle() {
		setLayout(null);
		for (int i = 0; i < 10; i++) {
			JLabel jl = new JLabel("*");
			int x = (int) (Math.random() * 250);
			int y = (int) (Math.random() * 150);
			jl.setLocation(x, y);
			jl.setSize(20, 20);
			jl.setForeground(Color.red);
			add(jl);
		}
	}
}

class bottom extends JPanel {
	public bottom() {
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout());
		add(new JButton("Word Input"));
		add(new JTextField(15));
	}
}

public class pr8 extends JFrame {

	public pr8() {
		setTitle("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new top(), BorderLayout.NORTH);
		c.add(new middle(),BorderLayout.CENTER);
		c.add(new bottom(), BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new pr8();
	}
}