package proproject;
import Gui.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoreMenu {

    StoreLibrary sm = new StoreLibrary();
    Handle handle = new Handle();
    StoreManager ac= new StoreManager();
    public void ProductMenu()
    {
    sm.StoreMenu();
    sm.add.addActionListener(handle);
    sm.Update.addActionListener(handle);
    sm.Delete.addActionListener(handle);
    sm.Search.addActionListener(handle);
    sm.Exit.addActionListener(handle);
    }  
    public class Handle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
          
            if(event.getSource() == sm.add)
            {
                ac.addPrduct(ac.p);
            }
            else if(event.getSource() == sm.Delete)
            {           
               ac.DeleteProduct();
            }
            else if(event.getSource() == sm.Update)
            {
                ac.UpdateProduct();
            }
            else if(event.getSource() == sm.Search)
            {
                ac.searchProduct();
            }
            else if(event.getSource() == sm.Exit)
            {
             
            }
        }
    
    
    }
    
     }
     


