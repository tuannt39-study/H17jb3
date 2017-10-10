/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.hackademic.h17jb3.jdbc;

import java.sql.*;
import java.sql.SQLException;


/**
 *
 * @author haopv
 */
public class VnHackademicH17jb3Jdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        //runStatement();
        //runInsert();
        //runPrepareStatement();
        runTransactoin();
        
    }
    
    public static void runStatement() throws ClassNotFoundException, SQLException{
        
        // tao connection
        Connection connection = MySqlConn.getMySQLConnection();
        // tao statement
        Statement statement = connection.createStatement();
        
        // query
        String sql = " select * from demo where id <4";
        
        // thuc thi cau lenh
        ResultSet rs = statement.executeQuery(sql);
        
        /*
        rs.first();
        
        System.out.println("id: "+ rs.getInt(1));
        System.out.println("Name: "+ rs.getString(2));
        System.out.println("Ma: "+ rs.getString(3));
        System.out.println("-----------------------");
        
        
        if(rs.relative(3)){
            if(rs.absolute(3)){
                System.out.println("id: "+ rs.getInt(1));
                System.out.println("Name: "+ rs.getString(2));
                System.out.println("Ma: "+ rs.getString(3));
            }
        }
        */
        
        while (rs.next()){
            System.out.println("id: "+ rs.getInt(1));
            System.out.println("Name: "+ rs.getString(2));
            System.out.println("Ma: "+ rs.getString(3));
            System.out.println("-----------------------");
        }
        
        // clean
        rs.close();
        statement.close();
        connection.close();
        
    }
    
    public static void runInsert() throws ClassNotFoundException, SQLException{
        
        // tao connection
        Connection connection = MySqlConn.getMySQLConnection();
        // tao statement
        Statement statement = connection.createStatement();
        
        // query
        String sql = "INSERT into demo (id,name, ma) value(5,\"ten 5\",\"NV05\")";
        
        // thuc thi cau lenh
        statement.executeUpdate(sql);
        
        System.out.println("insert ok");
        
        // clean
        statement.close();
        connection.close();
        
    }
    
    public static void runPrepareStatement() throws ClassNotFoundException, SQLException{
        
        // tao connection
        Connection connection = MySqlConn.getMySQLConnection();
        // query
        String sql = " select * from demo where id < ? and ma like ?";
        
        // tao statement
        PreparedStatement statement = connection.prepareStatement(sql);
        
        statement.setInt(1, 4);
        statement.setString(2, "NV03");
        // thuc thi cau lenh
        ResultSet rs = statement.executeQuery();
        
        while (rs.next()){
            System.out.println("id: "+ rs.getInt(1));
            System.out.println("Name: "+ rs.getString(2));
            System.out.println("Ma: "+ rs.getString(3));
            System.out.println("-----------------------");
        }
        
        // clean
        rs.close();
        statement.close();
        connection.close();
        
    }
    
    
    public static void runTransactoin() throws ClassNotFoundException, SQLException{
        Connection connection = null;
        try{
        // tao connection
        connection = MySqlConn.getMySQLConnection();
        // tao statement
        Statement statement = connection.createStatement();
                
        // thieets laapj tu dong commit
        connection.setAutoCommit(false);
        // query
        String sql = "INSERT into demo (id,name, ma) value(6,\"ten 6\",\"NV06\")";
        
        // thuc thi cau lenh
        statement.executeUpdate(sql);
        
        
        String sql2 = "INSERT into demo (id,name, ma) value(7,\"ten 7\",\"NV07\")";
        
        // thuc thi cau lenh
        statement.executeUpdate(sql2);
        
        connection.rollback();
        
        connection.commit();
        
        System.out.println("insert ok");
        
        // clean
        statement.close();
        connection.close();
        }
        catch (SQLException ex){
            connection.rollback();
        }
    }
    
}
