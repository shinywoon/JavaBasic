package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx11_7 extends JFrame {

	public SwingEx11_7() {
		super("드래그로 타원 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 300);
		setVisible(true);
	}

	class MyPanel extends JLabel {
			
		private Point start = null;
		private Point end = null;
		
		public MyPanel(){
			MyMouseListener listener = new MyMouseListener();
			this.addMouseListener(listener);
			this.addMouseMotionListener(listener);
		}
		
		class MyMouseListener extends MouseAdapter {
			
			@Override
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				end = e.getPoint();
				repaint();
			}

		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(start != null) {
				int x = Math.min(start.x, end.x);
				int y = Math.min(start.y, end.y);
				int w =Math.abs(start.x - end.x);
				int h= Math.abs(start.y-end.y);
				
				g.setColor(Color.BLUE);
				g.drawOval(x, y, w, h);
			}
			
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx11_7();
	}

}
