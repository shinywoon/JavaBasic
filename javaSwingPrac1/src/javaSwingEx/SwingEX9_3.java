//익명 클래스로 이벤트 리스너 작성
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEX9_3 extends JFrame{

	public SwingEX9_3() {
		super("익명클래스 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JButton b = new JButton("Action");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText() == "Action")
					b.setText("액션");
				else {
					b.setText("Action");
				}
			}
		});
		cp.add(b);
		
		
		setSize(200,150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEX9_3();
	}

}
