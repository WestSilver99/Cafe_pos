import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calframe extends JFrame {
	public Calframe() {
	this.setLayout (new GridLayout(3,2));
	this.setSize(500,300);
	
	JLabel x = new JLabel("결제금액 : "+ Pos.price + "   " +"개수: " +"  " + Pos.cnt);
	x.setFont(x.getFont().deriveFont(30.0f));
	this.add(x);
	
	
	
	JLabel y = (new JLabel("카드를 투입구에 넣어주세요."));
	y.setFont(y.getFont().deriveFont(30.0f));
	this.add(y);
	
	JLabel z = (new JLabel("현금은 카운터에 문의바랍니다."));
	z.setFont(z.getFont().deriveFont(30.0f));
	this.add(z);
	
	this.setVisible(true);
	}
	
	


}
