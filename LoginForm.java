import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Login extends JFrame{
	JTextField t1,t2;
	JButton b1;
	JLabel l1,l2,l3;
	Login(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=new JLabel("Login");
		l1.setFont(new Font ("Times New Roman",Font.BOLD,30));
		l1.setForeground(Color.BLUE);
		l1.setBounds(200,100,200,40);
		add(l1);
		
		l2=new JLabel("Username");
		l2.setFont(new Font ("Times New Roman",Font.BOLD,20));
		l2.setForeground(Color.BLUE);
		l2.setBounds(100,200,100,20);
		add(l2);
		
		l3=new JLabel("Password");
		l3.setFont(new Font ("Times New Roman",Font.BOLD,20));
		l3.setForeground(Color.BLUE);
		l3.setBounds(100,300,100,20);
		add(l3);
		
		
		t1=new JTextField(60);
		t2=new JPasswordField(60);
		b1=new JButton("Submit");
		
		t1.setBounds(300,200,100,20);
		t2.setBounds(300,300,100,20);
		b1.setBounds(200,400,100,20);
		
		l2=new JLabel("");
		l3=new JLabel("");
		l2.setBounds(200,450,300,20);
		l3.setBounds(200,450,300,20);
		add(l2);
		add(l3);
		
		add(t1);
		add(t2);
		add(b1);
		
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(t1.getText().toString().equals("admin")&&t2.getText().toString().equals("admin"))
				l2.setText("Successfully logged in");
					
				else
					l2.setText("Invalid username or password");
			}
		});
		
	}
}
class LoginForm{
	public static void main(String[] args){
		Login l=new Login();
		l.setBounds(300,100,550,550);
		l.setVisible(true);
	}
}