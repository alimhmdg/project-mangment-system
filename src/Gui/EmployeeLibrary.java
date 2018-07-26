package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class EmployeeLibrary {

    public JButton Register,Login,Add,Search,Delete,Update,Exit,Pervious;
    public JTextField UserNametxt,Passwordtxt,Searchtxt,IDtxt,NewDatatxt;
    public JLabel Userlab,Passlab,SearchLabel,IDLabel,NewDataLabel;
    /**************************************************************************/
     JFrame fm1= new JFrame();
     public void SearchEmployee()
    {
        fm1.setSize(400,300);
        fm1.setResizable(false);
        fm1.setVisible(true);
        fm1.setLocationRelativeTo(null);
        fm1.setTitle("Employee Manger");
        fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm1.setLayout(null);
        
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
        TitledBorder border = new TitledBorder("Search Employee");
        JPanel p = new JPanel();
        p.setBorder(border);
        p.setLayout(null);
        p.setBounds(50,30,300,140);
        fm1.add(p);
        p.setBackground(Color.WHITE);    
        fm1.add(Search);
        fm1.add(Pervious);
        fm1.add(Exit);
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
     /*************************************************************************/
     JFrame fm2 = new JFrame();
     
      public void DeleteEmployee()
    {
        
        fm2.setSize(400,300);
        fm2.setResizable(false);
        fm2.setVisible(true);
        fm2.setLocationRelativeTo(null);
        fm2.setTitle("Employee Manger");
        fm2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm2.setLayout(null);
        
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
        fm2.add(p);
        p.setBackground(Color.WHITE);    
        fm2.add(Delete);
        fm2.add(Pervious);
        fm2.add(Exit);
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
      public JLabel NameOfHuman,IDOfHuman,SalaryOfHuman,PhoneOfHuman,AddressOfHuman,EmailOfHuman;
      public JTextField NameOfHumantxt,IDOfHumantxt,SalaryOfHumantxt,PhoneOfHumantxt,AddressOfHumantxt,EmailOfHumantxt;
      
      public void AddEmployee()
     {
      fm3.setVisible(true);
      fm3.setSize(560,380);
      fm3.setResizable(false);
      fm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fm3.setLayout(null);
      fm3.setTitle("Employee Manger");
      fm3.setLocationRelativeTo(null);   
      fm3.setLayout(null);
      NameOfHuman = new JLabel("Name : ");
      IDOfHuman = new JLabel("ID : ");
      SalaryOfHuman = new JLabel("Salary : ");
      PhoneOfHuman = new JLabel("Phone : ");
      AddressOfHuman =new JLabel("Address : ");
      EmailOfHuman = new JLabel("Email : "); 
      NameOfHumantxt = new JTextField();
      IDtxt = new JTextField();
      SalaryOfHumantxt = new JTextField();
      PhoneOfHumantxt = new JTextField();
      AddressOfHumantxt = new JTextField();
      EmailOfHumantxt = new JTextField();
      Add = new JButton("Add");
      Pervious =new JButton("Pervious"); 
      Exit = new JButton("Exit");
      Add.setBackground(Color.DARK_GRAY);
      Add.setFont(new Font("",Font.BOLD,15));
      Add.setForeground(Color.WHITE);
      Pervious.setBackground(Color.DARK_GRAY);
      Pervious.setFont(new Font("",Font.BOLD,15));
      Pervious.setForeground(Color.WHITE);
      Exit.setBackground(Color.DARK_GRAY);
      Exit.setFont(new Font("",Font.BOLD,15));
      Exit.setForeground(Color.WHITE);
      TitledBorder border = new TitledBorder("Add Employee");
      JPanel p = new JPanel();
      p.setBorder(border);
      p.setLayout(null);
      p.setBounds(50,30,455,250);
      fm3.add(p);
      p.setBackground(Color.WHITE);
      fm3.add(Pervious);
      fm3.add(Add);
      fm3.add(Exit);
      p.add(NameOfHuman);
      p.add(NameOfHumantxt);
      p.add(SalaryOfHuman);
      p.add(SalaryOfHumantxt);
      p.add(PhoneOfHuman);
      p.add(PhoneOfHumantxt);
      p.add(AddressOfHuman);
      p.add(AddressOfHumantxt);
      p.add(EmailOfHuman);
      p.add(EmailOfHumantxt);
      p.add(IDOfHuman);      
      p.add(IDtxt);  
      NameOfHuman.setBounds(30,60,100,20);
      NameOfHumantxt.setBounds(90,60,120,23);
      IDOfHuman.setBounds(260,60,100,25);
      IDtxt.setBounds(310,60,120,23);
      SalaryOfHuman.setBounds(30,120,100,20);
      SalaryOfHumantxt.setBounds(90,120,120,23);
      PhoneOfHuman.setBounds(260,120,100,20);
      PhoneOfHumantxt.setBounds(310,120,120,23);
      AddressOfHuman.setBounds(30,180,100,20);
      AddressOfHumantxt.setBounds(90,180,120,23);
      EmailOfHuman.setBounds(260,180,100,20);
      EmailOfHumantxt.setBounds(310,180,120,23);
      Add.setBounds(235,310,100,27);
      Exit.setBounds(410,310,100,27);
      Pervious.setBounds(50,310,100,27);
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
      
     /************************************************************************/
      JFrame fm4 = new JFrame();
       
      public JLabel SearchID,NewData;
      public JTextField SearchIDtxt;
      
     public void UpdateEmployee()
     {
      fm4.setVisible(true);
      fm4.setSize(360,550);
      fm4.setResizable(false);
      fm4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fm4.setLayout(null);
      fm4.setTitle("Employee Manager");
      fm4.setLocationRelativeTo(null);   
      NameOfHuman = new JLabel("Name : ");
      IDOfHuman = new JLabel("ID : ");
      SalaryOfHuman = new JLabel("Salary : ");
      PhoneOfHuman = new JLabel("Phone : ");
      AddressOfHuman =new JLabel("Address : ");
      EmailOfHuman = new JLabel("Email : "); 
      SearchID = new JLabel("Update ID  ");
      NameOfHumantxt = new JTextField();
      IDtxt = new JTextField();
      SalaryOfHumantxt = new JTextField();
      PhoneOfHumantxt = new JTextField();
      AddressOfHumantxt = new JTextField();
      EmailOfHumantxt = new JTextField();
      SearchIDtxt = new JTextField();
      Update = new JButton("Update");
      Pervious =new JButton("Pervious"); 
      Exit = new JButton("Exit");
      Update.setBackground(Color.DARK_GRAY);
      Update.setFont(new Font("",Font.BOLD,15));
      Update.setForeground(Color.WHITE);
      Pervious.setBackground(Color.DARK_GRAY);
      Pervious.setFont(new Font("",Font.BOLD,15));
      Pervious.setForeground(Color.WHITE);
      Exit.setBackground(Color.DARK_GRAY);
      Exit.setFont(new Font("",Font.BOLD,15));
      Exit.setForeground(Color.WHITE);
     TitledBorder border = new TitledBorder("Update Employee");
      JPanel p = new JPanel();
      p.setBorder(border);
      p.setLayout(null);
      p.setBounds(40,30,270,400);
      fm4.add(p);
      p.setBackground(Color.WHITE);
      p.add(NameOfHuman);
      p.add(NameOfHumantxt);
      p.add(SalaryOfHuman);
      p.add(SalaryOfHumantxt);
      p.add(PhoneOfHuman);
      p.add(PhoneOfHumantxt);
      p.add(AddressOfHuman);
      p.add(AddressOfHumantxt);
      p.add(EmailOfHuman);
      p.add(EmailOfHumantxt);
      p.add(IDOfHuman);      
      p.add(IDtxt);
      p.add(SearchIDtxt);
      p.add(SearchID);
      fm4.add(Exit);
      fm4.add(Pervious);
      fm4.add(Update);
      
      NameOfHuman.setBounds(40,40,50,20);
      NameOfHumantxt.setBounds(100,40,120,23);
      IDOfHuman.setBounds(40,90,50,25);
      IDtxt.setBounds(100,90,120,23);
      SalaryOfHuman.setBounds(40,140,100,20);
      SalaryOfHumantxt.setBounds(100,140,120,23);
      PhoneOfHuman.setBounds(40,190,200,20);
      PhoneOfHumantxt.setBounds(100,190,120,23);
      AddressOfHuman.setBounds(40,240,100,20);
      AddressOfHumantxt.setBounds(100,240,120,23);
      EmailOfHuman.setBounds(40,290,100,20);
      EmailOfHumantxt.setBounds(100,290,120,23);
      SearchIDtxt.setBounds(100,340,60,30);
      SearchID.setBounds(40,340,80,20);
      Update.setBounds(135,440,100,26);
      Pervious.setBounds(50,480,100,26); 
      Exit.setBounds(220,480,100,26);
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
                        "Are You Sure to Close this Application?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
          }
      
      });
      
     }
      
    /**************************************************************************/
      JLabel label =new JLabel();
      
       JFrame fm5 = new JFrame();
       JLabel Hello;
        public void EmployeeMenu()
    {     
      fm5.setVisible(true);
      fm5.setSize(400,370);
      fm5.setResizable(false);
      fm5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      fm5.setLayout(null);
      fm5.setLocationRelativeTo(null);
      fm5.setTitle("Employee Manager");     
      this.Add = new JButton("Add Employee");
      Add.setForeground(Color.BLACK);
      Add.setBackground(Color.WHITE);
      this.Delete =new JButton("Delete Employee");
      Delete.setForeground(Color.BLACK);
      Delete.setBackground(Color.WHITE);
      this.Update = new JButton("Update Employee");
      Update.setForeground(Color.BLACK);
      Update.setBackground(Color.WHITE);
      this.Search = new JButton("Search Employee");
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
