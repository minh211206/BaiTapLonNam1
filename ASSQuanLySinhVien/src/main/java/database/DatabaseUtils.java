/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DatabaseUtils {

    private static final String URL = "jdbc:mysql://localhost:3306/db_ass_sinhvien";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getDBConnect(){
        try{
            Connection con = null;
            con = DriverManager.getConnection(URL,USER,PASSWORD);
            return con;
        }catch (SQLException ex){
            // loi ket noi
            System.out.println("Error:"+ex.toString());
        }
        return null;
    }
}
