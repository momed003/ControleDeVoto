package connecion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectioFactory {
    public Connection getConnection(){
        try {
               return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/my_Taskmanagment","root","");
        
        } catch (SQLException e) {
            throw  new RuntimeException("404-data base not found"+e);
        }
    }
    
}
