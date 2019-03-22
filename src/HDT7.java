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
        String linea = "";
        String str= "                      "; 
        int num = 1;
        BinaryTree House=new BinaryTree();
        BinaryTree Dog=new BinaryTree();
        BinaryTree Homework=new BinaryTree();
        BinaryTree Woman=new BinaryTree();
        BinaryTree Town=new BinaryTree();
        BinaryTree Yes=new BinaryTree();
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
                Association h=new Association (in, es);
                System.out.println(h);
            //creador de binary tree para house
            if (num==1){
                //split de cada linea
               
                //creacion de asociacion de palabras en ingles y español
                
                //se crea el binary tree con esta asociacion que prontamente será relacionado
                diccP = new BinaryTree<Association>(h, h);
                System.out.println(h);
            }
            else{
                diccS=new BinaryTree<Association>(h, h);
                diccP.addNodo(diccS);
            }
            //creador de binary tree para dog
            /*if (num==2){
                
                
                Association d=new Association (in, es);
                Dog = new BinaryTree<Association>(d, d);
                System.out.println(d);
            
            
            
            }//creador de binary tree para homework
            if (num==3){
               
                
                Association hw=new Association (in, es);
                Homework = new BinaryTree<Association>(hw, hw);
                System.out.println(hw);
            
            }
            //creador de binary tree para woman
            if (num==4){
                
                Association w=new Association (in, es);
                Woman = new BinaryTree<Association>(w, w);
                System.out.println(w);
            }
            
            //creador de binary tree para town
            if (num==5){
            
                Association t=new Association (in, es);
                Town = new BinaryTree<Association>(t,t);
                System.out.println(t);
            }
            //creador de binary tree para yes
            if (num==6){
            
                Association y=new Association (in, es);
                Yes = new BinaryTree<Association>(y,y);
                System.out.println(y);
            
            }*/
            num++;
            
            }
            //creacion de relaciones entre palabras
            /*House.setIzq(Dog);
            House.setDer(Woman);
            Dog.setDer(Homework);
            Woman.setIzq(Town);
            Woman.setDer(Yes);*/
            buff.close();
        }catch (IOException ex){ 
            System.out.println("ERROR");
        }
      
    }
    
}
