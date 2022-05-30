//배치관리자가 없는경우
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx8_7 extends JFrame{
	
	public SwingEx8_7() {
		super("배치관리자 없이 절대 위치에 배치하는 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200,20);
		cp.add(la);
		
		for(int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15, i*15);
			b.setSize(50,20);
			cp.add(b);
		}
		
		setSize(300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx8_7();
	}

}
