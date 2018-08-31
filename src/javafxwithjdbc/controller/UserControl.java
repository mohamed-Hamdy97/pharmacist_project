
package javafxwithjdbc.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafxwithjdbc.model.User;

public class UserControl {   //this class do insert ,update ,search,delete,getAllusers
    //statement for run sql
    Statement st;
    
    //insert new record
    public void insert(User user){
        try {
            st=DBConnection.getConnection().createStatement();
            st.executeUpdate("insert into uers (name,age,year) values ('"+user.getName()+"','"+user.getAge()+"','"+user.getYear()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //update new record
    public void update(User user){
        try {
            st=DBConnection.getConnection().createStatement();
            st.executeUpdate("update uers set name= '"+user.getName()+"',age = '"+user.getAge()+"', year = '"+user.getYear()+"' where id ="+user.getId()+"");
        } catch (SQLException ex) {
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //delete record
    public void delete(int id){
        try {
            st=DBConnection.getConnection().createStatement();
            st.executeUpdate("delete from uers where id="+id+"");
        } catch (SQLException ex) {
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
     //search by name  
    public ObservableList<User> search(String name){
        ObservableList<User> users=FXCollections.observableArrayList();
        try {
            st=DBConnection.getConnection().createStatement();
            ResultSet resultSet=st.executeQuery("select * from uers where name like '%"+name+"%'");
            //to point start table
            resultSet.beforeFirst();
            
            while(resultSet.next()){
                User user=new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setAge(resultSet.getString(3));
                user.setYear(resultSet.getString(4));
                users.add(user);
                //System.out.println(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
       
    
    //search by name  
    public ObservableList<User> getAllUsers(){
        ObservableList<User> users=FXCollections.observableArrayList();
        try {
            st=DBConnection.getConnection().createStatement();
            ResultSet resultSet=st.executeQuery("select * from uers");
            //to point start table
            resultSet.beforeFirst();
            
            while(resultSet.next()){
                User user=new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setAge(resultSet.getString(3));
                user.setYear(resultSet.getString(4));
                users.add(user);
                //System.out.println(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    
    /*just for testing
    public static void main(String[] args) {
       
        new UserControl().getAllUsers();
    }
    */
}
