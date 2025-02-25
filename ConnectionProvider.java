/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Project;
import java.sql.*;
/**
 *
 * @author USER
 */
public class ConnectionProvider {
    private static Connection con;
    public static Connection getCon()
    {
        try
        {
            if(con == null||con.isClosed())
            {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ collegemanagement","root","1234567890");
            System.out.println("Database connected successfully");
            }
          
        }
        catch(ClassNotFoundException e)
        {
            
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        }
        catch(SQLException e)
        {
            System.out.println("Database connection failed");
        }
        return con;
    }
    
}
