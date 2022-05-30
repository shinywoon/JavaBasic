package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing2 extends JFrame{
	
	public Swing2() {
		super("키 누르기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setBackground(Color.ORANGE);
		cp.addKeyListener(new KeyAdapter() {
		
			@Override
			public void keyPressed(KeyEvent e) {
				Component c1 = (Component) e.getSource();
				char c  = e.getKeyChar();
				if(c == 'r') {
					c1.setBackground(Color.red);
				}
				
			}
			
			public void keyReleased(KeyEvent e) {
				Component c1 = (Component) e.getSource();
				c1.setBackground(Color.orange);
			} 
			
			
		});
		setSize(200, 200);
		setVisible(true);
		cp.setFocusable(true);
		cp.requestFocus();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing2();
	}

}
