import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calframe extends JFrame {
	public Calframe() {
	this.setLayout (new GridLayout(3,2));
	this.setSize(500,300);
	
	JLabel x = new JLabel("�����ݾ� : "+ Pos.price + "   " +"����: " +"  " + Pos.cnt);
	x.setFont(x.getFont().deriveFont(30.0f));
	this.add(x);
	
	
	
	JLabel y = (new JLabel("ī�带 ���Ա��� �־��ּ���."));
	y.setFont(y.getFont().deriveFont(30.0f));
	this.add(y);
	
	JLabel z = (new JLabel("������ ī���Ϳ� ���ǹٶ��ϴ�."));
	z.setFont(z.getFont().deriveFont(30.0f));
	this.add(z);
	
	this.setVisible(true);
	}
	
	


}
