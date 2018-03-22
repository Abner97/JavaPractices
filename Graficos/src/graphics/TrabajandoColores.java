package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class TrabajandoColores {

    public static void main(String []args){

        MarcoConColor mimarco=new MarcoConColor();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}


class MarcoConColor extends JFrame{

    public MarcoConColor(){

        this.setTitle("Prueba con color");
        this.setSize(400,400);
        LaminaConColor milamina = new LaminaConColor();
        add(milamina);
        milamina.setBackground(SystemColor.window);

    }


    class LaminaConColor extends JPanel{

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
            g2.setPaint(Color.RED);
            g2.fill(rectangulo);
            Ellipse2D elipse = new Ellipse2D.Double();
            elipse.setFrame(rectangulo);
            g2.setPaint(new Color(194, 0, 255));
            g2.fill(elipse);

        }
    }
}


