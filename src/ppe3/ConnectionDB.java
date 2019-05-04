package ppe3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;



public class ConnectionDB {
   
    public static void main(String[] args){
     try{
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/suiss_visite","root","");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from users");
         while(rs.next()){
             System.out.println(rs.getString(1));
         }
         
         
     }catch(Exception e){
         System.out.println(e.getMessage());
     }
    }
}
