/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.CECAR.app;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
String s = null;
    String a=null;
    int size = 0;
    ArrayList<String> Programasinstalados = new ArrayList<String>();
  try {
            
                        // Determinar en qué SO estamos
                        String so = System.getProperty("os.name");

                        String comando;

                        // Comando para Linux
                        if (so.equals("Linux"))
                                comando = "dpkg --get-selections";

                        // Comando para Windows
                        else{
                                
                         
                            comando = "cmd /c wmic product get name";
                        }
                        // Ejcutamos el comando
                        Process p = Runtime.getRuntime().exec(comando);

                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(
                                        p.getInputStream()));

                        BufferedReader stdError = new BufferedReader(new InputStreamReader(
                                        p.getErrorStream()));

                        // Leemos la salida del comando
                        //System.out.println("Ésta es la salida standard del comando:\n");
                        while ((s = stdInput.readLine()) != null) {
                          
                            Programasinstalados.add(s);
                        
                         
                            
                             size=Programasinstalados.size();
                        }
                            System.out.println(""+size);
                            for(int x=0;x<size;x++){
                      JOptionPane.showMessageDialog(null,""+Programasinstalados.get(x));
                            }
                        // Leemos los errores si los hubiera
                        
                        System.out.println("Ésta es la salida standard de error del comando (si la hay):\n");
                        while ((s = stdError.readLine()) != null) {
                     
                        }

                        System.exit(0);
                } catch (IOException e) {
                        System.out.println("Excepción: ");
                        e.printStackTrace();
                        System.exit(-1);
                }
    }
    
}
