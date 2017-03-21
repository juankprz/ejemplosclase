package edu.CECAR.componentesReutilizables;

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
    public CrearJframe() {
      this("", 800,600);
    }
     public CrearJframe(String titulo) {
       
        this(titulo,800,600);
       
    }
     public CrearJframe(String titulo,int ancho, int alto) {
       JFrame frame = new JFrame(titulo); 
       frame.setSize(800,600);
       frame.setLocationRelativeTo(null);
       frame.setLayout(null);
       
    }

}
