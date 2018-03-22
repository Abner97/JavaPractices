package graphics;

import javax.swing.*;
import java.awt.GraphicsEnvironment;

import java.awt.*;

public class Pruebass {

    public static void main(String []args){

        String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        String fuente = JOptionPane.showInputDialog("Introduce Fuente");
        boolean estalafuente = false;

        for(String nombredelafuente: nombresDeFuentes){
          if(nombredelafuente.equals(fuente)){

              estalafuente=true;
          }
        }

        if(estalafuente){
            System.out.println("Fuente instalada");
        }else{
            System.out.println("No esta instalada la fuente");
        }
    }

}
