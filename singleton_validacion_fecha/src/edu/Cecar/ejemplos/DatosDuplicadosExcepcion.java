/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.Cecar.ejemplos;

/**
 *
 * @author 1103220136
 */
public final class DatosDuplicadosExcepcion extends Exception {

    public DatosDuplicadosExcepcion() {
        super("Dato Duplicado en Array");
    }
 public DatosDuplicadosExcepcion(String dato) {
        super("Dato"+dato+" Duplicado en Array");
    }

 
   
}
