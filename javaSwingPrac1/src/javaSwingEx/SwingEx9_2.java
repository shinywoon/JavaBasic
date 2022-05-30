//내부 클래스로 리스너 구현하기
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx9_2 extends JFrame{
	
	public SwingEx9_2() {
		super("내부 클래스 리스너 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JButton b = new JButton("Action");
		b.addActionListener(new MyActionListener());
		cp.add(b);
		
		
		setSize(250,120);
		setVisible(true);
		
		
	}
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText() == "Action" ) {
				b.setText("액션");
			}else {
				b.setText("Action");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx9_2();
	}

}
