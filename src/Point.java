import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Point extends JFrame {
	public Point() {
		this.setLayout (new GridLayout(3,2));
		this.setSize(500,300);
		this.add(new JLabel("핸드폰번호: "));
		JTextField phone = new JTextField();
		this.add(phone);
		JButton okay = new JButton("확인");
		okay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				
			}
			
		});
		this.add(okay);
		
		
		this.setVisible(true);
	}

}
