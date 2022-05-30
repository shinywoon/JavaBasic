

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JavaSwing extends JFrame{
	
	public JavaSwing() {
		this.setTitle("300x400 스윙 프레임 만들기");//제목 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료버튼 click 시 java program 종료
		
		Container cp = this.getContentPane();
		cp.setBackground(Color.orange); //contentPane의 배경 변경
		cp.setLayout(new FlowLayout());//배치규칙
		
		
		JButton b1 = new JButton("OK");  //버튼 만들기
		JButton b2 = new JButton("Cancle"); 
		JButton b3 = new JButton("Ignore"); 
		b1.setSize(80, 20); //FolwLayout 일때는 적용되지 않
		b2.setSize(80, 20);
		b3.setSize(80, 20);
		cp.add(b1);//contentPane에 버튼 추가하기
		cp.add(b2);
		cp.add(b3);
		
		
		this.setSize(300, 400); //window크기
		this.setResizable(false); //window 화면 조정가능 여부
		this.setLocationRelativeTo(this.getParent()); //중앙정렬 상대 위치 설정
		this.setVisible(true); //window 표시하기
	}
	
	

	public static void main(String[] args) {
		
		JavaSwing js = new JavaSwing();
		
		
		
	}

}
