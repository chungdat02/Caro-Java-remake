/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class DAO {
    protected Connection con;

    public DAO() {
        String jdbcURL = "jdbc:mysql://localhost:3306/dbcaro";
        String jdbcUsername = "root";
        String jdbcPassword = ""; //please change information to connect to DB
        try {
    con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
} catch (SQLException e) {
    e.printStackTrace();
    System.out.println("Connection to database failed");
}
    }
    
}