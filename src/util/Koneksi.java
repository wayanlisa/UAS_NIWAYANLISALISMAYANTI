/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Koneksi {
    public Connection connect;
    public Statement state;
    public ResultSet res;
    String namaDatabase = "jdbc:mysql://localhost/db_uas_15311086";
    
    public void koneksiDatabase(){
        try {
            connect = DriverManager.getConnection(namaDatabase, "root","123");
            state = connect.createStatement();
        } catch (SQLException e) {
            System.err.println(""+e);
        }
    }
}
