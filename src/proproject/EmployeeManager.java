package proproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Gui.EmployeeLibrary;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import proproject.FileManager;
import proproject.Human;
/**
 *
 * @author Rabe3
 */
public class EmployeeManager implements Serializable{
    
   File employe =new File("Employers.txt");
   File supplier = new File("Suppliers.txt");
   EmployeeLibrary graph = new EmployeeLibrary();
   Human em = new Human();
   Handle handle = new Handle();
   FileManager fm=new FileManager();
    /*This Method To Add Employee*/  
    public void addEmployee(Human em) throws IOException
    {
        graph.AddEmployee();
        graph.Add.addActionListener(handle);
    }
    
    /*This Method To Search about Employee*/
    public Human searchEmployee() throws IOException
    {
        graph.SearchEmployee();
        graph.Search.addActionListener(handle); 
       return null;
    }
    
    /*This Method To Delete Employee*/
    public void deleteEmployee() throws ClassNotFoundException,IOException
    {
        graph.DeleteEmployee();
        graph.Delete.addActionListener(handle);  
    }
    
    /*This Method To Update Data Of Employee*/
    public void updateEmployee(Human em) throws IOException
    {     
        graph.UpdateEmployee();
        graph.Update.addActionListener(handle); 
    }
             
    public class Handle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
          

            if(event.getSource() == graph.Add)
             {
                em.Address=graph.AddressOfHumantxt.getText();
                em.FullName=graph.NameOfHumantxt.getText();
                em.ID=graph.IDtxt.getText();
                em.Phone=graph.PhoneOfHumantxt.getText();
                em.Salary=graph.SalaryOfHumantxt.getText();
                em.Email=graph.EmailOfHumantxt.getText();
                try {
                    fm.Add(employe, em);
                } catch (IOException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EmployeeManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(graph.Add,"Added");
              }
            else if(event.getSource() == graph.Update)
             {
                String id = graph.SearchIDtxt.getText();  
                if(fm.Search(employe, id) != null)
                {
                em.Address=graph.AddressOfHumantxt.getText();
                em.FullName=graph.NameOfHumantxt.getText();
                em.ID=graph.IDtxt.getText();
                em.Phone=graph.PhoneOfHumantxt.getText();
                em.Salary=graph.SalaryOfHumantxt.getText();
                em.Email=graph.EmailOfHumantxt.getText();
                fm.Update(employe, id, em);              
                JOptionPane.showMessageDialog(graph.Update,"Updated");
                }
                else
                 JOptionPane.showMessageDialog(graph.Update,"("+id+") is Not Found ","error",0);

             } 
            else if(event.getSource() == graph.Search)
             {
             String id = graph.IDtxt.getText();
             if(fm.Search(employe,id)==null)
             JOptionPane.showMessageDialog(null,"Not Found","error",0);
             else
             {
             Human h=fm.Search(employe,id);
             JOptionPane.showMessageDialog(graph.Search,"Name : "+h.FullName+'\n'+"Salary : "+h.Salary+'\n'+"Address : "+h.Address+'\n'+"Phone : "+h.Phone+'\n'+"Email : "+h.Email);                                                                    
             }
             }
            else if(event.getSource() == graph.Delete)
             {
                try {
                    String id = graph.IDtxt.getText();
                    int result =fm.Delete(employe, id);
                    if(result == 1)
                        try {
                            fm.Add(employe, id);
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
    
    

