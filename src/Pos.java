import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pos extends JFrame {
	static int price=0;
	static int cnt=0;
	public Pos() {
		this.setLayout(new GridLayout(8,8));
		this.setSize(1000,1000);
//		JLabel order = new JLabel("Order here");
//		this.add(order);
		
		
		JButton HotAmericano = new JButton("Americano(Iced) 4500��");
		this.add(HotAmericano);
		
		JButton IceAmericano = new JButton("Americano(Hot) 4500��");
		this.add(IceAmericano);
		
		JButton HotLatte = new JButton("CafeLatte(Iced) 5000��");
		this.add(HotLatte);
		
		JButton IcedLatte = new JButton("CafeLatte(Hot) 5000��");
		this.add(IcedLatte);

		JButton Cappuccino = new JButton("Cappuccino 5000��");
		this.add(Cappuccino);

		JButton Choco  = new JButton("Chocolate Latte 4300��");
		this.add(Choco);

		JButton Lemonade = new JButton("Lemonade 5500��");
		this.add(Lemonade);

		JButton Earl = new JButton("Earlgrey(only Hot) 5000��");
		this.add(Earl);

		JButton Ice = new JButton("IceCream 4700��");
		this.add(Ice);

		JButton AddShot = new JButton("Add_Shot 500��");
		this.add(AddShot);
	
		
		JLabel total = new JLabel("����: "+ cnt +"   " + "�����ݾ� : "+ price +"��");
		total.setFont(total.getFont().deriveFont(30.0f));
		this.add(total);
		
		
		JTextField client = new JTextField("��û����:");
		this.add(client);
		

		
	IceAmericano.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int Amer = 4500;
			cnt++;
			price+=Amer;
						
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	
	HotAmericano.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int Amer = 4500;
			cnt++;
			price+=Amer;
						
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	

	
	IcedLatte.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int Latte = 5000;
			price+=Latte;
			cnt++;			
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	
	HotLatte.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int Latte = 5000;
			price+=Latte;
			cnt++;			
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	
	Cappuccino.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int Cappuccino = 5000;
			price+=Cappuccino;
			cnt++;			
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	
	Choco.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int Choco = 4300;
			price+=Choco;
			cnt++;			
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	
	Lemonade.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int Lemonade = 5500;
			price+=Lemonade;
			cnt++;		
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	
	Earl.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int Earl = 5000;
			price+=Earl;
			cnt++;			
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	
	Ice.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int IceCream = 4700;
			price+=IceCream;
			cnt++;				
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	
	
	AddShot.addActionListener(new ActionListener() {			
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int shot = 500;
			
			price+=shot;
			cnt++;		
			total.setText("����: "+ cnt +"   " +"���� �ݾ� : " + price + "��");

		}
		
	});
	JButton cal = new JButton("����");
	this.add(cal);
	cal.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			new Calframe();
			
		}
		
	});
	JButton point = new JButton("����Ʈ����");
	this.add(point);
	point.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			new Point();
			
		}
		
	});
	
	

		this.setVisible(true);
		
	}


}
