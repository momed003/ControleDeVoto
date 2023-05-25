
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJDBC {
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        
        try{
        String driveName = "com.mysql.jdbc.Driver";
            Class.forName(driveName);

            String serverName = "localhost";
            String mydatabase = "municipios";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String UserName = "root";
            String pass = "";
            
            return DriverManager.getConnection(url, UserName, pass);
            
            
        } catch (ClassNotFoundException e) {
            System.out.println("drive nao encontrado: " + e);
            return null;

        } catch (SQLException e) {
            System.out.println("nao foi possivel conectar a base de dados" + e);
            return null;
        }
            

    }
    
}
