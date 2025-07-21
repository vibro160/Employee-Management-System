package Employee.Management.System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {

   Connection connection;
 Statement statement;

 public connection(){
     try {
    Class.forName("com.mysql.cj.jdbc.Driver");
         connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","772004");
         statement= connection.createStatement();;
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
