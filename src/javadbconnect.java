


import java.sql.*;
import javax.swing.JOptionPane;

public class javadbconnect {
  Connection conn=null;
    
    public static Connection ConnecrDB(){
    try{
      Class.forName("org.sqlite.JDBC");
      Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\katherine\\Documents\\NetBeansProjects\\atmforDefense\\ATM.sqlite");
      return conn;
            
    }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
     }
     return null;
   }
    
}    