/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.managment.system;
import java.sql.*;

public class cone {
    Connection c;
    Statement s;
    
 public cone(){
     
     try{
       Class.forName("com.mysql.cj.jdbc.Driver");  
       c=DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagementSystem","root","Suneet@123");
       s=c.createStatement();
     /* String url="jdbc:mysql://localhost:3306/db1";
       String username="root";
       String password="Suneet@123";
      // s=c.createStatement();/*
     Connection con =DriverManager.getConnection(url,username,password);
        if (con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else
			{
				System.out.println("Connection is created");
			}
       */
               
       
     }catch(Exception e){
         e.printStackTrace();
     }	
 }   
 public static void main(String args[]){
     new cone();
     
 }
}
