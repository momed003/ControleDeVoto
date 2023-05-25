
package jdbc;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class TestarJDBC {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            new ConexaoJDBC().getConnection();
            JOptionPane.showMessageDialog(null, "conectado com sucesso!", "STAE", 1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "404- data base not found"+e, "STAE", 0);
        }
    }
}
