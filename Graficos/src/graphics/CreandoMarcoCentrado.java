package graphics;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {

    public static void main(String[]args){
        MarcoCentrado m = new MarcoCentrado();
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setVisible(true);
    }
}

class MarcoCentrado extends JFrame{

    public MarcoCentrado() {

        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        mipantalla.beep();
        Dimension tamanoPantalla =mipantalla.getScreenSize();
        int ancho,alto;

        ancho = tamanoPantalla.width;
        alto =  tamanoPantalla.height;

        this.setSize(ancho/2,alto/2);
        this.setLocation(ancho/4,alto/4);
        this.setTitle("Marco Centrado");
        Image icono = mipantalla.getImage("src/graphics/mushroom.png");//icono
        this.setIconImage(icono);

    }
}
