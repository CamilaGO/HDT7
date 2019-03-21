/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 22 de Marzo de 2019  -  Algoritmos y Estructuras UVG
 * Este programa implementa un diccionario Ingles-Español con el contenido de un .txt
 * que presenta asociaciones de los significados y se forma un BST. 
 * Tambien se traduce un .txt al español y si la palabra no esta en diccionario, la palabra en ingles se marca
 */
package hdt7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Camila y Maria
 */
public class HDT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES Y OBJETOS
        ArrayList arr = new ArrayList();
        String linea = "";
        String str= "                      "; 
        int num = 0;
        int char_a_string;
        
        //SE LEE EL ARCHIVO
        try {
            FileReader lector = new FileReader("diccionario.txt");
            BufferedReader buff = new BufferedReader(lector);
            while ((linea = buff.readLine()) != null){




            }
            buff.close();
        }catch (IOException ex){ 
        
        }
      
    }
    
}
