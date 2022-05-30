//JLabel 이용 문자열과 이미지 출력
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx10_2 extends JFrame{
	
	public SwingEx10_2(){
		super("레이블 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("gkgkgkgkg");
		
		ImageIcon img = new ImageIcon("22.png");
		JLabel la2 = new JLabel(img);
		
		ImageIcon icon = new ImageIcon("22.png");
		JLabel la3 = new JLabel("zxxde",img,SwingConstants.CENTER);
		
		cp.add(la); cp.add(la2); cp.add(la3);
		
		setSize(300,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx10_2();
	}

}
