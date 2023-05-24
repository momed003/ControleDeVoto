
package model;

/**
 *
 * @author momed003
 */
public class Candidato {
    private String nome;
    private String bi;
    private Municipio municipio;

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

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
   
    
    public Candidato(String nome, String bi,Municipio m){
        this.nome=nome;
        this.bi=bi;
        municipio=m;
    }
    
}
