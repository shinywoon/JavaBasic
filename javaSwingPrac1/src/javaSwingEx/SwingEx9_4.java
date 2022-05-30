//마우스 이벤트 리스너 작성
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx9_4 extends JFrame{
	
	private JLabel la = new JLabel("Hello");
	
	public SwingEx9_4(){
		super("Mouse Event Ex");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(null);
		
		la.setSize(50,20);
		la.setLocation(30, 30);
		cp.addMouseListener(new MyMouseListener());
		cp.add(la);
		
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	private class MyMouseListener extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent arg0) {
			int x = arg0.getX();
			int y = arg0.getY();
			la.setLocation(x,y);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx9_4();
		
	}

}

