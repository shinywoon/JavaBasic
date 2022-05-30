import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JavaSwing2 extends JFrame {

	private JLabel j = new JLabel("HELLO");

	public JavaSwing2() {

		super("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		j.setBounds(50, 50, 80, 20);

		c.add(j);
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				int x = j.getX();
				int y = j.getY();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					j.setLocation(x,y-10);
					break;
				case KeyEvent.VK_DOWN:
					j.setLocation(x,y+10);
					break;
				case KeyEvent.VK_LEFT:
					j.setLocation(x-10,y);
					break;
				case KeyEvent.VK_RIGHT:
					j.setLocation(x+10,y);
					break;

				}

			}
		});

		setSize(500, 500);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaSwing2();
	}

}
