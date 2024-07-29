/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacrudproject;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Aayisha Rahmath
 */
public class DBconnection {
    
    public static Connection connect() throws SQLException{
       Connection conn = null;
       
        try {
            //run
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javacruddb","root","");
        } catch (ClassNotFoundException ex) {
            //solution
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return conn;
    }
}
