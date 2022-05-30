package javaSwingPrac1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JavaSwingPrac1 extends JFrame{

	public JavaSwingPrac1 () {
		
		//title 만들기 super로 가능
		//setTitle("자바 스윙 연습");
		super("자바 스윙 연습");
		
		//컨텐트팬 알아내기 - 프레임에 붙은 디폴트 컨텐트펜 알아내기
		Container cp = getContentPane();
		
		// 버튼 생성하기 - 생성자를 이용하여 "click" 이름 붙여주기
		JButton b = new JButton("click");
		//컨텐트팬에 컴포넌트 붙이기
		cp.add(b);
		
		
		//frame size 설정
		setSize(300,300);
		
		//frame을 화면에 출력
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JavaSwingPrac1();
		
	}

}
