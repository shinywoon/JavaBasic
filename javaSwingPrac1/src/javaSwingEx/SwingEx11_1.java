package javaSwingEx;

import java.awt.*;
import java.awt.Event;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx11_1 extends JFrame{

	public SwingEx11_1() {
		super("그래픽 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(new MyG());
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	class MyG extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawRect(20, 20, 50, 80);
			g.setColor(Color.BLUE);	
			g.setFont(new Font("맑은고딕",Font.ITALIC,20));
			g.drawString("asdf",30, 30);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx11_1();
	}

}
