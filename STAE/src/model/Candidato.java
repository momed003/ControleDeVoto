
package model;

import java.util.ArrayList;

/**
 *
 * @author momed003
 */
public class Candidato {
       private String nome;
    private String bi;
    private String historico;
    private String CodigoMunicipio;
    private String municipio;
    private ArrayList<Voto> votos;
    
    public Candidato(){
        
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    

    public Candidato(String nome, String bi, String historico, String municipio_id) {
        this.nome = nome;
        this.bi = bi;
        this.historico = historico;
        this.CodigoMunicipio = municipio_id;
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

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getCodigoMunicipio() {
        return CodigoMunicipio;
    }

    public void setCodigoMunicipio(String CodigoMunicipio) {
        this.CodigoMunicipio = CodigoMunicipio;
    }

    public ArrayList<Voto> getVotos() {
        return votos;
    }

    public void setVotos(ArrayList<Voto> votos) {
        this.votos = votos;
    }
}
