package UI;
import Services.*;
import Model.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.awt.Font;
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;

public class RegistrationFrom extends JFrame implements KeyListener{

	private Container c;
    private JLabel l1,l2,l3,l4,l5,l7,img;
    private JTextField tf1,tf2,tf3,tf4;
    private JPasswordField pf1;
    private JButton b1,b2;
	private Font f1,f2;
	private AuthenticationServices _service;

    public RegistrationFrom()
	{
		_service = new AuthenticationServices();
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		f1 = new Font("Montserrat", Font.BOLD,25);
		f2 = new Font("Cambria", Font.BOLD,18);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(815,530);
		this.setLocationRelativeTo(null);
		this.setTitle("Register Form");
		this.setResizable(false);
		
		l1 =new JLabel("Create New Account");
		l1.setBounds(380,40,260,50);
		l1.setFont(f1);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setForeground(Color.BLACK);
		c.add(l1);
		
		l2 =new JLabel("First Name ");
		l2.setBounds(380,80,200,30);
		l2.setFont(f2);
		l2.setForeground(Color.BLACK);
		c.add(l2);
		
		l3 =new JLabel("Last Name ");
		l3.setBounds(380,140,200,30);
		l3.setFont(f2);
		l3.setForeground(Color.BLACK);
		c.add(l3);
		
		tf1 =new JTextField();
		tf1.setBounds(380,105,200,30);
		tf1.setBackground(Color.WHITE);
		tf1.setForeground(Color.BLACK);
		tf1.setHorizontalAlignment(JTextField.CENTER);
		tf1.setFont(f2);
		c.add(tf1);
		
		tf2 =new JTextField();
		tf2.setBounds(380,165,200,30);
		tf2.setBackground(Color.WHITE);
		tf2.setForeground(Color.BLACK);
		tf2.setHorizontalAlignment(JTextField.CENTER);
		tf2.setFont(f2);
		c.add(tf2);
		
		l4 =new JLabel("User Name ");
		l4.setBounds(380,200,200,30);
		l4.setFont(f2);
		l4.setForeground(Color.BLACK);
		c.add(l4);
		
		tf3 =new JTextField();
		tf3.setBounds(380,225,200,30);
		tf3.setBackground(Color.WHITE);
		tf3.setForeground(Color.BLACK);
		tf3.setHorizontalAlignment(JTextField.CENTER);
		tf3.setFont(f2);
		c.add(tf3);
		
		l5 =new JLabel("Password ");
		l5.setBounds(380,320,200,30);
		l5.setFont(f2);
		l5.setForeground(Color.BLACK);
		c.add(l5);
		
		
		pf1 = new JPasswordField();
		pf1.setBounds(380,345,200,30);
		pf1.setBackground(Color.WHITE);
		pf1.setForeground(Color.BLACK);
		pf1.setHorizontalAlignment(JPasswordField.CENTER);
		pf1.setFont(f2);
		c.add(pf1);
		
		
		l7 = new JLabel("Phone Number ");
		l7.setBounds(380,260,200,30);
		l7.setFont(f2);
		l7.setForeground(Color.BLACK);
		c.add(l7);
		
		tf4 =new JTextField();
		tf4.setBounds(380,285,200,30);
		tf4.setBackground(Color.WHITE);
		tf4.setForeground(Color.BLACK);
		tf4.setHorizontalAlignment(JTextField.CENTER);
		tf4.setFont(f2);
		c.add(tf4);
		
		b1 = new JButton("Confirm");
		b1.setBackground(Color.GREEN);
		b1.setForeground(Color.BLACK);
		b1.setFocusable(false);
		b1.setBounds(380,390,120,30);
		b1.setFont(f2);
		c.add(b1);
		
		
		b2 = new JButton("Back");
		b2.setBackground(Color.RED);
		b2.setForeground(Color.BLACK);
		b2.setFocusable(false);
		b2.setBounds(570,390,120,30);
		b2.setFont(f2); 
		c.add(b2);
		
        img =new JLabel();		
		img.setIcon(new ImageIcon("UI/AllPicture/Bus1.png"));
		img.setBounds(0,-290,1902,1076);
		c.add(img);
		//Switch_Frame obj2=new Switch_Frame();
		
		pf1.addKeyListener(this);
		 
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				
				System.out.println("Enter");
				JOptionPane.showMessageDialog(null, "Congratulations, Your account has been created!!");
				
		    }
		}
		);
		//b2.addActionListener(obj2);
		// b2.addActionListener(new ActionListener()
		// {
			// public void actionPerformed(ActionEvent ae)
			// {
				// tf1.setText("");
				// tf2.setText("");
				// tf3.setText("");
				// pf1.setText("");
				// tf4.setText("");
			// }
		// }
		// );
		
        
	}
	
	public void keyPressed (KeyEvent ae) {  
			
         if(ae.getKeyCode() == KeyEvent.VK_ENTER)
         {
			 
         System.out.println("Enter Pressed");
			 
		 JOptionPane.showMessageDialog(null,"Congratulations, Your account has been created!!");
			
         }
    }    
    public void keyReleased (KeyEvent ae) 
	{    
           
    }    
    public void keyTyped (KeyEvent ae) 
	{    
           
    }
}	
	
