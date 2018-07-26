package proproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EmployeeMenu {
    
      EmployeeManager em = new EmployeeManager();
      public void EmployeeMenu()
      {
       em.graph.EmployeeMenu();
       Handle handle = new Handle();
       em.graph.Add.addActionListener(handle);
       em.graph.Update.addActionListener(handle);
       em.graph.Delete.addActionListener(handle);
       em.graph.Search.addActionListener(handle);
      }
     public class Handle implements ActionListener{
       
        @Override
        public void actionPerformed(ActionEvent event) {
            
            if(event.getSource() == em.graph.Add)
            {
               try {
                   em.addEmployee(em.em);
            } catch (IOException ex) {
                Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else if(event.getSource() == em.graph.Search)
            {
                try {
                    em.searchEmployee();
                } catch (IOException ex) {
                    Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(event.getSource() == em.graph.Delete)
            {
                try {
                    em.deleteEmployee();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(event.getSource() == em.graph.Update)
            {
                try {
                    em.updateEmployee(em.em);
                } catch (IOException ex) {
                    Logger.getLogger(EmployeeMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
           
        }
     
     }
    
}
