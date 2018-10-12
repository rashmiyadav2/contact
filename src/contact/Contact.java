/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contact;

import java.sql.*;
public class Contact {

   
    public static void main(String[] args) {
        
        try
   {
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","");
String sql="select * from list";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(sql);
while(rs.next())
   
System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getDouble(4));
   
  }catch(Exception e){ System.out.println(e);} 
    }
        
    }
    

