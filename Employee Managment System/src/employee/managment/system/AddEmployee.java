/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

/**
 *
 * @author Suneet
 */
public class AddEmployee extends JFrame implements ActionListener{
    Random ran=new Random();
    int number =ran.nextInt(999999);
    JTextField tfname,tffname,tfemail,tfaddress,tfaadhar,tfphone,tfdesignation,tfsalary;
     JComboBox cbeducation;
    JButton add,back;
    JDateChooser dcdob;
    JLabel lblempid,lblempID;
    AddEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading =new JLabel("Add Employee Detail");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        
        
       
        
        add(heading);
        
        JLabel name=new JLabel("Name");
        name.setBounds(90,150,150,30);
        name.setFont(new Font("serif",Font.BOLD,20));
        add(name); 
         tfname=new JTextField();
        tfname.setBounds(200,150,150,30);
        add(tfname);

        
        JLabel fname=new JLabel("Father name");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("serif",Font.BOLD,20));
        add(fname); 
         tffname=new JTextField();
        tffname.setBounds(550,150,150,30);
        add(tffname);
        
       
        JLabel lbldob=new JLabel("Date of Birth");
        lbldob.setBounds(90,200,150,30);
        lbldob.setFont(new Font("serif",Font.BOLD,20));
        add(lbldob); 
         dcdob =new JDateChooser();
        dcdob.setBounds(200,200,150,30);
        add(dcdob);
        
        JLabel labelsalary=new JLabel("Salary");
        labelsalary.setBounds(400,200,150,30);
        labelsalary.setFont(new Font("serif",Font.BOLD,20));
        add(labelsalary); 
         tfsalary=new JTextField();
        tfsalary.setBounds(550,200,150,30);
        add(tfsalary);
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(90,250,150,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,20));
        add(lbladdress); 
         tfaddress=new JTextField();
        tfaddress.setBounds(200,250,150,30);
        add(tfaddress);
        
        JLabel lblphone=new JLabel("Mobile Number");
        lblphone.setBounds(400,250,150,30);
        lblphone.setFont(new Font("serif",Font.BOLD,20));
        add(lblphone); 
         tfphone=new JTextField();
        tfphone.setBounds(550,250,150,30);
        add(tfphone);
        
        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(90,300,150,30);
        lblemail.setFont(new Font("serif",Font.BOLD,20));
        add(lblemail); 
         tfemail=new JTextField();
        tfemail.setBounds(200,300,150,30);
        add(tfemail);
        
         JLabel lbleducation=new JLabel("Education");
        lbleducation.setBounds(400,300,150,30);
        lbleducation.setFont(new Font("serif",Font.BOLD,20));
        add(lbleducation); 
        String courses[]={"SELECT","BBA","BCA","MBA","MCA","BSc","BSc(CS)","MA","BA","B.TECH","M.TECH","MSc","other"};
      cbeducation=new JComboBox(courses);
       cbeducation.setBackground(Color.WHITE);
       
       cbeducation.setBounds(550,300,150,30);
       add(cbeducation);
       
       JLabel lbldesignation=new JLabel("Designation");
       lbldesignation.setBounds(90,350,150,30);
        lbldesignation.setFont(new Font("serif",Font.BOLD,20));
        add(lbldesignation); 
         tfdesignation=new JTextField();
        tfdesignation.setBounds(200,350,150,30);
        add(tfdesignation);
        
        JLabel lblaadhar=new JLabel("Aadhar");
        lblaadhar.setBounds(400,350,150,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,20));
        add(lblaadhar); 
        tfaadhar=new JTextField();
        tfaadhar.setBounds(550,350,150,30);
        add(tfaadhar);
          lblempid=new JLabel("EmployeeID");
        lblempid.setBounds(90,400,150,30);
        lblempid.setFont(new Font("serif",Font.BOLD,20));
        add(lblempid); 
            lblempID=new JLabel("" + number);
        lblempID.setBounds(200,400,150,30);
        lblempID.setFont(new Font("serif",Font.BOLD,20));
        add(lblempID); 
        add= new JButton("ADD");
        add.setBounds(250,550,150,40);
        add.setBackground(Color.gray);
        add.setForeground(Color.BLUE);
        
       add.addActionListener(this);
       add(add);
         back= new JButton("BACK");
        back.setBounds(450,550,150,40);
          back.setBackground(Color.gray);
        back.setForeground(Color.BLUE);
        back.addActionListener(this);
        add(back);
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/addemp.jpg"));
        Image i2=i1.getImage().getScaledInstance(1110,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image); 
        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
        
    }
    
   
       
        
    public void actionPerformed(ActionEvent ae){
         if (ae.getSource()==add )
             
         
         {
             String name= tfname.getText();
             String fname=tffname.getText();
             String dob=((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
             String salary=tfsalary.getText();
             String address=tfaddress.getText();
             String phone=tfphone.getText();
             String email=tfemail.getText();
             String education=(String)cbeducation.getSelectedItem();
             String designation=tfdesignation.getText();
             String aadhar=tfaadhar.getText();
             String empId=lblempID.getText() ;
             try{
                  
                 cone conn =new cone();
                 String query="insert into employee values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+aadhar+"','"+empId+"')";
                 conn.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Details added successfully");
                 setVisible(false);
                 new Home();
             }catch(Exception e){
                 e.printStackTrace();
             }
             
             
             
        }else
        {   
            setVisible(false);
            new Home();
        }
    }
        

    public static void main (String args[])
    {
        new AddEmployee();
    }
    
}
