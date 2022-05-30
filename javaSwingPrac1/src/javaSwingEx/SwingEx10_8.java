//JTextField
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx10_8 extends JFrame{
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	public SwingEx10_8() {
		super("JTextField");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("입력후 enter 키를 입력 하세요"));
		cp.add(tf);
		cp.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(tf.getText() + "\n");
				t.setText("");
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx10_8();
	}

}
