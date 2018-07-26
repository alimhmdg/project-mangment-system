package proproject;

import Gui.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class MainMenuProject {
    
    Handle handle = new Handle();
    Account ac = new Account();
    Menu m = new Menu();
    CheckProduct cp = new CheckProduct();
    public void Main()
    {        
    m.Menu();
    m.Login.addActionListener(handle);
    m.Register.addActionListener(handle);
    m.Exit.addActionListener(handle);
    m.Order.addActionListener(handle);
    }
    
    public class Handle implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
        
            if(event.getSource() == m.Login)
            {
            ac.Login();
            m.fm9.setVisible(false);
            }
            else if(event.getSource() == m.Register)
            {
            ac.Register();
            }
            else if(event.getSource() == m.Exit)
            {
            System.exit(0);
            }
            else if(event.getSource() == m.Order)
            {
            cp.check();
            }
            
        } 
    }
}
