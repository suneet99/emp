/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RemoveEmployee extends JFrame implements ActionListener{
    Choice cempid;
    JButton Delete,Back;
    RemoveEmployee(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        JLabel labelempid=new JLabel("Emoloyee ID");
        labelempid.setBounds(50,50,100,30);
        add(labelempid);
        cempid=new Choice();
        cempid.setBounds(200,50,150,30);
        add(cempid);
            try{
            cone c =new cone();
            String query="select * from employee";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next())
            {
                cempid.add(rs.getString("empid"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
            JLabel labelname=new JLabel("Name");
        labelname.setBounds(50,100,100,30);
        add(labelname);
        JLabel lblname=new JLabel();
        lblname.setBounds(200,100,100,30);
        add(lblname);
         JLabel lbldob=new JLabel("DoB");
        lbldob.setBounds(50,150,100,30);
        add(lbldob);
         JLabel labeldob=new JLabel();
        labeldob.setBounds(200,150,100,30);
        add(labeldob);
        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(50,200,100,30);
        add(lblphone);
        JLabel labelphone=new JLabel();
        labelphone.setBounds(200,200,100,30);
        add(labelphone);
         JLabel labelfname=new JLabel("FName");
        labelfname.setBounds(50,250,100,30);
        add(labelfname);
        JLabel lblfname=new JLabel();
        lblfname.setBounds(200,250,100,30);
        add(lblfname);
        try{
            cone c =new cone();
            String query="select * from employee where empid='"+cempid.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next())
            {lblname.setText(rs.getString("name"));
            labeldob.setText(rs.getString("dob"));
            labelphone.setText(rs.getString("phone"));
            lblfname.setText(rs.getString("fname"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
       cempid.addItemListener(new ItemListener() {
           public void itemStateChanged(ItemEvent ie){
                  try{
            cone c =new cone();
            String query="select * from employee where empid='"+cempid.getSelectedItem()+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next())
            {lblname.setText(rs.getString("name"));
            labeldob.setText(rs.getString("dob"));
            labelphone.setText(rs.getString("phone"));
            lblfname.setText(rs.getString("fname"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
               
               
           }
       });
       Delete =new JButton("Delete");
       Delete.setBounds(80,300,100,30);
       Delete.setForeground(Color.WHITE);
      Delete.setBackground(Color.BLACK);
      Delete.addActionListener(this);
             add(Delete);
             
       Back =new JButton("Back");
       Back.setBounds(220,300,100,30);
       Back.setForeground(Color.WHITE);
      Back.setBackground(Color.BLACK);
      Back.addActionListener(this);
             add(Back);      
 ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/deelt.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,600,500);
        add(image); 

      
        setSize(600,500);
        setLocation(350,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==Delete){
            try{
                cone c=new cone();
                String query="delete from employee where empId='"+cempid.getSelectedItem()+"'";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Employee Information delted succesfully");
            setVisible(false);
            new Home();
            
                
            }
            catch(Exception e){
                e.printStackTrace();
        }}
        else{
            setVisible(false);
            new Home();
        }
    }
    public static void main (String args[]){
       new RemoveEmployee();
    }
    
}
