//GridBagLayout 활용

package javaSwingEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SwingEx8_6 extends JFrame{
	
	private Label lblReceive = new Label("받는사람 : ",Label.RIGHT);
	private Label lblContent = new Label("내용 : ",Label.RIGHT);
	private Label lblFile = new Label("받는사람 : ",Label.RIGHT);
	private Button btnSearch = new Button("찾아보기");
	private Button btnSend = new Button("보내기");
	private TextField toPerson = new TextField(40);
	private TextField file = new TextField(30);
	private TextArea content = new TextArea(5,40);
	
	private GridBagLayout gBag = new GridBagLayout();
	
	
	public SwingEx8_6() {
		setTitle("GridBagLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(gBag);
		
		//GridBagLayout 에 삽입 c,x,y,w,h
		
		insert(lblReceive,0,0,1,1);
		insert(toPerson,1,0,3,1);
		insert(lblContent,0,1,1,1);
		insert(content,1,1,3,1);
		insert(lblFile,0,2,1,1);
		insert(file,1,2,2,1);
		insert(btnSearch,3,2,1,1);
		insert(btnSend,0,3,4,1);
		this.pack();
		setLocationRelativeTo(getOwner());
		setVisible(true);
		toPerson.requestFocus();
	}
	
	private void insert (Component cmpt, int x, int y, int w, int h) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gBag.setConstraints(cmpt, gbc);
		
		this.add(cmpt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingEx8_6();
	}

}
