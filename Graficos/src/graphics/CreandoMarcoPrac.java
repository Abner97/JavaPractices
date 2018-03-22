package graphics;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class CreandoMarcoPrac {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String palabra="no hay palabra";
        Marco m = new Marco();
        Lienzo  l = new Lienzo(palabra);
        m.add(l);

        while(true){
            System.out.println("Ingrese Una palabra");
            palabra=sc.nextLine();
            l.cambiarPalabra(palabra);
            l.repaint();

        }

    }
}

class Marco extends JFrame{

    public Marco(){
        this.setBounds(2,3,1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class Lienzo extends JPanel{
    private String palabra;

    public Lienzo(String palabra){
        this.palabra=palabra;
    }

    public void cambiarPalabra(String palabra){
        this.palabra=palabra;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(palabra,100,100);
    }
}


