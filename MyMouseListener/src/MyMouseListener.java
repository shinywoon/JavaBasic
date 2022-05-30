
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class MyMouseListener extends JFrame {

	private JLabel l = new JLabel("hello");

	public MyMouseListener() {

		setTitle("MouseListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		l.setSize(50, 20);
		l.setLocation(30, 30);
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				l.setLocation(x, y);
			}
		});

		c.setLayout(null);

		setSize(300, 300);
		setVisible(true);
		c.add(l);
	}

	public static void main(String[] args) {

		new MyMouseListener();

	}

}
