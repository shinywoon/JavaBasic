
//3개의 버튼 컴포넌트를 가진 스윙 프레임 만들기
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx8_2 extends JFrame{
	
	public SwingEx8_2() {
		setTitle("3개 버튼 스윙 프로그램 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container cp = getContentPane();
		cp.setBackground(Color.ORANGE);
		cp.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("OK");
		JButton b2 = new JButton("Cancel");
		JButton b3 = new JButton("ignore");
		
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx8_2();
	}

}
