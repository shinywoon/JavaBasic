// JCheckBox
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx10_4 extends JFrame{

	public SwingEx10_4(){
		super("JCheckBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배",true);
		JCheckBox cherry = new JCheckBox("체리");
		
		cp.add(apple);cp.add(pear);cp.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx10_4();
	}

}
