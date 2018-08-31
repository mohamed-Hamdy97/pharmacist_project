
package javafxwithjdbc.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafxwithjdbc.model.User;


public class DBConnection {
    
    private static Connection con;
    //constructor
    private DBConnection(){   
    }
    //to get conection db
    public static Connection   getConnection(){
        if(con==null){
            try {
                //load driver
                Class.forName("com.mysql.jdbc.Driver");
                //conection
                con =DriverManager.getConnection("jdbc:mysql://localhost/MyUserDB","root","");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }
    
    public static void disconnect(){
        if(con!=null)
            con=null;
    }
    
   
    
    
    
//    //just for test connection
//    public static void main(String[] args) throws SQLException {
//        new DBConnection().getConnection();
//        Statement st;
//    
//    //insert new record
//    int n=43;
//        
//            st=getConnection().createStatement();
//            st.executeUpdate("delete from uers where age = "+n +" ");
//   }
    
}
