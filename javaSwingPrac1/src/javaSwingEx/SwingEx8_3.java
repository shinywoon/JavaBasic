// FlowLayout 배치 관리자 활용

package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx8_3 extends JFrame{
	
	public SwingEx8_3(){
		super("FlowLayout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		
		//FlowLayout 생성자 - 정렬방식 , hGap , vGap
		cp.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		cp.add(new JButton("OK"));
		cp.add(new JButton("OK"));
		cp.add(new JButton("OK"));
		cp.add(new JButton("OK"));
		cp.add(new JButton("OK"));
		
		setSize(300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx8_3();
	}

}
