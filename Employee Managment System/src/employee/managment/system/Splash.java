package employee.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Suneet
 */
public class Splash extends JFrame implements ActionListener {
    
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading=new JLabel("IT Office Employees Record System");
     heading.setBounds(80,30 ,1200, 60);
       heading.setFont(new Font("serif",Font.BOLD,40));
       heading.setForeground(Color.BLACK);
               
      
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/empimg.jpg"));
        Image i2=i1.getImage().getScaledInstance(1110,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(20,100,1050,500);
        add(image); 
        JButton clickhere=new JButton ("CLICK HERE TO CONTINUE");
        clickhere .setBounds(350,350,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
        add(heading);
        setSize(1110,700);
        setLocation(150,50); 
        setVisible(true);
        while (true)
        {
        heading.setVisible(false);
        try{
            Thread.sleep(500);
            
        }catch(Exception e)
        {
            
        }
        heading.setVisible(true);
        try{
            Thread.sleep(500);
        
        }catch(Exception e){
            
        }
    }
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    
    }
    
    public static void main (String args[]) 
    {
        new Splash();
       
    }
    
}
