package edu.CECAR.presentacion;

import edu.CECAR.componentesReutilizables.CrearJframe;

/**
 *
 * @author:1103220136
 * @Fecha creacion:21/03/2017
 *
 */
public class  GUIEstudiante extends  CrearJframe{

    public GUIEstudiante() {
        super("Analisis y diseño",400,200);
        mostrarJFrame();
    }
   public static void main(String[] args) {
        new GUIEstudiante();
    }
    
}
