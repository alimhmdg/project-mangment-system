package proproject;

import Gui.SignUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Account {

    Handle handle = new Handle();
    Stuff stuff =new Stuff();
    EmployeeMenu c = new EmployeeMenu();
    StoreMenu p = new StoreMenu();
    SignUp sign = new SignUp();
    CashierMenu cm = new CashierMenu();
    ArrayList<String> list = new ArrayList<String>();
    Report re =new Report();

    public void Login()
    {
     sign.Log();
     sign.login.addActionListener(handle);
    }
    
    public void Register()
    {
    sign.Reg();
    sign.Register.addActionListener(handle);
    }
    
    public class Handle implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == sign.Register)
            {
                String UserName = sign.TextUserRegister.getText();
                String Password = sign.TextPassRegister.getText();
            boolean register= stuff.register(UserName,Password);
            if(register == false)
                JOptionPane.showMessageDialog(sign.Register,"UserName Or Password is already used");
            else
            {
                stuff.register(UserName, Password);
                JOptionPane.showMessageDialog(sign.Register,"Rigstered");
            }
            }
            else if(event.getSource() == sign.login)
            {
             String UserName = sign.TextUserRegister.getText();
             String Password = sign.TextPassRegister.getText();
                try {
                    int login = stuff.login(UserName,Password);
                    if(login == 1)
                    {
                     list=re.MakingRebort();
                      for(int k=0;k<list.size();k++)
                        {
                        System.out.print(list.get(k)+'\n'+'\n');
                        }   
                     p.ProductMenu();
                     sign.fm1.setVisible(false);
                    }
                    else if(login == 2)
                    {
                    c.EmployeeMenu();
                    sign.fm1.setVisible(false);
                    }
                    else if(login == 3)
                    {
                        cm.CashierMenu();
                      sign.fm1.setVisible(false);
                    }
                    else 
                        JOptionPane.showMessageDialog(sign.login,"Password Or UserName not Correct");
                } catch (IOException ex) {
                    Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    }
    
}
