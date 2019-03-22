
import java.util.ArrayList;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camila
 */
public class Diccionario {
    BinaryTree<Association<String, String>> raiz;
    
    //constructor para crear el arbol
    public Diccionario(ArrayList<Association<String, String>> arrayAs){
        raiz = new BinaryTree<Association<String, String>>(null, null, null,null);
        raiz.setValue(arrayAs.get(0)); //Se añade el primer valor como papa
        //Se agregaron las demas asociaciones
        for(int i=1; i<arrayAs.size();i++){
            addAss(raiz, arrayAs.get(i));
            System.out.print("\n"+arrayAs.get(i));
        }
    }
    
    public void addAss(BinaryTree<Association<String, String>> viejo, Association<String, String> nuevo){
        //Se obtiene el valor del BTS a modificar y los keys
        Association<String,String> asoc = viejo.value();
        String keyP = asoc.getKey();
        String keyS = nuevo.getKey();
        //Se comparan los tamaños de los keys 
        int resul = keyP.compareToIgnoreCase(keyS);
        if (resul>0 && viejo.left()==null){
            //Si la clave del padre es mayor y no tiene hijo izquierdo se agrega
            viejo.setLeft(new BinaryTree<Association<String,String>>(null, null,null,null));
            viejo.left().setValue(nuevo);
        }else if(viejo.left()!=null){
            //si ya tiene un hijo izquierdo
            addAss(viejo.left(), nuevo);
        }
        if (resul<0 && viejo.right()==null){
            //Si la clave del padre es menor y no tiene hijo derecho se agrega
            viejo.setRight(new BinaryTree<Association<String,String>>(null, null,null,null));
            viejo.right().setValue(nuevo);
        }else if(viejo.right()!=null){
            //si ya tiene un hijo izquierdo
            addAss(viejo.right(), nuevo);
        }
    }
    
    //Busca palabra en el arbol 
    public String traduccion(BinaryTree<Association<String,String>> bts, String palabra){
        String wTrad = "";
	Association<String,String> asociacion= bts.value();
       	String keyBTS=asociacion.getKey();
	int n =keyBTS.compareToIgnoreCase(palabra);
	if(n==0){
		wTrad=bts.value().getValue();
	}
	if(n<0){
            if(bts.right()!=null){
                wTrad=traduccion(bts.right(),palabra);
            }else{
                return ("*"+palabra+"*");
            }
	}
	if(n>0){
            if(bts.left()!=null){
                    wTrad=traduccion(bts.left(),palabra);
            }else{
                    return ("*"+palabra+"*");
            }
		
	}
	return wTrad;
    }
    
    public BinaryTree<Association<String, String>> getRaiz(){
        return raiz;
    }
    
    //
}
