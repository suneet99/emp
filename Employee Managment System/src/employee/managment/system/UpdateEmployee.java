
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
public class UpdateEmployee extends JFrame implements ActionListener{

    JTextField tffname,tfeducation,tfemail,tfaddress,tfphone,tfdesignation,tfsalary;
   
    JButton add,back;
    String empId;
   
    JLabel lblempid,lblempID;
    UpdateEmployee(String empId){
        this.empId=empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel heading =new JLabel("Update Employee Details");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        
        
       
        
        add(heading);
        JLabel name=new JLabel("Name");
        name.setBounds(90,150,150,30);
        name.setFont(new Font("serif",Font.BOLD,20));
        add(name); 
           JLabel lblname=new JLabel();
        lblname.setBounds(200,150,150,30);
        add(lblname);

        
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
       JLabel lbeldob = new JLabel();
        lbeldob.setBounds(200,200,150,30);
        add(lbeldob);
        
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
      tfeducation = new JTextField();
       tfeducation.setBackground(Color.WHITE);
       
       tfeducation.setBounds(550,300,150,30);
       add(tfeducation);
       
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
       JLabel lbelaadhar=new JLabel();
        lbelaadhar.setBounds(550,350,150,30);
        add(lbelaadhar);
          lblempid=new JLabel("EmployeeID");
        lblempid.setBounds(90,400,150,30);
        lblempid.setFont(new Font("serif",Font.BOLD,20));
        add(lblempid); 
        lblempID=new JLabel();
        lblempID.setBounds(200,400,150,30);
        lblempID.setFont(new Font("serif",Font.BOLD,20));
        add(lblempID); 
        try{
        cone c=new cone();
        String query="select * from employee where empId='"+empId+"'";
        ResultSet rs=c.s.executeQuery(query);
        while(rs.next()){
            lblname.setText(rs.getString("name"));
            tffname.setText(rs.getString("fname"));
            lbeldob.setText(rs.getString("dob"));
            tfaddress.setText(rs.getString("address"));
            tfsalary.setText(rs.getString("salary"));
            tfphone.setText(rs.getString("phone"));
            tfemail.setText(rs.getString("email"));
            tfeducation.setText(rs.getString("education"));
            tfdesignation.setText(rs.getString("designation"));
            lbelaadhar.setText(rs.getString("aadhar"));
            lblempID.setText(rs.getString("empId"));
                 

        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        add= new JButton("Update Details");
        add.setBounds(250,550,150,40);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        
       add.addActionListener(this);
       add(add);
         back= new JButton("BACK");
        back.setBounds(450,550,150,40);
          back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/update.jpg"));
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
         if (ae.getSource()==add){
          
             String fname=tffname.getText();
            
             String salary=tfsalary.getText();
             String address=tfaddress.getText();
             String phone=tfphone.getText();
             String email=tfemail.getText();
             String education=(String)tfeducation.getText();
             String designation=tfdesignation.getText();
        
         
             try{
                 cone conn =new cone();
                 String query="update employee set fname='"+fname+"',salary='"+salary+"',address='"+address+"',phone='"+phone+"',email='"+email+"',education='"+education+"',designation='"+designation+"' where empId='"+empId+"'";
                 
                 conn.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Details updated successfully");
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
        new UpdateEmployee("");
    }
    
}
