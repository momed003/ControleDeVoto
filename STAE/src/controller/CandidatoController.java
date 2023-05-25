
package controller;


import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdbc.ConexaoJDBC;
import model.Candidato;

/**
 *
 * @author momed003
 */
public class CandidatoController {

    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Candidato>lista;
  
    
    public void salvar(Candidato objC){
        String sql="INSERT INTO candidato ( nome, bi, historico, codigo) VALUES"
                + " (?,?,?,?)";
        
        try {
            con=new ConexaoJDBC().getConnection();
            pstm=(PreparedStatement) con.prepareStatement(sql);
            
            pstm.setString(1, objC.getNome());
            pstm.setString(2, objC.getBi());
            pstm.setString(3, objC.getHistorico());
            pstm.setInt(4, objC.getCodigoMunicipio());
            
            pstm.execute();
            pstm.close();
              JOptionPane.showMessageDialog(null, "Cadastrado", "stae", 1);
          
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "candidato Controller: "+ex, "stae", 0);
        }
    }
   
    public ArrayList<Candidato> pesquisarCandidato(){
        String sql="SELECT * FROM candidato";
        
        try {
            con=new ConexaoJDBC().getConnection();
           pstm=(PreparedStatement) con.prepareStatement(sql);//prepara conexao
           rs=pstm.executeQuery();//traz as inf da bd
           
           while (rs.next()){//se tiver mais de uma linha na bd continua aqui
               Candidato obj=new Candidato();
               obj.setId(rs.getInt("id"));
               obj.setNome(rs.getString("nome"));
               obj.setBi(rs.getString("bi"));
               obj.setHistorico(rs.getString("historico"));
               obj.setCodigoMunicipio(rs.getInt("codigo"));
               lista.add(obj);
           }
        } catch (SQLException | ClassNotFoundException e) {
         JOptionPane.showMessageDialog(null, "candidato Controller: "+e, "stae", 0);
        }
        return lista;
    }

}
