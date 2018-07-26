package proproject;

import Gui.Tools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.JOptionPane;

public class CheckProduct {

    Report rep = new Report();
    Tools tool = new Tools();
    Handle handle = new Handle();
    ArrayList<Products> lis = new ArrayList<Products>();
    public void check()
    {
    tool.CheckQuantity();
    tool.Expiry.addActionListener(handle);
    tool.Quantity.addActionListener(handle);
    }
    
    public class Handle implements ActionListener
            {

        @Override
        public void actionPerformed(ActionEvent event) {
          
            if(event.getSource() == tool.Expiry)
            {
             lis=rep.CheckExpirtyOfProduct();
             for(int k=0;k<lis.size();k++)
             {                
             JOptionPane.showMessageDialog(tool.Expiry,"ID : "+lis.get(k).ID+'\t'+"Name : "+lis.get(k).Name+'\t'+"Quantity : "+lis.get(k).ExpirtyProduct+'\n');
             }
             
            }
            else if(event.getSource() == tool.Quantity)
            {
             lis=rep.CheckQuantityOdProduct();
             for(int k=0;k<lis.size();k++)
             {                
             JOptionPane.showMessageDialog(tool.Quantity,"ID : "+lis.get(k).ID+'\t'+"Name : "+lis.get(k).Name+'\t'+"Quantity : "+lis.get(k).Quantitiy+"\n");
             }
            }
            
        }
    
            }
}
