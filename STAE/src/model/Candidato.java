
package model;

/**
 *
 * @author momed003
 */
public class Candidato {
    
    private int codigoMunicipio,id;
    private String nome;
    private String bi;
    private String municipio, historico;

   
    Municipio m=new Municipio();
    public Candidato(){
    
}

    
    public int getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(int codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
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

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    } 
   
    
   /**
    *  public Candidato(String nome, String bi,Municipio m){
        this.nome=nome;
        this.bi=bi;
        municipio=municipio;
    }
    * @return 
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
