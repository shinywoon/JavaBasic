//Swing component 공통 기능
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx10_1 extends JFrame{

	public SwingEx10_1 () {
		super("Jcomponent의 공통 메소드 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("yellow/Magetnta BTN");
		JButton b2 = new JButton("Disabled BTN");
		JButton b3 = new JButton("getX getY BTN");
		
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.MAGENTA);
		b1.setFont(new Font("Arial",Font.ITALIC,20));
		
		b2.setEnabled(false);
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				setTitle(b.getX() +","+ b.getY());
			}
		});
		
		cp.add(b1);cp.add(b2);cp.add(b3);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx10_1();
	}

}
