/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.*;
/**
 *
 * @author ACER
 */
public class DBHelper {
    private Connection conn;
    String dbUrl = "jdbc:derby://localhost:1527/demo";
    String user = "";
    String password = "";
    
    public Connection connection(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            System.out.println("Bağlantı başarılı");
            conn = DriverManager.getConnection(dbUrl,user,password);
            
        } catch (Exception e) {
            System.out.println("Bağlantıda bir sorun var!");
        }
        return conn;
    }
    
}
