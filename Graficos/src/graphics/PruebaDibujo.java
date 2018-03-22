package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PruebaDibujo {

    public static void main(String[]args){
        MarcoConDibujos mimarco = new MarcoConDibujos();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaConFiguras milamina = new LaminaConFiguras();
        mimarco.add(milamina);
        /*for(int i = 50;i<=1000;i++){
            milamina.mover(i);
            milamina.repaint();
            try{
                Thread.sleep(5);
            } catch(InterruptedException e ){

            }
        }*/
    }
}

class MarcoConDibujos extends JFrame{
    public MarcoConDibujos(){
        this.setTitle("prueba de Dibujo");
        this.setSize(400,400);
        this.setExtendedState(MAXIMIZED_BOTH);



    }
}

class LaminaConFiguras extends JPanel{
    private int y2=200;

    public void mover(int y2){
        this.y2=y2;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
       // g.drawRect(50,y2,200,200);
        //g.drawLine(100,100,300,y2);
        Graphics2D g2 =(Graphics2D)g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100,100,300,250));

        double CentroenX=rectangulo.getCenterX();
        double CentroenY=rectangulo.getCenterY();
        double radio=150;

        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroenX,CentroenY,(CentroenX+radio),(CentroenY+radio));

        g2.draw(circulo);

    }
}
