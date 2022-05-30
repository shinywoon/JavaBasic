
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class JavaSwing1 extends JFrame {

	public JavaSwing1() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource(); //Obj type return
				if (b.getText().equals("Action")) {
					b.setText("액션");
				} else {
					b.setText("Action");
				}
			}
		});
		
		
		c.add(btn);

		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JavaSwing1();

	}

}


