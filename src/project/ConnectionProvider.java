/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
/**
 *
 * @author Jaswanthsai
 */
public class ConnectionProvider {
    public static Connection geCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gma","root","jaffu1410");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
    }

}
