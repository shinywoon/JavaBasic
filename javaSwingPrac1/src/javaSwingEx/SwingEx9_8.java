//Mouse motion Ex
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx9_8 extends JFrame{
	
	private JLabel la = new JLabel("Move me");

	public SwingEx9_8() {
		super("MouseMotionListener");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(null);
		cp.addMouseListener(new MyMouseListener());
		cp.addMouseMotionListener(new MyMouseListener());
		
		la.setSize(80,20);
		la.setLocation(100,80);
		cp.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("moseDragged " + e.getX() + " " + e.getY());
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setLocation(e.getX(), e.getY());
			setTitle("moseMoved " + e.getX() + " " + e.getY());
		}

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			Component comp = (Component)arg0.getSource();
			comp.setBackground(Color.cyan);
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			Component comp = (Component)arg0.getSource();
			comp.setBackground(Color.yellow);
			setTitle("Exited"+arg0.getX() + " " + arg0.getY());
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			la.setLocation(arg0.getX(), arg0.getY());
			setTitle("mosePress " + arg0.getX() + " " + arg0.getY());
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			la.setLocation(arg0.getX(), arg0.getY());
			setTitle("moseRleased " + arg0.getX() + " " + arg0.getY());
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx9_8();
	}

}


