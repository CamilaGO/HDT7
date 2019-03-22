/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 22 de Marzo de 2019  -  Algoritmos y Estructuras UVG
 * Clase que permite crear y manejar el diccionario
 *Clase de asociaciones de la palabras ingles-espanol
 */


import java.util.Iterator;

/**
 *clase de tipo binarytree
 * la mayoria de metodos fueron extraido o insiprado del libro del curso Java Structures
 * @author Camila.Maria
 * @param <E>
 */
public class BinaryTree<E> {
    // A T R I B U T O S

    /**
     *
     */
    protected E val; // valor asociado al nodo (asociacion)
    public String nombre;
    protected BinaryTree<E> parent; // papa del nodo
    protected BinaryTree<E> left,right; // hijos del nodo
    
    //M E T O D O S

    /**
     *Constructor default
     */
    public BinaryTree(){
        //Constructor de un nodo vacio
        val = null; 
        parent = null; //papa del nodo
        //hijos del nodo
        left = this;
        right = this;
    }
    /**
     *constructor de su asociacion, valor a la derecha, valor a la izquierda y padre
     * @param value asociacion
     * @param left nodo a la izquierda
     * @param right nodo a la derecha
     * @param parent nodo padre
     */
    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right, BinaryTree<E> parent){
     val = value;
     this.left = left;
     this.right = right;
     this.parent = parent;
    }
    
    /**
     *verifica si esta no hay nodo en una cierta posicion
     * @return true o false
     */
    public boolean isEmpty(){
       return val == null;
   }

    /**
     *settea un nuevo padre para un nodo
     * @param newParent su nuevo padre
     */
    protected void setParent(BinaryTree<E> newParent){
        left = newParent;
    }
    
    /**
     * Devuelve la referencia al papa del nodo
     * @return su padre
     */
    public BinaryTree<E> parent(){
          
        return parent;
    }
    
    /**
     *Coloca el subarbol a la nueva izquierda
     * @param newLeft su nueva izquierda
     */
    public void setLeft(BinaryTree<E> newLeft){
        
         left = newLeft;
    }
        
    /**
     * Coloca a la el subarbol de la derecha a la nueva derecha
     * @param newRight su nueva derecha
     */
    public void setRight(BinaryTree<E> newRight) {
       
        right = newRight;
    }
 
    /**
     *settea la asociacion de un nodo
     * @param value el valor de la asociacion
     */
    public void setValue(E value){
    
        val = value;
    }

    /**
     *retorna la asociacion del nodo
     * @return la asociacion
     */
    public E value(){
     return val;
    }

    /**
     *retorna el nodo izquierdo de un nodo
     * @return su iquierda, puede ser null
     */
    public BinaryTree<E> left(){
     return left;
    }
        
    /**
     *retorna el nodo derecho de un nodo
     * @return su derecha, puede ser null
     */
    public BinaryTree<E> right(){
     return right;
    }
}
