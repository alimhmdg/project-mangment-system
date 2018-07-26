package Gui;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.border.TitledBorder;
public class Tools {

    JFrame fm = new JFrame();
    public JButton Quantity,Expiry;   
    public void CheckQuantity()
    {
     fm.setSize(400,300);
     fm.setTitle("Checking");
     fm.setResizable(false);
     fm.setLocationRelativeTo(null);
     fm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     fm.setLayout(null);
     fm.setVisible(true);
     Quantity = new JButton("Quantity");
     Quantity.setBackground(Color.BLACK);
     Quantity.setForeground(Color.WHITE);
     Quantity.setFont(new Font("",Font.BOLD,18));
     Expiry = new JButton("Expiry Date");
     Expiry.setBackground(Color.BLACK);
     Expiry.setForeground(Color.WHITE);
     Expiry.setFont(new Font("",Font.BOLD,18));
     TitledBorder border = new TitledBorder("Check");
     border.setTitleFont(new Font("",Font.BOLD,18));
     border.setTitleColor(Color.WHITE);
     JPanel p = new JPanel();
     p.setLayout(null);
     p.setBorder(border);
     p.setBackground(Color.BLACK);
     fm.getContentPane().setBackground(Color.WHITE);
     p.setBounds(50,50,300,200);
     fm.add(p);
     p.add(Expiry);
     p.add(Quantity);
     Expiry.setBounds(80,50,150,40);
     Quantity.setBounds(80,120,150,40);
      fm.addWindowListener( new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we) {
                        fm.dispose();
                    }
                } );
    }
}
