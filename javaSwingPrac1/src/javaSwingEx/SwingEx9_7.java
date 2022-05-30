//상 하 좌 우 키로 문자열 움직이기
package javaSwingEx;

import java.awt.*;
import java.awt.Event;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.event.*;

public class SwingEx9_7 extends JFrame{
	
	private JLabel la = new JLabel("Hello");
	
	public SwingEx9_7() {
		super("상 하 좌 우 키로 문자열 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(null);
		la.setSize(100,20);
		la.setLocation(50, 50);
		cp.add(la);
		cp.addKeyListener(new KeyAdapter() {
				
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				int x = la.getX();
				int y = la.getY();
				switch (keyCode) {
				case KeyEvent.VK_UP:
					la.setLocation(x, y-10);
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(x, y+10);
					break;
				case KeyEvent.VK_RIGHT:
					la.setLocation(x+10, y);
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(x-10, y);
					break;
				}
			}
		});
		
		setSize(300,300);
		setVisible(true);
		cp.setFocusable(true);
		cp.requestFocus();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx9_7();
	}

}
