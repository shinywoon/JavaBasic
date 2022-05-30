//JLabel compornent
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swing1 extends JFrame{
	
	private JLabel la = new JLabel("자기야");
	
	public Swing1() {
		super("마우스 올리면 사랑해");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		la.setSize(100,50);
		la.addMouseListener(new MouseAdapter() {
	
			@Override
			public void mouseExited(MouseEvent e) {
				JLabel l = (JLabel)e.getSource();
				l.setText("자기야");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel l = (JLabel)e.getSource();
				l.setText("사랑해");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		cp.add(la);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Swing1();
	}

}
