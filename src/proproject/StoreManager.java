package proproject;

import Gui.StoreLibrary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StoreManager {
     
    File pro = new File("Products.txt");
    StoreLibrary c = new StoreLibrary();
    FileManager fm = new FileManager();
    Products p = new Products();
    Handle handle = new Handle();
    public void addPrduct(Products data)
    {        
     c.AddProduct();
     c.add.addActionListener(handle);
    }
    
    public Products searchProduct()
    {
    c.SearchProduct();
    c.Search.addActionListener(handle);
        return null;  
    }
    
    public void DeleteProduct()
    {
    c.DeleteProduct();
    c.Delete.addActionListener(handle);
    }
    
    public void UpdateProduct()
    {
     c.UpdtaeProduct();
     c.Update.addActionListener(handle);
    }
    
    
    public class Handle implements ActionListener{

        @Override
         public void actionPerformed(ActionEvent event) {
           
             if(event.getSource() == c.add)
             {
                 try{
                 p.Brand=c.BrandOfProducttxt.getText();
                 p.ID=c.IDOfProducttxt.getText();
                 p.Name=c.NameOfProducttxt.getText();
                 p.Price=c.PriceOfProducttxt.getText();
                 p.Quantitiy = Integer.parseInt(c.QuantityOfProducttxt.getText());
                 //JOptionPane.showMessageDialog(null,c.FixedQuantitytxt.getText());
                 p.FixedQuantity =Integer.parseInt(c.FixedQuantitytxt.getText());
                 p.Type=c.TypeOfProducttxt.getText();
                 p.ProductionOfData=c.ProductionDataOfProducttxt.getText();
                 p.ExpirtyProduct = c.ExpiryDataOfProducttxt.getText();
                 try {
                     fm.Add(pro,p);
                     JOptionPane.showMessageDialog(c.add,"Added");
                 } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null,c.QuantityOfProducttxt.getText());
                 } catch (ClassNotFoundException ex) {
                  JOptionPane.showMessageDialog(null,c.FixedQuantitytxt.getText());
                 }
                 }catch(Exception e)
                 {
                  JOptionPane.showMessageDialog(c.add,"Insert The Data");
                 }
             }
             else if(event.getSource() == c.Search)
             {
              String id = c.IDtxt.getText();
              if(fm.Search(pro, id) == null)
                  JOptionPane.showMessageDialog(c.add,"Not Found","error",0);
              else
              {
              Products h = fm.Search(pro, id);
              JOptionPane.showMessageDialog(c.add,"Name : "+h.Name+'\n'+"ID : "+h.ID+'\n'+"Price : "+h.Price+'\n'+"Quantity : "+h.Quantitiy+'\n'+"Type : "+h.Type+'\n'+"Brand : "+h.Brand);
              }                            
             }
             else if(event.getSource() == c.Delete)
             {
             String id = c.IDOfProducttxt.getText();
                 try {
                     int result=fm.Delete(pro, id);
                     if(result==0)
                     JOptionPane.showMessageDialog(c.Delete,"Not Found","error",0);
                     else 
                     {
                      fm.Delete(pro, id);
                      JOptionPane.showMessageDialog(c.Delete,"Informations Of ID ("+id+") are Deleted");
                     }
                         
                 } catch (IOException ex) {
                     Logger.getLogger(StoreManager.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (ClassNotFoundException ex) {
                     Logger.getLogger(StoreManager.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
             else if(event.getSource() == c.Update)                 
             {
                 String id = c.IDtxt.getText();
                 if(fm.Search(pro, id) != null) 
                 {                         
                 p.Brand=c.BrandOfProducttxt.getText();
                 p.ID=c.IDOfProducttxt.getText();
                 p.Name=c.NameOfProducttxt.getText();
                 p.Price=c.PriceOfProducttxt.getText();
                 p.Quantitiy = Integer.parseInt(c.QuantityOfProducttxt.getText());
                 p.Type=c.TypeOfProducttxt.getText();
                  fm.Update(pro, id,p);
                  JOptionPane.showMessageDialog(c.Update,"Updated");
                 }
                 else
                  JOptionPane.showMessageDialog(c.Update,"("+id+") is Not Found ","error",0);
                     
             }
        }
    
    
    }
}

