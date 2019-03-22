/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 22 de Marzo de 2019  -  Algoritmos y Estructuras UVG
 * Este programa implementa un diccionario Ingles-Español con el contenido de un .txt
 * que presenta asociaciones de los significados y se forma un BST. 
 * Tambien se traduce un .txt al español y si la palabra no esta en diccionario, la palabra en ingles se marca
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Camila.Maria
 */
public class HDT7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VARIABLES Y OBJETOS
        ArrayList arr = new ArrayList();
        ArrayList<String> a = new ArrayList<>(), b = new ArrayList<>();
        String linea = "";
        String str= "                      "; 
        Diccionario dicc;
        int num = 1;
        ArrayList<Association<String, String>> arrayAs = new ArrayList<>();
      
        //, Dog,Homework,Woman, Town, Yes; 
        BinaryTree<Association> diccP = new BinaryTree<>();
        BinaryTree<Association> diccS = new BinaryTree<>();
        int char_a_string;
        
        //SE LEE EL ARCHIVO
        try {
            FileReader lector = new FileReader("diccionario.txt");
            BufferedReader buff = new BufferedReader(lector);
            while ((linea = buff.readLine()) != null){
            
            arr.add(linea);
            //split de cada linea
                String [] p1=linea.split(",");
                //para quitar paréntesis
                String in=p1[0];
                in = in.replace("(","");
                String es=p1[1];
                es = es.replace(")","");
                a.add(in);
                b.add(es);
                Association h=new Association (in, es);
                arrayAs.add(h);
            }
            buff.close();
        }catch (IOException ex){ 
            System.out.println("ERROR");
        }
        
        dicc = new Diccionario(arrayAs);
        //SE LEE ARCHIVO A TRADUCIR
        try {
            FileReader lect = new FileReader("texto.txt");
            BufferedReader bf = new BufferedReader(lect);
            String concatenador = "";
            while ((linea = bf.readLine()) != null){
           
            //split de cada linea
                String [] texto =linea.split(" ");
                for(int n=0;n<texto.length;n++){
                    String palabra = texto[n];
                    String trd = dicc.traduccion(dicc.getRaiz(), palabra);
                    concatenador += " " + trd + " ";
                }
                System.out.print("\n"+concatenador);
            }
            bf.close();
        }catch (IOException ex){ 
            System.out.println("ERROR");
        }
      
    }
    
}
