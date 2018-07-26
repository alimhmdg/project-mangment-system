package Gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class StoreLibrary {

    JFrame fm = new JFrame();
    public JButton add,Delete,Update,Search,Exit,Pervious;
    public JLabel NameOfProduct,IDOfProduct,PriceOfProduct,QuantityOfProduct,TypeOfProduct,BrandOfProduct
            ,SearchID,NewData,ProductionDataOfProduct,ExpiryDataOfProduct,FixedQuantity;
    public JTextField NameOfProducttxt,IDOfProducttxt,PriceOfProducttxt,QuantityOfProducttxt
            ,TypeOfProducttxt,BrandOfProducttxt,ExpiryDataOfProducttxt,ProductionDataOfProducttxt,FixedQuantitytxt;

    public void AddProduct()
    {
        fm.setSize(560,470);
        fm.setVisible(true);
        fm.setResizable(false);
        fm.setLocationRelativeTo(null);
        fm.setTitle("Store Manager");
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setLayout(null);
        NameOfProduct = new JLabel("Name : ");
        IDOfProduct = new JLabel("ID : ");
        PriceOfProduct = new JLabel("Price : ");
        BrandOfProduct = new JLabel("Brand : ");
        QuantityOfProduct = new JLabel("Quantity : ");
        TypeOfProduct = new JLabel("Type : ");
        ProductionDataOfProduct = new JLabel("Production Date");
        ExpiryDataOfProduct = new JLabel("Expiry Date");
        FixedQuantity = new JLabel("Fixed Quantity");
        NameOfProducttxt = new JTextField();
        IDOfProducttxt = new JTextField();
        PriceOfProducttxt = new JTextField();
        BrandOfProducttxt = new JTextField();
        QuantityOfProducttxt = new JTextField();
        TypeOfProducttxt = new JTextField();
        FixedQuantitytxt= new JTextField();
        ExpiryDataOfProducttxt = new JTextField("yyyy-MM-dd");
        ProductionDataOfProducttxt = new JTextField("yyyy-MM-dd");
        add = new JButton("Add");
        Pervious = new JButton("Pervious");
        Exit = new JButton("Exit");
        add.setBackground(Color.DARK_GRAY);
        add.setFont(new Font("",Font.BOLD,15));
        add.setForeground(Color.WHITE);
        Pervious.setBackground(Color.DARK_GRAY);
        Pervious.setFont(new Font("",Font.BOLD,15));
        Pervious.setForeground(Color.WHITE);
        Exit.setBackground(Color.DARK_GRAY);
        Exit.setFont(new Font("",Font.BOLD,15));
        Exit.setForeground(Color.WHITE);
        TitledBorder border = new TitledBorder("Add Product");
        JPanel p = new JPanel();
        p.setBorder(border);
        p.setLayout(null);
        p.setBounds(50,30,455,350);
        fm.add(p);
        p.setBackground(Color.WHITE);
        p.add(ProductionDataOfProduct);
        p.add(ProductionDataOfProducttxt);
        p.add(ExpiryDataOfProduct);
        p.add(ExpiryDataOfProducttxt);
        p.add(NameOfProduct);
        p.add(IDOfProduct);
        p.add(PriceOfProduct);
        p.add(BrandOfProduct);
        p.add(QuantityOfProduct);
        p.add(TypeOfProduct);
        p.add(NameOfProducttxt);
        p.add(IDOfProducttxt);
        p.add(PriceOfProducttxt);
        p.add(BrandOfProducttxt);
        p.add(QuantityOfProducttxt);
        p.add(TypeOfProducttxt);
        p.add(FixedQuantity);
        p.add(FixedQuantitytxt);
        fm.add(add);
        fm.add(Pervious);
        fm.add(Exit);
        ProductionDataOfProduct.setBounds(10,240,100,20);
        ProductionDataOfProducttxt.setBounds(110,240,100,23);
        ExpiryDataOfProduct.setBounds(230,240,100,20);
        ExpiryDataOfProducttxt.setBounds(330,240,100, 23);
        NameOfProduct.setBounds(30,60,100,20);
        NameOfProducttxt.setBounds(90,60,120,23);
        IDOfProduct.setBounds(250,60,100,20);
        IDOfProducttxt.setBounds(310,60,120,23);
        BrandOfProduct.setBounds(30,120,100,20);
        BrandOfProducttxt.setBounds(90,120,120,23);
        PriceOfProduct.setBounds(250,120,100,20);
        PriceOfProducttxt.setBounds(310,120,120,23);
        TypeOfProduct.setBounds(30,180,100,20);
        TypeOfProducttxt.setBounds(90,180,120,23);
        QuantityOfProduct.setBounds(250,180,100,20);
        QuantityOfProducttxt.setBounds(310,180,120,23);
        FixedQuantity.setBounds(120,305,100,20);
        FixedQuantitytxt.setBounds(220,300,60,30);
        add.setBounds(233,390,100,27);
        Exit.setBounds(405,390,100,27);
        Pervious.setBounds(53,390,100,27);
        Pervious.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showOptionDialog(fm,
                        "Are You Sure to Close this Application?",
                        "Exit Confirmation", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == JOptionPane.YES_OPTION) {
                   
                    fm.dispose();
                }
              
          } 
      });
        Exit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
               int confirm = JOptionPane.showOptionDialog(fm,
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
    public JTextField IDtxt;
    public void UpdtaeProduct()
    {
      fm3.setVisible(true);
      fm3.setSize(360,600);
      fm3.setResizable(false);
      fm3.setLocationRelativeTo(null);
      fm3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      fm3.setLayout(null);
      fm3.setTitle("Store Manager");
      fm3.setLocationRelativeTo(null);   
      NameOfProduct = new JLabel("Name : ");
      IDOfProduct = new JLabel("ID : ");
      BrandOfProduct = new JLabel("Brand : ");
      PriceOfProduct = new JLabel("Price : ");
      QuantityOfProduct =new JLabel("Quantity : ");
      TypeOfProduct = new JLabel("Type : "); 
      ProductionDataOfProduct = new JLabel("Production Date : ");
      ExpiryDataOfProduct = new JLabel("Expiry Date : ");
      SearchID = new JLabel("Current ID");
      NameOfProducttxt = new JTextField();
      TypeOfProducttxt = new JTextField();
      IDOfProducttxt = new JTextField();
      BrandOfProducttxt = new JTextField();
      PriceOfProducttxt = new JTextField();
      QuantityOfProducttxt = new JTextField();
      ExpiryDataOfProducttxt = new JTextField();
      ProductionDataOfProducttxt = new JTextField();
      IDtxt = new JTextField();
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
      TitledBorder border = new TitledBorder("Update Product");
      JPanel p = new JPanel();
      p.setBorder(border);
      p.setLayout(null);
      p.setBounds(50,30,270,450);
      fm3.add(p);
      p.setBackground(Color.WHITE);
      p.add(ProductionDataOfProduct);
      p.add(ProductionDataOfProducttxt);
      p.add(ExpiryDataOfProduct);
      p.add(ExpiryDataOfProducttxt);
      p.add(NameOfProduct);
      p.add(IDOfProduct);
      p.add(PriceOfProduct);
      p.add(BrandOfProduct);
      p.add(QuantityOfProduct);
      p.add(TypeOfProduct);
      p.add(NameOfProducttxt);
      p.add(IDOfProducttxt);
      p.add(PriceOfProducttxt);
      p.add(BrandOfProducttxt);
      p.add(QuantityOfProducttxt);
      p.add(TypeOfProducttxt);
      p.add(SearchID);
      p.add(IDtxt);
      fm3.add(Update);
      fm3.add(Pervious);
      fm3.add(Exit);
 
      NameOfProduct.setBounds(40,40,50,20);
      NameOfProducttxt.setBounds(100,40,120,23);
      IDOfProduct.setBounds(40,80,100,25);
      IDOfProducttxt.setBounds(100,80,120,23);
      BrandOfProduct.setBounds(40,120,100,20);
      BrandOfProducttxt.setBounds(100,120,120,23);
      TypeOfProduct.setBounds(40,160,100,20);
      TypeOfProducttxt.setBounds(100,160,120,23);
      QuantityOfProduct.setBounds(40,200,100,20);
      QuantityOfProducttxt.setBounds(100,200,120,23);
      PriceOfProduct.setBounds(40,240,100,20);
      PriceOfProducttxt.setBounds(100,240,120,23);
      ProductionDataOfProduct.setBounds(40,280,100,20);
      ProductionDataOfProducttxt.setBounds(100,310,120,23);
      ExpiryDataOfProduct.setBounds(40,330,100,20);
      ExpiryDataOfProducttxt.setBounds(100,360,120,23);
      IDtxt.setBounds(100,410,60,30);
      SearchID.setBounds(40,410,120,20);
      Update.setBounds(135,490,100,26);
      Pervious.setBounds(50,540,100,26); 
      Exit.setBounds(220,540,100,26);        
      Pervious.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae) {
            int confirm = JOptionPane.showOptionDialog(fm3,
                        "Are You Sure to Close this Application?",
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
    /*************************************************************************/
     JFrame fm2 = new JFrame();
     JLabel SearchLabel;
    public void DeleteProduct()
    {
     
        fm2.setSize(400,300);
        fm2.setResizable(false);
        fm2.setVisible(true);
        fm2.setLocationRelativeTo(null);
        fm2.setTitle("Store Manger");
        fm2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fm2.setLayout(null);
        
        Delete = new JButton("Delete");
        Pervious = new JButton("Pervious");
        Exit = new JButton("Exit");
        SearchLabel = new JLabel("ID");
        SearchLabel.setFont(new Font("",Font.BOLD,24));
        IDOfProducttxt= new JTextField();
        Delete.setBackground(Color.DARK_GRAY);
        Delete.setFont(new Font("",Font.BOLD,15));
        Delete.setForeground(Color.WHITE);
        Pervious.setBackground(Color.DARK_GRAY);
        Pervious.setFont(new Font("",Font.BOLD,15));
        Pervious.setForeground(Color.WHITE);
        Exit.setBackground(Color.DARK_GRAY);
        Exit.setFont(new Font("",Font.BOLD,15));
        Exit.setForeground(Color.WHITE);
        TitledBorder border = new TitledBorder("Delete Product");
        JPanel p = new JPanel();
        p.setBorder(border);
        p.setLayout(null);
        p.setBounds(50,30,300,140);
        fm2.add(p);
        p.setBackground(Color.WHITE);    
        fm2.add(Delete);
        fm2.add(Pervious);
        fm2.add(Exit);
        p.add(IDOfProducttxt);
        p.add(SearchLabel);        
        SearchLabel.setBounds(140,40,100,30);
        IDOfProducttxt.setBounds(105,90,100,30);
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
    JFrame fm1 = new JFrame();
    public void SearchProduct()
    {
        fm1.setSize(400,300);
        fm1.setResizable(false);
        fm1.setVisible(true);
        fm1.setLocationRelativeTo(null);
        fm1.setTitle("Store Manger");
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
        TitledBorder border = new TitledBorder("Search Product");
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
    JLabel label =new JLabel();
      
       JFrame fm5 = new JFrame();
       JLabel Hello;
       public void StoreMenu()
    {     
      fm5.setVisible(true);
      fm5.setSize(400,370);
      fm5.setResizable(false);
      fm5.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      fm5.setLayout(null);
      fm5.setLocationRelativeTo(null);
      fm5.setTitle("Store Manager");     
      this.add = new JButton("Add Product");
      add.setForeground(Color.BLACK);
      add.setBackground(Color.WHITE);
      this.Delete =new JButton("Delete Product");
      Delete.setForeground(Color.BLACK);
      Delete.setBackground(Color.WHITE);
      this.Update = new JButton("Update Product");
      Update.setForeground(Color.BLACK);
      Update.setBackground(Color.WHITE);
      this.Search = new JButton("Search Product");
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
      p.add(this.add);
      p.add(this.Delete);
      p.add(this.Update);
      p.add(this.Search);
      this.add.setBounds(70,40,160,30);  
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
    

