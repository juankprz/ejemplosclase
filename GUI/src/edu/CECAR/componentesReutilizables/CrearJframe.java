package edu.CECAR.componentesReutilizables;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author:1103220136
 * @Fecha creacion:21/03/2017
 *
 */
public abstract class CrearJframe {
    /**
     * Metodo que define la GUI estandar de mi empresa 
     */
    private  JFrame frame;
    public CrearJframe() {
      this("", 800,600);
    }
     public CrearJframe(String titulo) {
       
        this(titulo,800,600);
       
    }
     public CrearJframe(String titulo,int ancho, int alto) {
       frame = new JFrame(titulo); 
       frame.setSize(ancho,alto);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setBackground(Color.cyan);
       frame.setLayout(null);
       
    }
     public void mostrarJFrame(){
       frame.setVisible(true);
     }
    
    

}
