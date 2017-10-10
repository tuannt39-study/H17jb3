/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.h17jb3.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author haopv
 */
public class MySqlConn {
    public static Connection getMySQLConnection() throws ClassNotFoundException, SQLException{
        String hostName = "localhost";
        String dbNmae = "edu_java";
        String userCon = "root";
        String passCon = "";
        return getMySQLConnection(hostName,dbNmae,userCon,passCon);
    }
    
    public static Connection getMySQLConnection(String hostName, String dbNmae,String userCon,String passCon) throws ClassNotFoundException, SQLException{

        Class.forName("com.mysql.jdbc.Driver");
        String conURL = "jdbc:mysql://"+hostName+":3306/"+dbNmae;
        return DriverManager.getConnection(conURL,userCon,passCon);
    }
    
    public static void main(String[] args) {
   MySqlConn connect = new MySqlConn();
        try {
            
            
            connect.getMySQLConnection();
            System.out.println("Keets noi thanh cong.");
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySqlConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MySqlConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception exD){
            exD.printStackTrace();
        }
}
    
}
