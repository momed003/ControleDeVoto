/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;

/**
 *
 * @author user
 */
public class Painel1 extends Panel{
    
    public Painel1() {
		this.setBackground(Color.white);
	}
	
private Color corVermelha = Color.RED;
    private Color corAmarela = Color.YELLOW;
    private Color corVerde = Color.GREEN;
    private int espacamento = 20; // Espaçamento entre os semáforos

    public void setCorVermelha(Color corVermelha) {
        this.corVermelha = corVermelha;
    }

    public void setCorAmarela(Color corAmarela) {
        this.corAmarela = corAmarela;
    }

    public void setCorVerde(Color corVerde) {
        this.corVerde = corVerde;
    }

    
    protected void paintComponent(Graphics g) {
        super.paint(g);

        int largura = getWidth();
        int altura = getHeight();

        // Calcula o espaço disponível para cada semáforo
        int tamanhoCirculo = (altura - 3 * espacamento) / 3;
        int margem = (largura - tamanhoCirculo) / 2;

        // Desenha o fundo branco
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, largura, altura);

        // Desenha o retângulo
        g.setColor(Color.BLACK);
        g.drawRect(margem - 10, 0, tamanhoCirculo + 20, 3 * tamanhoCirculo + 3 * espacamento);

        // Desenha os círculos do semáforo
        int y = espacamento;

        g.setColor(corVermelha);
        g.fillOval(margem, y, tamanhoCirculo, tamanhoCirculo);
        y += tamanhoCirculo + espacamento;

        g.setColor(corAmarela);
        g.fillOval(margem, y, tamanhoCirculo, tamanhoCirculo);
        y += tamanhoCirculo + espacamento;

        g.setColor(corVerde);
        g.fillOval(margem, y, tamanhoCirculo, tamanhoCirculo);
    }
}
