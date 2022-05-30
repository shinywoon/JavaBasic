//JRadioButton 
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx10_6 extends JFrame{
	
	public SwingEx10_6() {
		super("JRadioButton");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배",true);
		JRadioButton cherry = new JRadioButton("체리");
		
		g.add(apple);g.add(pear);g.add(cherry);
		
		cp.add(apple);cp.add(pear);cp.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx10_6();
	}

}
