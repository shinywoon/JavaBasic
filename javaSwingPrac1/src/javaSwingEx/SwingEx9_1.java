// 독립 클래스로 Action 이벤트 리스너 만들기
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx9_1 extends JFrame{
	
	public SwingEx9_1() {
		super("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		JButton b = new JButton("Action");
		cp.add(b);
		b.addActionListener(new MyActionListener());
		
		setSize(250,120);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx9_1();
	}

}

class MyActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText() == "Action") {
			b.setText("액션");
		}else {
			b.setText("Action");
		}
	}
	
}
