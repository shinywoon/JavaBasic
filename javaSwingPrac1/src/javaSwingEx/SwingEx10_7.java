//JtextField
package javaSwingEx;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class SwingEx10_7 extends JFrame{
	
	public SwingEx10_7() {
		super("JtextFiled");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("이름 :"));
		cp.add(new JTextField(20));
		cp.add(new JLabel("학과 :"));
		cp.add(new JTextField("컴퓨터공학",20));
		cp.add(new JLabel("주소 :"));
		cp.add(new JTextField("서울시 ...",20));
		
		
		setSize(300,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx10_7();
	}

}
