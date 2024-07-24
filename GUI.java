package Weeke20;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class GUI implements ActionListener
{
    JFrame Jf;
    
    JTextField t1,t2,t3;
    
    JButton b1,b2,b3;
    
    JLabel l1,l2,l3;
    
    public GUI()
    {
        Jf = new JFrame("JFrame");
        
        JPanel Pn = new JPanel();
        Pn.setLayout(null);
        Jf.add(Pn);
        
        
        t1 = new JTextField();
        t3 = new JTextField();
        t2 = new JTextField();
        
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("C");
       
        
        l1 = new JLabel("Number 1");
        l2 = new JLabel("Number 2");
        l3 = new JLabel("Result");
        
        t1.setBounds(198,90,180,32);
        t2.setBounds(198,170,180,32);
        t3.setBounds(192,284,180,32);
        
        b1.setBounds(66,365,70,32);
        b2.setBounds(198,365,70,32);
        b3.setBounds(330,365,70,32);
 
        
        l1.setBounds(66,97,91,25);
        l2.setBounds(66,177,91,25);
        l3.setBounds(66,293,91,25);
        
        Pn.add(t1); 
        Pn.add(t2);
        Pn.add(t3);
        
        Pn.add(b1);
        Pn.add(b2);
        Pn.add(b3);
       
        
        Pn.add(l1);
        Pn.add(l2);
        Pn.add(l3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
       
        
        
        
        Jf.setResizable(false);
        Jf.setVisible(true);
        Jf.setSize(500,500);
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        //Check for which button is clicked
        if (e.getSource()==b1)
        {
            try{
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = a+b;
            t3.setText(String.valueOf(sum));
            JOptionPane.showMessageDialog(Jf,"Done",
            "Message",JOptionPane.INFORMATION_MESSAGE);
        }
        
        catch(NumberFormatException ef){
            JOptionPane.showMessageDialog(Jf,"Please Enter Integer",
            "Error",JOptionPane.ERROR_MESSAGE);
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }}
        
        
        else if (e.getSource()==b2)
        {
            try{
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sub = a-b;
            t3.setText(String.valueOf(sub));
            JOptionPane.showMessageDialog(Jf,"Done",
            "Message",JOptionPane.INFORMATION_MESSAGE);
        
            }
        catch(NumberFormatException ef){
            JOptionPane.showMessageDialog(Jf,"Please Enter Integer",
            "Error",JOptionPane.ERROR_MESSAGE);
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        
        }
        
        else
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        
        

    }
 
    
}
