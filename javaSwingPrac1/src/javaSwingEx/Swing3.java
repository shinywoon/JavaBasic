package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing3 extends JFrame{
	
	public Swing3() {
		super("드래깅 동안 노란색");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setBackground(Color.GREEN);
		cp.addMouseListener(new MyMouseListener());
		cp.addMouseMotionListener(new MyMouseListener());
			
	
		setSize(200,200);
		setVisible(true);
	}
	
	private class MyMouseListener implements MouseListener, MouseMotionListener{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}

		@Override
		public void mouseMoved(MouseEvent e) {}

	

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {}

	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing3();
	}

}
