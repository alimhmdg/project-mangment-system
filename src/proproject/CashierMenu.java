package proproject;

import Gui.CashierLibrary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CashierMenu {

    CashierLibrary ca = new CashierLibrary();
    Cashier cash = new Cashier();
    Handle handle = new Handle();
    public void CashierMenu()
    {
    ca.CashierMenu();
    ca.Add.addActionListener(handle);
    ca.Update.addActionListener(handle);
    ca.Delete.addActionListener(handle);
    ca.Search.addActionListener(handle);
    ca.Exit.addActionListener(handle);
    }
    Human em= new Human();
    public class Handle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
          
            if(event.getSource() == ca.Add)
            {
                try {
                    cash.AddSupplier(em);
                } catch (IOException ex) {
                    Logger.getLogger(CashierMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(event.getSource() == ca.Delete)
            {
                try {
                    cash.DeleteSupplier();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CashierMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(CashierMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(event.getSource() == ca.Search)
            {
                try {
                    cash.SearchSupplier();
                } catch (IOException ex) {
                    Logger.getLogger(CashierMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(event.getSource() == ca.Update)
            {
                try {
                    cash.UpdateSupplier(em);
                } catch (IOException ex) {
                    Logger.getLogger(CashierMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    
    }
}
