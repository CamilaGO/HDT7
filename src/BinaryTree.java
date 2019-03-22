/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 22 de Marzo de 2019  -  Algoritmos y Estructuras UVG
 * Clase que permite crear y manejar el diccionario
 */


import java.util.Iterator;

/**
 *
 * @author Camila.Maria
 */
public class BinaryTree<E> {
    // A T R I B U T O S
    protected E val; // valor asociado al nodo (traduccion)
    public String nombre;
    protected BinaryTree<E> parent; // papa del nodo
    protected BinaryTree<E> left, right; // hijos del nodo
    
    //M E T O D O S
    public BinaryTree(){
        //Constructor de un nodo vacio
        val = null; 
        parent = null; //papa del nodo
        //hijos del nodo
        left = this;
        right = this;
    }
    
       //constructor de bt
    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right, BinaryTree<E> parent)
 // post: returns a tree referencing value and two subtrees
    {
     val = value;
     this.left = left;
     this.right = right;
     this.parent = parent;
    }
    
   public boolean isEmpty(){
       return val == null;
   }

    protected void setParent(BinaryTree<E> newParent){
        //Establece el papa del nodo al papa dado o a null
        left = newParent;
    }
    
    public BinaryTree<E> parent(){
         // Devuelve la referencia al papa del nodo 
        return parent;
    }
    
    public void setLeft(BinaryTree<E> newLeft){
        //Coloca a la el subarbol de la izquierda a la nueva izquierda
         left = newLeft;
    }
        
    public void setRight(BinaryTree<E> newRight) {
        //Coloca a la el subarbol de la izquierda a la nueva izquierda
        right = newRight;
    }
 
    public void setValue(E value){
    // post: sets the value associated with this node
        val = value;
    }
    public E value()
 // post: returns value associated with this node
    {
     return val;
    }
    public BinaryTree<E> left()
 // post: returns reference to (possibly empty) left subtree
    {
     return left;
    }
        
    public BinaryTree<E> right()
    // post: returns reference to (possibly empty) right subtree
    {
     return right;
    }
    
}
