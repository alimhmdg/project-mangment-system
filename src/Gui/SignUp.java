package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class SignUp {

    public JButton Register;
    public JLabel UserRegister,PassRegister;
    public JTextField TextUserRegister,TextPassRegister;
    public JFrame fm2 = new JFrame();
    
    public void Reg()
    {
     fm2.setSize(350,280);
     fm2.setTitle("Register");
     fm2.setResizable(false);
     fm2.setLocationRelativeTo(null);
     fm2.setLayout(null);
     fm2.setVisible(true);
     fm2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
     Register = new JButton("Register");
     Register.setForeground(Color.WHITE);
     Register.setBackground(Color.BLACK);
     Register.setFont(new Font("",Font.BOLD,14));
     UserRegister = new JLabel("UserName");
     PassRegister= new JLabel("Password");  
     TextUserRegister = new JTextField(20);
     TextPassRegister = new JTextField(20);
     TitledBorder border = new TitledBorder("Register");
     border.setTitlePosition(TitledBorder.CENTER);
     UserRegister.setFont(new Font("",Font.BOLD,14));  
     PassRegister.setFont(new Font("",Font.BOLD,14));   
     JPanel p = new JPanel();
     p.setBackground(Color.WHITE);
     fm2.getContentPane().setBackground(Color.darkGray);
     p.setBorder(border);
     p.setLayout(null);
     fm2.add(p);
     p.setBounds(50,30,250,150);
     p.add(UserRegister);
     p.add(TextUserRegister);
     p.add(PassRegister);
     p.add(TextPassRegister);
     fm2.add(Register);
     UserRegister.setBounds(20,47,80,40);
     PassRegister.setBounds(20,87,80,40);
     TextUserRegister.setBounds(110,55,110,25);
     TextPassRegister.setBounds(110,95,110,25);
     Register.setBounds(120,200,110,30);     
                fm2.addWindowListener( new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we) {
                        fm2.dispose();
                    }
                } );
    }
    /**************************************************************************/
    public JButton login;
    public JFrame fm1 = new JFrame();
    public void Log()
    {
     fm1.setSize(350,280);
     fm1.setTitle("Login");
     fm1.setResizable(false);
     fm1.setLocationRelativeTo(null);
     fm1.setLayout(null);
     fm1.setVisible(true);
     fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     login = new JButton("Login");
     login.setForeground(Color.WHITE);
     login.setBackground(Color.BLACK);
     login.setFont(new Font("",Font.BOLD,14));
     UserRegister = new JLabel("UserName");
     PassRegister= new JLabel("Password");  
     TextUserRegister = new JTextField(20);
     TextPassRegister = new JTextField(20);
     TitledBorder border = new TitledBorder("Login");
     border.setTitlePosition(TitledBorder.CENTER);
     UserRegister.setFont(new Font("",Font.BOLD,14));  
     PassRegister.setFont(new Font("",Font.BOLD,14));   
     fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     JPanel p = new JPanel();
     p.setBackground(Color.WHITE);
     fm1.getContentPane().setBackground(Color.LIGHT_GRAY);
     p.setBorder(border);
     p.setLayout(null);
     fm1.add(p);
     p.setBounds(50,30,250,150);
     p.add(UserRegister);
     p.add(TextUserRegister);
     p.add(PassRegister);
     p.add(TextPassRegister);
     fm1.add(login);
     UserRegister.setBounds(20,47,80,40);
     PassRegister.setBounds(20,87,80,40);
     TextUserRegister.setBounds(110,55,110,25);
     TextPassRegister.setBounds(110,95,110,25);
     login.setBounds(110,200,110,30);  
    
    }
}
