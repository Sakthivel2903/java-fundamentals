/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatask;

/**
 *
 * @author Sakthivel
 */
import java.sql.*;

public class DBConnect {
    public static void main(String args[]) {
        try {
            // Step 1: Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step 2: Create the connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/department", "root", "Sakthivel@2903");
            // Step 3: Create the statement object
            Statement stmt = con.createStatement();

            // Step 4: Execute query
            // Uncomment the appropriate line(s) based on the operation you want to perform

            // Creating a table
            // stmt.executeUpdate("create table employee (empid int, empname varchar(255))");

            // Inserting a record
            //stmt.executeUpdate("insert into dep_info values(3, 'CSE')");

            // Updating a record
            //stmt.executeUpdate("update employee set empname='Aravind' where empid=120");

            // Selecting records
            ResultSet rs = stmt.executeQuery("select * from dep_info");
             while(rs.next())
                 System.out.println(rs.getInt(1)+" "+rs.getString(2));
            // Deleting records
            stmt.executeUpdate("delete from dep_info where dep_code='3'");

            // Step 5: Close the connection object
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

