package javaSwingEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing9 extends JFrame {

	private JLabel la1 = new JLabel("수식");
	private JLabel la2 = new JLabel("결과");
	private JTextField tf1 = new JTextField(20);
	private JTextField tf2 = new JTextField(20);

	private JButton[] b = new JButton[16];
	private String[] s = { "CE", "결과", "+", "-", "*", "/" };

	private StringBuilder stringBuilder1 = new StringBuilder();
	private Double num[] = new Double[2];
	private Double sum = 0.0;
	private int index = 0;
	private int flag = 0;

	public Swing9() {
		super("계산기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container cp = getContentPane();	
		cp.setLayout(null);

		la1.setBounds(0, 0, 50, 50);
		tf1.setBounds(80, 0, 60, 50);
		la2.setBounds(0, 60, 50, 50);
		tf2.setBounds(80, 60, 60, 50);

		cp.add(la1);
		cp.add(tf1);
		cp.add(la2);
		cp.add(tf2);

		int x = 290;
		int y = 60;
		for (int i = 0; i < b.length; i++) {
			if (i <= 9) {
				b[i] = new JButton(Integer.toString(i));
			} else {
				b[i] = new JButton(s[i - 10]);
			}

			b[i].setBounds(x, y, 10, 10);
			x += 30;
			b[i].addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {

					JButton b = (JButton) e.getSource();

					if (!(b.getText().equals("CE"))) {
						if (!b.getText().equals("결과")) {
							if(b.getText().equals("+") || b.getText().equals("-") || b.getText().equals("*") || b.getText().equals("/")) {
								if(b.getText().equals("+")) {
									flag = 1;
								}else if(b.getText().equals("-")) {
									flag = 2;
								}else if(b.getText().equals("*")) {
									flag = 3;
								}else if(b.getText().equals("/")) {
									flag = 4;
								}
							}else {
								num[index] = Double.parseDouble(b.getText());
							  	System.out.println(num[index]);
							  	System.out.println(index);
							  	index += 1;
							  	if(index >= 2) {
							  		index = 0;
							  	}
								
							}
							
							stringBuilder1.append(b.getText());
						} else {
							if(flag == 1) {
								for(int i = 0 ; i < num.length ; i++) {
									sum += num[i];
								}
							}else if(flag == 2) {
								for(int i = 0 ; i < num.length ; i++) {
									sum -= num[i];
								}
							}else if(flag == 3) {
								sum = num[0]*num[1];
							}else if(flag == 4) {
								sum = num[0]/num[1];
							}else {
								tf2.setText("수식을 입력하세요");
							}
							tf2.setText(Double.toString(sum));
						}

					} else {
						stringBuilder1 = new StringBuilder();
						for(int i = 0 ; i < num.length ; i++) {
							num[i] = 0.0;
						}
						index = 0;
						tf2.setText("");
					}
					
					tf1.setText(stringBuilder1.toString());
					
				}
			});
			cp.add(b[i]);
		}

		this.setSize(290, 300);
		setVisible(true);

	}
	
	

	public static void main(String[] args) {

		new Swing9();

	}

}
