/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.DatabaseUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class UserDAO {

    
    public User getUserByID(String username ){
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs= null;
        User us = new User();
        try{
            String sSQL ="select * from users where username =?" ;
            conn = DatabaseUtils.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            rs = sttm.executeQuery();
            while (rs.next()){
                 us.setUsername(rs.getString(1));
                 us.setPassword(rs.getString(2));
                 us.setRole(rs.getBoolean(3));
                 return us;
            }
        }catch (Exception e){
            System.out.println("Error:"+e.toString());
        }finally{
            try{
                conn.close();
                rs.close();
                sttm.close();
            }catch(Exception e){
                
            }
        }
        return null;
    }
    public boolean checkLogin(String username, String pass){
      User user = getUserByID(username);
      if(user !=null){
          //user tồn tại
          if(user.getPassword().equals(pass)){
              return true;
          }
      }
        return false;
    }  
    

//    List<User> ls = new ArrayList<>();
    
//    public UserDAO() {
//        ls.add(new User("admin", "12345", true));
//        ls.add(new User("teo", "123", true));
//        ls.add(new User("namnv", "12345", true));
//        ls.add(new User("admin1", "12345", true));
//        ls.add(new User("admin2", "12345", true));
//    }
    
//        public boolean checkLogin(String username, String pass){
//        for (User u : ls){
//            if (u.getUsername().equals(username) && u.getPassword().equals(pass)){
//                 return true;
//            }
//        } 
//        return false;
//    } 
}
