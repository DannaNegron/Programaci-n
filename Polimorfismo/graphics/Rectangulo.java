package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Héctor Quej Cosgaya
 * @author Jose Aguilar Canepa
 * 
 * Esta clase necesita de tu ayuda!
 */
public class Rectangulo extends FiguraGrafica {
   
    private int[] x = {50,85,85,50 };
    private int[] y = {50,50,65, 65};
    
    @Override
    public void dibujar(Graphics g) {
        g.drawPolygon(x, y, 4);    
    }

    @Override
    public void encojer(Graphics g) {
        x[1] += 5; y[2] -= 5;
        x[2] -= 5; y[3] -= 5;
        this.dibujar(g);    }

    @Override
    public void agrandar(Graphics g) {
        x[1] -= 5; y[2] += 5;
        x[2] += 5; y[3] += 5;
        this.dibujar(g);
    }

    @Override
    public void cambiarColor(Graphics g, Color c) {
        g.setColor(c);
        this.dibujar(g);
    }

    @Override
    public void mover(Graphics g, String direccion) {
        switch(direccion) {
             case "arriba" :
                for (int i = 0; i < y.length; i++) y[i] -= 5; 
                break;
            case "abajo" :
                for (int i = 0; i < y.length; i++) y[i] += 5; 
                break;
            case "izquierda" :
                for (int i = 0; i < x.length; i++) x[i] -= 5; 
                break;
            case "derecha" :
                for (int i = 0; i < x.length; i++) x[i] += 5; 
                break;
        }
        this.dibujar(g);
    }  
}
