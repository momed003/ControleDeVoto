/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ViewTeste extends JFrame{
    public  ViewTeste(){
         JFrame frame = new JFrame("Semaforo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Painel1 semaforo = new Painel1();
        semaforo.setCorVermelha(Color.RED);
        semaforo.setCorAmarela(Color.YELLOW);
        semaforo.setCorVerde(Color.GREEN);

        frame.add(semaforo);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
  
    public static void main(String[] args) {
       
    }
    
}
