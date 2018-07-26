package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class CashierLibrary {

    JFrame fm1 = new JFrame();
    public JLabel NameOfHuman,IDOfHuman,PhoneOfHuman,AddressOfHuman,EmailOfHuman,CurrentID;
    public JTextField NameOfHumantxt,IDOfHumantxt,SalaryOfHumantxt,PhoneOfHumantxt,AddressOfHumantxt,EmailOfHumantxt,IDtxt;
    public JButton Add,Register,Delete,Update,Exit,Pervious,Search;
    
    public void AddSupplier()
    {
     fm1.setSize(500,400);
     fm1.setVisible(true);
     fm1.setResizable(false);
     fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     fm1.setLocationRelativeTo(null);
     fm1.setTitle("Cashier");
     fm1.setLayout(null);
     NameOfHuman = new JLabel("Full Name :");
     IDOfHuman = new JLabel("ID : ");
     PhoneOfHuman = new JLabel("Phone :");
     EmailOfHuman = new JLabel("Email :"); 
     NameOfHumantxt = new JTextField();
     PhoneOfHumantxt = new JTextField();
     IDOfHumantxt = new JTextField();
     EmailOfHumantxt = new JTextField();
     Add = new JButton("Add");
     Pervious =new JButton("Pervious"); 
     Exit = new JButton("Exit");
     Add.setBackground(Color.DARK_GRAY);
     Add.setFont(new Font("",Font.BOLD,16));
     Add.setForeground(Color.WHITE);
     Pervious.setBackground(Color.DARK_GRAY);
     Pervious.setFont(new Font("",Font.BOLD,13));
     Pervious.setForeground(Color.WHITE);
     Exit.setBackground(Color.DARK_GRAY);
     Exit.setFont(new Font("",Font.BOLD,13));
     Exit.setForeground(Color.WHITE);
     TitledBorder border = new TitledBorder("Add Supplier");
     border.setTitleFont(new Font("",Font.BOLD,15));
     JPanel p = new JPanel();
     p.setLayout(null);
     fm1.add(p);
     p.setBorder(border);
     p.setBackground(Color.WHITE);
     p.setBounds(70,30,350,260);
     p.add(this.NameOfHuman);
     p.add(this.NameOfHumantxt);
     p.add(this.IDOfHuman);
     p.add(this.IDOfHumantxt);
     p.add(this.PhoneOfHuman);
     p.add(this.PhoneOfHumantxt);
     p.add(this.EmailOfHuman);
     p.add(this.EmailOfHumantxt);
     fm1.add(Add);
     fm1.add(Exit);
     fm1.add(Pervious);
     this.NameOfHuman.setBounds(50,50,100,20);
     this.NameOfHumantxt.setBounds(140,50,150,23);
     this.IDOfHuman.setBounds(70,100,100,20);
     this.IDOfHumantxt.setBounds(140,98,60,30);
     this.EmailOfHuman.setBounds(50,150,100,20);
     this.EmailOfHumantxt.setBounds(140,150,150,23);
     this.PhoneOfHuman.setBounds(50,200,100,20);
     this.PhoneOfHumantxt.setBounds(140,200,150,23);
     Add.setBounds(200,310,90,30);
     Exit.setBounds(330,310,90,30);
     Pervious.setBounds(70,310,90,30);
     Pervious.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showOptionDialog(fm1,
                        "Are You Sure to Close this Operation?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    fm1.dispose();
                }
              
          } 
      });
        Exit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {

                 int confirm = JOptionPane.showOptionDialog(fm1,
                        "Are You Sure to Exit From Program?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        
        });
    }
 
    JFrame fm2 = new JFrame();
    public void UpdateSupplier()
    {
     fm2.setSize(500,450);
     fm2.setVisible(true);
     fm2.setResizable(false);
     fm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     fm2.setLocationRelativeTo(null);
     fm2.setTitle("Cashier");
     fm2.setLayout(null);
     NameOfHuman = new JLabel("Full Name :");
     CurrentID = new JLabel("Update ID :");
     IDOfHuman = new JLabel("ID : ");
     PhoneOfHuman = new JLabel("Phone :");
     EmailOfHuman = new JLabel("Email :"); 
     NameOfHumantxt = new JTextField();
     PhoneOfHumantxt = new JTextField();
     IDOfHumantxt = new JTextField();
     EmailOfHumantxt = new JTextField();
     IDtxt = new JTextField();
     Update = new JButton("Update");
     Pervious =new JButton("Pervious"); 
     Exit = new JButton("Exit");
     Update.setBackground(Color.DARK_GRAY);
     Update.setFont(new Font("",Font.BOLD,16));
     Update.setForeground(Color.WHITE);
     Pervious.setBackground(Color.DARK_GRAY);
     Pervious.setFont(new Font("",Font.BOLD,13));
     Pervious.setForeground(Color.WHITE);
     Exit.setBackground(Color.DARK_GRAY);
     Exit.setFont(new Font("",Font.BOLD,13));
     Exit.setForeground(Color.WHITE);
     TitledBorder border = new TitledBorder("Update Supplier");
     border.setTitleFont(new Font("",Font.BOLD,15));
     JPanel p = new JPanel();
     p.setLayout(null);
     fm2.add(p);
     p.setBorder(border);
     p.setBackground(Color.WHITE);
     p.setBounds(70,30,350,300);
     p.add(this.NameOfHuman);
     p.add(this.NameOfHumantxt);
     p.add(this.IDOfHuman);
     p.add(this.IDOfHumantxt);
     p.add(this.PhoneOfHuman);
     p.add(this.PhoneOfHumantxt);
     p.add(this.EmailOfHuman);
     p.add(this.EmailOfHumantxt);
     p.add(IDtxt);
     p.add(CurrentID);
     fm2.add(Update);
     fm2.add(Exit);
     fm2.add(Pervious);
     this.NameOfHuman.setBounds(50,50,100,20);
     this.NameOfHumantxt.setBounds(140,50,150,23);
     this.IDOfHuman.setBounds(70,100,100,20);
     this.IDOfHumantxt.setBounds(140,98,60,30);
     this.EmailOfHuman.setBounds(50,150,100,20);
     this.EmailOfHumantxt.setBounds(140,150,150,23);
     this.PhoneOfHuman.setBounds(50,200,100,20);
     this.PhoneOfHumantxt.setBounds(140,200,150,23);
     this.IDtxt.setBounds(140,250,60,30);
     this.CurrentID.setBounds(50,253,100,20);
     Update.setBounds(200,360,90,30);
     Exit.setBounds(330,360,90,30);
     Pervious.setBounds(70,360,90,30);
     Pervious.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showOptionDialog(fm2,
                        "Are You Sure to Close this Operation?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    fm2.dispose();
                }
              
          } 
      });
        Exit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {

                 int confirm = JOptionPane.showOptionDialog(fm2,
                        "Are You Sure to Exit From Program?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        
        });
    }
    /**************************************************************************/
    JFrame fm3 = new JFrame();
    JLabel SearchLabel;
    public void SearchSupplier()
    {
        fm3.setSize(400,300);
        fm3.setResizable(false);
        fm3.setVisible(true);
        fm3.setLocationRelativeTo(null);
        fm3.setTitle("Cashier");
        fm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm3.setLayout(null);
        
        Search = new JButton("Search");
        Pervious = new JButton("Pervious");
        Exit = new JButton("Exit");
        SearchLabel = new JLabel("ID");
        SearchLabel.setFont(new Font("",Font.BOLD,24));
        IDtxt= new JTextField();
        Search.setBackground(Color.DARK_GRAY);
        Search.setFont(new Font("",Font.BOLD,15));
        Search.setForeground(Color.WHITE);
        Pervious.setBackground(Color.DARK_GRAY);
        Pervious.setFont(new Font("",Font.BOLD,15));
        Pervious.setForeground(Color.WHITE);
        Exit.setBackground(Color.DARK_GRAY);
        Exit.setFont(new Font("",Font.BOLD,15));
        Exit.setForeground(Color.WHITE);
        TitledBorder border = new TitledBorder("Search Supplier");
        JPanel p = new JPanel();
        p.setBorder(border);
        p.setLayout(null);
        p.setBounds(50,30,300,140);
        fm3.add(p);
        p.setBackground(Color.WHITE);    
        fm3.add(Search);
        fm3.add(Pervious);
        fm3.add(Exit);
        p.add(IDtxt);
        p.add(SearchLabel);        
        SearchLabel.setBounds(140,40,100,30);
        IDtxt.setBounds(105,90,100,30);
        Search.setBounds(153,185,100,30);
        Pervious.setBounds(55,230,100,30);   
        Exit.setBounds(250,230,100,30);
        Pervious.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showOptionDialog(fm3,
                        "Are You Sure to Close this Operation?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    fm3.dispose();
                }
              
          } 
      });
        Exit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {

                 int confirm = JOptionPane.showOptionDialog(fm3,
                        "Are You Sure to Exit From Program?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        
        });
    }
    /**************************************************************************/
    JFrame fm4 = new JFrame();
    public void DeleteSupplier()
    {
        fm4.setSize(400,300);
        fm4.setResizable(false);
        fm4.setVisible(true);
        fm4.setLocationRelativeTo(null);
        fm4.setTitle("Employee Manger");
        fm4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm4.setLayout(null);
        
        Delete = new JButton("Delete");
        Pervious = new JButton("Pervious");
        Exit = new JButton("Exit");
        SearchLabel = new JLabel("ID");
        SearchLabel.setFont(new Font("",Font.BOLD,24));
        IDtxt= new JTextField();
        Delete.setBackground(Color.DARK_GRAY);
        Delete.setFont(new Font("",Font.BOLD,15));
        Delete.setForeground(Color.WHITE);
        Pervious.setBackground(Color.DARK_GRAY);
        Pervious.setFont(new Font("",Font.BOLD,15));
        Pervious.setForeground(Color.WHITE);
        Exit.setBackground(Color.DARK_GRAY);
        Exit.setFont(new Font("",Font.BOLD,15));
        Exit.setForeground(Color.WHITE);
        TitledBorder border = new TitledBorder("Delete Employee");
        JPanel p = new JPanel();
        p.setBorder(border);
        p.setLayout(null);
        p.setBounds(50,30,300,140);
        fm4.add(p);
        p.setBackground(Color.WHITE);    
        fm4.add(Delete);
        fm4.add(Pervious);
        fm4.add(Exit);
        p.add(IDtxt);
        p.add(SearchLabel);        
        SearchLabel.setBounds(140,40,100,30);
        IDtxt.setBounds(105,90,100,30);
        Delete.setBounds(153,185,100,30);
        Pervious.setBounds(55,230,100,30);   
        Exit.setBounds(250,230,100,30);
        Pervious.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showOptionDialog(fm4,
                        "Are You Sure to Close this Operation?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    fm4.dispose();
                }
              
          } 
      });
        Exit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {

                 int confirm = JOptionPane.showOptionDialog(fm4,
                        "Are You Sure to Exit From Program?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        
        }); 
    }
    JLabel label =new JLabel();
      
       JFrame fm5 = new JFrame();
       JLabel Hello;
       public void CashierMenu()
    {     
      fm5.setVisible(true);
      fm5.setSize(400,370);
      fm5.setResizable(false);
      fm5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      fm5.setLayout(null);
      fm5.setLocationRelativeTo(null);
      fm5.setTitle("Supplier");     
      this.Add = new JButton("Add Supplier");
      Add.setForeground(Color.BLACK);
      Add.setBackground(Color.WHITE);
      this.Delete =new JButton("Delete Supplier");
      Delete.setForeground(Color.BLACK);
      Delete.setBackground(Color.WHITE);
      this.Update = new JButton("Update Supplier");
      Update.setForeground(Color.BLACK);
      Update.setBackground(Color.WHITE);
      this.Search = new JButton("Search Supplier");
      Search.setForeground(Color.BLACK);
      Search.setBackground(Color.WHITE);
      this.Exit = new JButton("Exit");
      Exit.setForeground(Color.WHITE);
      Exit.setBackground(Color.blue);
      Exit.setFont(new Font("",Font.BOLD,15));
      TitledBorder border = new TitledBorder("Operations");
      JPanel p = new JPanel();
      p.setLayout(null);
      p.setBorder(border);
      p.setBounds(50,30,300,250);
      p.setBackground(Color.WHITE);
      fm5.getContentPane().setBackground(Color.BLACK);
      fm5.add(p);
      fm5.add(Exit);
      p.add(this.Add);
      p.add(this.Delete);
      p.add(this.Update);
      p.add(this.Search);
      this.Add.setBounds(70,40,160,30);  
      this.Delete.setBounds(70,90,160,30);  
      this.Update.setBounds(70,140,160,30);
      this.Search.setBounds(70,190,160,30);
      this.Exit.setBounds(150,300,90,30);
      Exit.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showOptionDialog(fm5,
                        "Are You Sure to Close this Application?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
              
          } 
      });
    } 
}
