package Gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Menu {

    public JButton Store,Employee,User,Pervious,Exit,Register,Login;
       public JLabel menu,Hello;
       JFrame fm6 =new JFrame();
      /*
       public void MainMenu()
    {
      fm6.setSize(400,350);
      fm6.setVisible(true);
      fm6.setResizable(false);
      fm6.setTitle("menu");
      fm6.setLayout(null);
      fm6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fm6.setLocationRelativeTo(null);
      Store = new JButton("StoreManger");
      Employee = new JButton("EmployeeManager");
      User = new JButton("User");
      Pervious = new JButton("Pervious");
      Exit = new JButton("Exit");
      menu = new JLabel("Menu");
      menu.setFont(new Font("Courier",Font.BOLD,20));   
      fm6.add(menu);
      fm6.add(Store);
      fm6.add(Employee);
      fm6.add(User);
      fm6.add(Pervious);
      fm6.add(Exit);
           
      menu.setBounds(170,-5,120,60);
      Store.setBounds(123,50,160,26);  
      Employee.setBounds(133,100,140,26);
      User.setBounds(150,150,110,26);
      Pervious.setBounds(160,200,90,26);
      Exit.setBounds(170,250,70,26);   
    }
      */
    /**************************************************************************/
    public JFrame fm9 = new JFrame();
    public JButton Order;
    public void Menu()
    {
      fm9.setSize(320,360);
      fm9.setVisible(true);
      fm9.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      fm9.setTitle("Super Market");
      fm9.setResizable(false);
      fm9.setLocationRelativeTo(null);
      fm9.setLayout(null);
      Order = new JButton("Check");
      Order.setFont(new Font("",Font.BOLD,17));
      Order.setForeground(Color.WHITE);
      Order.setBackground(Color.DARK_GRAY);
      Login = new JButton("Login");
      Login.setFont(new Font("",Font.BOLD,17));
      Login.setForeground(Color.WHITE);
      Login.setBackground(Color.DARK_GRAY);
      Register = new JButton("Register");
      Register.setFont(new Font("",Font.BOLD,17));
      Register.setForeground(Color.WHITE);
      Register.setBackground(Color.DARK_GRAY);
      Exit = new JButton("Exit");
      Exit.setFont(new Font("",Font.BOLD,17));
      Exit.setForeground(Color.WHITE);
      Exit.setBackground(Color.DARK_GRAY);
      TitledBorder border = new TitledBorder("Super Market");
      border.setTitleColor(Color.WHITE);
      fm9.getContentPane().setBackground(Color.black);
      JPanel p = new JPanel();
      p.setBackground(Color.blue);
      p.add(Login);
      p.add(Register);
      p.add(Exit);
      p.add(Order);
      p.setBorder(border);
      fm9.add(p);
      p.setLayout(null);
      p.setBounds(60,30,200,270);
      Login.setBounds(50,50,110,32);
      Register.setBounds(50,100,110,32);
      Order.setBounds(50,150,110,32);
      Exit.setBounds(50,200,110,32);
      
    }
}
