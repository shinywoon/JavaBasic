//GridLayout 활용
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx8_5 extends JFrame{

	public SwingEx8_5() {
		super("GridLayout 활용");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp  = getContentPane();
		//GridLayout 생성자 => 행,열
		cp.setLayout(new GridLayout(1,10));
		
		for(int i = 0; i <10;i++) {
			String text = Integer.toString(i);
			cp.add(new JButton(text));
		}
		
		
		setSize(500,200);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx8_5();
	}

}
