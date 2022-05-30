package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing4 extends JFrame{

	private JLabel la = new JLabel("LOVE JAVA");
	
	public Swing4() {
		super("+,- 키로 폰트 크지 조절");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		la.setSize(100,50);
		la.setFont(new Font("Arial",Font.PLAIN,10));
		cp.add(la);
		cp.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				int ch = e.getKeyCode();
				Font f = la.getFont();
				int size = f.getSize();
				switch(ch) {
				case KeyEvent.VK_UP:
					size += 5;
					break;
				case KeyEvent.VK_DOWN:
					if(size > 5 ) {
						size -= 5;
					}
					break;
				}
				System.out.println(size);
				la.setFont(new Font("Arial",Font.PLAIN,size));
			}
		});
		
		setSize(300,300);
		setVisible(true);
		
		cp.setFocusable(true);
		cp.requestFocus();
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing4();
	}

}
