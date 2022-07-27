import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AddPoint extends JFrame{
	public AddPoint() {
		this.setLayout (new GridLayout(3,2));
		this.setSize(500,300);
		
		JLabel PointNUm = new JLabel("");
		PointNUm.setFont(PointNUm.getFont().deriveFont(30.0f));
		this.add(PointNUm);
		
		
		JButton Button_1 = new JButton("1");
		this.add(Button_1);
		
		
		JButton Button_2 = new JButton("2");
		this.add(Button_2);
		
		
		JButton Button_3 = new JButton("3");
		this.add(Button_3);
		
	
		
		JButton Button_4 = new JButton("4");
		this.add(Button_4);
		
		
		JButton Button_5 = new JButton("5");
		this.add(Button_5);
		
		JButton Button_6 = new JButton("6");
		this.add(Button_6);
		
		JButton Button_7 = new JButton("7");
		this.add(Button_7);
		
		
		JButton Button_8 = new JButton("8");
		this.add(Button_8);
		
		
		JButton Button_9 = new JButton("9");
		this.add(Button_9);
		
	
		JButton Button_0 = new JButton("0");
		this.add(Button_0);

		
		Button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PointNUm.setText("1");

			}
			
		});
		
		Button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PointNUm.setText("");

			}
			
		});
		
		
		this.setVisible(true);
	}

}
