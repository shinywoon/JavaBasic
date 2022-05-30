// BorderLayout 활용 
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.*;


public class SwingEx8_4 extends JFrame{
	
	public SwingEx8_4(){
		super("BorderLayout 활용");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		//BorderLayout 생성자 => hGap, vGap
		cp.setLayout(new BorderLayout(30,20));
		
		//BorderLayout 에 정의 된 상수를 사용
		cp.add(new JButton("OK"),BorderLayout.CENTER);
		cp.add(new JButton("OK"),BorderLayout.NORTH);
		cp.add(new JButton("OK"),BorderLayout.SOUTH);
		cp.add(new JButton("OK"),BorderLayout.EAST);
		cp.add(new JButton("OK"),BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx8_4();
	}

}
