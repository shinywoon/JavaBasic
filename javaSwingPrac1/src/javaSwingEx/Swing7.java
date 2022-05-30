package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import javaSwingEx.SwingEx9_8.MyMouseListener;

public class Swing7 extends JFrame{
	
	private int num = (int) (Math.random()*60)+1;
	
	private JLabel la = new JLabel(Integer.toString(num));
	private JButton b1 = new JButton("+2");
	private JButton b2 = new JButton("-1");
	private JButton b3 = new JButton("%4");
	
	public Swing7() {
		super("3x4 Color Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(null);
		
		la.setBounds(150, 0, 150, 50);
		b1.setBounds(50, 200, 50, 50);
		b2.setBounds(130, 200, 50, 50);
		b3.setBounds(210, 200, 50, 50);
		
		b1.addMouseListener(new MyMouseListener());
		b2.addMouseListener(new MyMouseListener());
		b3.addMouseListener(new MyMouseListener());
		
		
		cp.add(la);
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		
		setSize(300,300);
		setVisible(true);

	
	}
	
	private class MyMouseListener extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("+2")) {
				num += 2;
				b.setEnabled(false);
			}else if(b.getText().equals("-1")) {
				num -= 1;
				b.setEnabled(false);
			}else {
				num %= 4;
				b.setEnabled(false);
			}
			
			
			
			if(num == 0) {
				num = (int) (Math.random()*60)+1;
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
			}
			la.setText(Integer.toString(num));
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new Swing7();
		
		
	}

}
