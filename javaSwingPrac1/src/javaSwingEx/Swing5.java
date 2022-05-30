package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing5 extends JFrame{

	private JLabel la = new JLabel("c");
	
	public Swing5() {
		super("클릭 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(null);
		la.setSize(10,10);
		la.setLocation(50, 50);
		cp.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
		});
		cp.add(la);
		
		
		setSize(300,300);
		setVisible(true);

	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing5();
	}

}
