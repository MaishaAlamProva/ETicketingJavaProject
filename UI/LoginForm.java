package UI;
import Services.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;

public class LoginForm extends JFrame implements KeyListener{

	private Container c;
    private JLabel userlabel,passwordlabel,loginptxt,loginPImg;
    private JTextField usernameText;
    private JPasswordField passwordText;
    private JButton loginButton,signupbutton, exitbutton;
	private Font f,f2;
	private AuthenticationServices _services;

    public LoginForm()
	{
		_services = new AuthenticationServices();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(815, 530);
		this.setLocationRelativeTo(null);
		this.setTitle("Login");
		this.setResizable(false);
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		f = new Font ("Cambria", Font.BOLD,18);
		f2 = new Font ("Montserrat",Font.BOLD,35);
		
		loginptxt = new JLabel("User Login");
		loginptxt.setBounds(520,70,210,50);
		loginptxt.setFont(f2);
		loginptxt.setForeground(Color.ORANGE);
		loginptxt.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.ORANGE));
		c.add(loginptxt);
		
        userlabel =new JLabel("User Name ");
		userlabel.setBounds(520,130,150,20);
		userlabel.setFont(f);
		userlabel.setForeground(Color.BLACK);
		c.add(userlabel);
		
		passwordlabel =new JLabel("Password ");
		passwordlabel.setBounds(520,180,150,20);
		passwordlabel.setFont(f);
		passwordlabel.setForeground(Color.BLACK);
		c.add(passwordlabel);
		
        usernameText = new JTextField();
		usernameText.setBounds(520,150,240,25);
		usernameText.setBackground(Color.WHITE);
		usernameText.setForeground(Color.BLACK);
		usernameText.setFont(f);
		usernameText.setHorizontalAlignment(JTextField.CENTER);
		c.add(usernameText);
		
        passwordText = new JPasswordField();
		passwordText.setBounds(520,200,240,25);
		passwordText.setBackground(Color.WHITE);
		passwordText.setForeground(Color.BLACK);
		passwordText.setFont(f);
		passwordText.setHorizontalAlignment(JPasswordField.CENTER);
		c.add(passwordText);
		
		
		loginButton = new JButton("Login");
		loginButton.setBounds(520,250,240,30);
		loginButton.setBackground(Color.GREEN);
		loginButton.setForeground(Color.BLACK);
		loginButton.setFocusable(false);
		loginButton.setFont(f);
		c.add(loginButton);
		
		signupbutton = new JButton("Create New Account");
		signupbutton.setBounds(520,290,240,30);
		signupbutton.setBackground(Color.GREEN);
		signupbutton.setForeground(Color.BLACK);
		signupbutton.setFocusable(false);
		signupbutton.setFont(f);
		c.add(signupbutton);
		
		exitbutton = new JButton("Exit");
		exitbutton.setBounds(520,330,240,30);
		exitbutton.setBackground(Color.RED);
		exitbutton.setForeground(Color.BLACK);
		exitbutton.setFocusable(false);
		exitbutton.setFont(f);
		c.add(exitbutton);
		
		loginPImg =new JLabel();
		loginPImg.setIcon(new ImageIcon("UI/AllPicture/Login Page.jpg"));
		loginPImg.setBounds(0,-290,1902,1076);
		c.add(loginPImg);
		//Switch_Frame obj=new Switch_Frame();
		

		exitbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				usernameText.setText("");
				passwordText.setText("");
			}
		}
		);
		
		loginButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("UserName: " + usernameText.getText());
				
				Boolean verfication = _services.Login(usernameText.getText().trim(), passwordText.getText());
				
				
				
				if(verfication == true)
				{
					JOptionPane.showMessageDialog(null, "successfull","Message", JOptionPane.PLAIN_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "wrong","error", JOptionPane.ERROR_MESSAGE);
				}
				// if(usernameText.getText().equals("samia") && passwordText.getText().equals("1234"))
			// {
				// JOptionPane.showMessageDialog(null, "successfull","Message", JOptionPane.PLAIN_MESSAGE);
			// }
			// else
			// {
				// JOptionPane.showMessageDialog(null, "wrong","error", JOptionPane.ERROR_MESSAGE);
			// }
			}
		}
		);
		
		passwordText.addKeyListener(this); 
		
		//signupbutton.addActionListener(obj);
		signupbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{

				//dispose();
				
				RegistrationFrom frame1 = new RegistrationFrom();
				frame1.setVisible(true);
				
			}
		}
		);
		
	
	}


    public void keyPressed (KeyEvent ae) {    
         if(ae.getKeyCode() == KeyEvent.VK_ENTER)
         {
             System.out.println("Enter Pressed");
			 
			 JOptionPane.showMessageDialog(null,"Your login is succesfull");
			
         }
    }    
    public void keyReleased (KeyEvent ae) {    
           
    }    
    public void keyTyped (KeyEvent ae) {    
           
    } 
}