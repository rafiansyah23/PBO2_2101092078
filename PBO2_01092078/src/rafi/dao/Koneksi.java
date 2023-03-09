/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class Koneksi {
    private String url = "jdbc:mysql://localhost/PBO2_2101092078";
    private String username = "root";
    private String password ="";
    
    public Connection getKoneksi() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
    
}
