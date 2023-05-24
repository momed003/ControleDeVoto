
package connecion;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author momed003
 */
public class TesteConnectionFactory {
    public static void main(String[] args) {
        try {
            new ConnectioFactory().getConnection();
            JOptionPane.showMessageDialog(null, "conectado com sucesso", "STAE", 1);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "NAO foi possivel efectuar conexao", "STAE", 0);
        }
    }
}
