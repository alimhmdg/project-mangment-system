package proproject;

import Gui.CashierLibrary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Cashier extends Stuff{
        
       File supplier = new File("Suppliers.txt");
   FileManager fm = new FileManager();
   CashierLibrary graph = new CashierLibrary();
   Handle handle = new Handle();
   Human em = new Human();
   public void AddSupplier(Human em) throws IOException
    {
        graph.AddSupplier();
        graph.Add.addActionListener(handle);
    }
    
    /*This Method To Search about Supplier*/
    public Human SearchSupplier() throws IOException
    {
        graph.SearchSupplier();
        graph.Search.addActionListener(handle); 
       return null;
    }
    
    /*This Method To Delete Supplier*/
    public void DeleteSupplier() throws ClassNotFoundException,IOException
    {
        graph.DeleteSupplier();
        graph.Delete.addActionListener(handle);  
    }
    
    /*This Method To Update Data Of Supplier*/
    public void UpdateSupplier(Human em) throws IOException
    {     
        graph.UpdateSupplier();
        graph.Update.addActionListener(handle); 
    }
             
    public class Handle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == graph.Add)
             {
                em.FullName=graph.NameOfHumantxt.getText();
                em.Phone=graph.PhoneOfHumantxt.getText();
                em.Email=graph.EmailOfHumantxt.getText();
                em.ID=graph.IDOfHumantxt.getText();
                try {
                    fm.Add(supplier, em);
                } catch (IOException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Cashier.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(graph.Add,"Added");
              }
            else if(event.getSource() == graph.Update)
             {
                
                 String id = graph.IDtxt.getText();
                 if(fm.Search(supplier, id) != null)
                 {
                em.FullName=graph.NameOfHumantxt.getText();
                em.Phone=graph.PhoneOfHumantxt.getText();
                em.Email=graph.EmailOfHumantxt.getText();
                em.ID=graph.IDOfHumantxt.getText();
                fm.Update(supplier,id, em);
                JOptionPane.showMessageDialog(graph.Update,"Updated");
                 }
                 else
                JOptionPane.showMessageDialog(graph.Update,"("+id+") is Not Found ","error",0);
 
             } 
            else if(event.getSource() == graph.Search)
             {
             String id = graph.IDtxt.getText();
             if(fm.Search(supplier,id)==null)
             JOptionPane.showMessageDialog(null,"Not Found","error",0);
             else
             {
             Human h=fm.Search(supplier,id);
             JOptionPane.showMessageDialog(graph.Search,"Name : "+h.FullName+'\n'+"Phone : "+h.Phone+'\n'+"Email : "+h.Email);                                                                    
             }
             }
            else if(event.getSource() == graph.Delete)
             {
                try {
                    String id = graph.IDtxt.getText();
                    int result =fm.Delete(supplier, id);
                    if(result == 1)
                        try {
                            fm.Delete(supplier, id);
                            JOptionPane.showMessageDialog(graph.Delete,"Deleted");
                            
                        } catch (IOException ex) {
                            Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    else        
                        JOptionPane.showMessageDialog(graph.Delete,"Not Found");
                } catch (IOException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
               }
            }
              
            
           } 

   
}
