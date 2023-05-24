/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author momed003
 */
public class Municipio {
    private String descricao;
    private String Provincia;
    private int qtdRecenssiados;

    @Override
    public String toString() {
        return "Municipio{" + "descricao=" + descricao
                + ", Provincia=" + Provincia 
                + ", qtdRecenssiados=" + qtdRecenssiados + '}';
    }
    
    public Municipio(String descricao,String provincia, int qtd){
        this.descricao=descricao;
        this.Provincia=provincia;
        qtdRecenssiados=qtd;
    }
    
    public Municipio(){}
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public int getQtdRecenssiados() {
        return qtdRecenssiados;
    }

    public void setQtdRecenssiados(int qtdRecenssiados) {
        this.qtdRecenssiados = qtdRecenssiados;
    }
    
    
}
