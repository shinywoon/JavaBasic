//KeyListener 활용
package javaSwingEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEx9_6 extends JFrame{
	
	JLabel la = new JLabel("Enter Key로 배경색이 변함");
	
	public SwingEx9_6() {
		super("Key Listener");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(la);
		cp.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int r = (int)((Math.random())*256);
				int g = (int)((Math.random())*256);
				int b = (int)((Math.random())*256);
				
				char str = e.getKeyChar(); 
				switch(str) {
				case '\n':
					la.setText("r : " + r +" g : " + g +" b : " + b);
					cp.setBackground(new Color(r,g,b));
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
		new SwingEx9_6();
	}

}
