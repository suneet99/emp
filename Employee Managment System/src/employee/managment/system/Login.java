/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.io.CharArrayReader;
import javax.swing.JPasswordField;
/**
 *
 * @author Suneet
 */
public class Login  extends JFrame implements ActionListener{
    JTextField tfusername;
    JPasswordField tfpassword;
    Checkbox  ckbox;
        Login() {
            
            
        
            getContentPane().setBackground(Color.WHITE);
            setLayout(null);
            JLabel lblusername=new JLabel("USERNAME");
            lblusername.setBounds(40,20,100,30);
            
            lblusername.setForeground(Color.BLACK);
            add(lblusername);
            tfusername= new JTextField();
            tfusername.setBounds(150,20,100,30);
            add(tfusername);
       
            JLabel lblpassword=new JLabel("PASSWORD");
                lblpassword.setForeground(Color.BLACK);
            lblpassword.setBounds(40,70,100,30);
            add(lblpassword);
            tfpassword= new JPasswordField();
            tfpassword.setBounds(150,70,100,30);
            add(tfpassword);
          
      
         
           
            JButton login=new JButton ("LOGIN");
            login.setBounds(80,140,140,70);
            login.setBackground(Color.BLACK);
            login.setForeground(Color.WHITE);
            login.addActionListener(this);
            add(login);
            
      
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/login.jpg"));
        Image i2=i1.getImage().getScaledInstance(650,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        //cahnge image
        image.setBounds(0,0,600,400);
        add(image); 
            setSize(600,450);
            setLocation(450,200);
            setVisible(true);
            
}
        
        
    
        public void  actionPerformed(ActionEvent ae)
        { 
            
            try{
                String username=tfusername.getText();
                String password=tfpassword.getText();
                cone c=new cone();
            String query = "select * from login where username= '"+username+"' and password = '"+password+"'";
            ResultSet rs=c.s.executeQuery(query);
         if(rs.next()){
                setVisible(false);
                new Home();
            }
            else
            {
                    JOptionPane.showMessageDialog(null,"Invalid user name and passsword");
            }
         
        }
            catch(Exception e){
                e.printStackTrace();
            }}
    public static void main (String args[])
        {
            new Login();
        }
}
