/*
 * Maria Ines Vasquez Figueroa 18250    Paula Camila Gonzalez Ortega 18398
 * 22 de Marzo de 2019  -  Algoritmos y Estructuras UVG
 * Clase que permite crear y manejar el diccionario
 */
package hdt7;

/**
 *
 * @author Camila
 */
public class BinaryTree<E> {
    // A T R I B U T O
    protected E valor; // valor asociado al nodo (traduccion)
    protected BinaryTree<E> papa; // papa del nodo
    protected BinaryTree<E> izq, der; // hijos del nodo
    
    //M E T O D O S
    public BinaryTree(){
        //Constructor de un nodo vacio
        valor = null; 
        papa = null; //papa del nodo
        //hijos del nodo
        izq = this;
        der = this;
    }
    
   public boolean isEmpty(){
       return valor == null;
   }
   
    protected void setPapa(BinaryTree<E> newParent){
        // Establece el papa del nodo al papa dado o a null
        if (!isEmpty()) {
        papa = newParent;
        }
    }
    
    public BinaryTree<E> papa(){
         // Devuelve la referencia al papa del nodo 
        return papa;
    }
    
    public void setIzq(BinaryTree<E> newIzq){
        //Coloca a la el subarbol de la izquierda a la nueva izquierda
        // se modifica la paternidad, la nueva izquierda no es null
         if (isEmpty()) return;
         if (izq != null && izq.papa() == this) izq.setPapa(null);
         izq = newIzq;
         izq.setPapa(this);
    }
        
    public void setDer(BinaryTree<E> newDer) {
        //Coloca a la el subarbol de la izquierda a la nueva izquierda
        // se modifica la paternidad, la nueva izquierda no es null
        if (isEmpty()) return;
        if (der != null && der.papa() == this) der.setPapa(null);
        der = newDer;
        der.setPapa(this);
    }
    
    public BinaryTree(E value){
        //Obtiene el arbol asociado al valor y dos subarboles nuevos
        valor = value;
        der = izq = new BinaryTree<E>();
        setIzq(izq);
        setDer(der);
        
    }
    
    
    
}
