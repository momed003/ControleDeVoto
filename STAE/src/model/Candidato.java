
package model;

/**
 *
 * @author momed003
 */
public class Candidato {
    private int id;
    private int codigoMunicipio;
    private String nome;
    private String bi;
    private String historico;
        
   
    Municipio m=new Municipio();
    public Candidato(){
    
}

    
    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(int codigoMunicipio) {
        this.codigoMunicipio = m.getId();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getMunicipio() {
        return m.getProvincia();
    }


    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    } 
   
  
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
