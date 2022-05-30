// itemEvent 를 활용하여 체크박스로 가격합산
package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx10_5 extends JFrame{

	private JCheckBox [] fruits = new JCheckBox[3];
	private String [] names = {"사과","배","체리"};
	private JLabel sumLabel;
	private int sum = 0;
	
	public SwingEx10_5() {
		super("itemEvent 활용");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("사과 100원, 배 500원 , 체리 20000원"));
		
		for(int i = 0 ; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			cp.add(fruits[i]);
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(e.getItem() == fruits[0]) {
							sum += 100;
						}else if(e.getItem() == fruits[1]) {
							sum += 200;
						}else {
							sum += 20000;
						}
					}else {
						if(e.getItem() == fruits[0]) {
							sum -= 100;
						}else if(e.getItem() == fruits[1]) {
							sum -= 200;
						}else {
							sum -= 20000;
						}
						
					}					
					sumLabel.setText("현재" + sum + "원 입니다.");
				}
			});
		}
		
		sumLabel = new JLabel("현재 0원 입니다.");
		cp.add(sumLabel);
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx10_5();
	}

}
