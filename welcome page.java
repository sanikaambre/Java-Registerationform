import javax.swing.*;
import java.awt.*;
class welcome extends JFrame{
	JRadioButton b1,b2;
	JLabel l1;
	welcome(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=new JLabel("Welcome");
		l1.setFont(new Font ("Times New Roman",Font.BOLD,40));
		l1.setForeground(Color.BLUE);
		l1.setBounds(200,100,300,30);
		add(l1);
		
		b1=new JRadioButton("Login");
		b1.setFont(new Font ("Times New Roman",Font.BOLD,30));
		b1.setForeground(Color.BLUE);
		b1.setBounds(200,200,200,35);
		
		b2=new JRadioButton("Sign In");
        b2.setFont(new Font ("Times New Roman",Font.BOLD,30));
		b2.setForeground(Color.BLUE);
		b2.setBounds(200,300,200,35);
		
		add(b1);
		add(b2);

	}
	
}
class welcomepage{
	public static void main(String[] args){
		welcome l=new welcome();
		l.setBounds(300,100,550,550);
		l.setVisible(true);
	}
}