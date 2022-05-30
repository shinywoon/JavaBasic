package javaSwingEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing6 extends JFrame{

	private JLabel la [] = new JLabel[12];
	
	public Swing6() {
		super("3x4 Color Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(4,3));
		
		for(int i = 0 ; i < la.length ; i ++) {
			la[i] = new JLabel(Integer.toString(i));
			la[i].setOpaque(true);
			la[i].setBackground(Color.white);
			
			la[i].addMouseListener(new MyMouseAdapter());
			
			cp.add(la[i]);
		}
		
		
		setSize(300,300);
		setVisible(true);

	
	}
	
	private class MyMouseAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			JLabel l = (JLabel)e.getSource();
			int r = (int) (Math.random()*256);
			int g = (int) (Math.random()*256);
			int b = (int) (Math.random()*256);
			l.setBackground(new Color(r,g,b));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing6();
	}

}
