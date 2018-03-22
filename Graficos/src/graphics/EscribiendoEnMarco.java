package graphics;

import javax.swing.*;
import java.awt.*;
public class EscribiendoEnMarco {

    public static void main(String []args){
        MarcoConTexto mimarco = new MarcoConTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTexto extends JFrame{

    public MarcoConTexto(){
        this.setVisible(true);
        this.setSize(600,450);
        this.setLocation(400,200);
        this.setTitle("primer texto");
        Lamina milamina = new Lamina();
        this.add(milamina);
    }

    class Lamina extends JPanel{

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawString("Estamos Aprendiendo Swing",100,100);
        }
    }
}
