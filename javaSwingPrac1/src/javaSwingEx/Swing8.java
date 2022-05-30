package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import javaSwingEx.SwingEx9_8.MyMouseListener;

public class Swing8 extends JFrame{
	
	private JLabel la = new JLabel("LOVE JAVA");
	
	public Swing8() {	
		super("마우스 휠");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		la.setSize(50,50);
		cp.addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				int n = e.getWheelRotation();
				Font f = la.getFont();
				int size = f.getSize();
				if(n < 0) {
					la.setFont(new Font("Arial",Font.PLAIN,size+5));
				}else {
					if(size > 5) {
						la.setFont(new Font("Arial",Font.PLAIN,size-5));
					}
					
				}
				
			}
		});
		cp.add(la);

		
		setSize(300,300);
		setVisible(true);

	
	}

	
	public static void main(String[] args) {
		
		new Swing8();
		
		
	}

}
