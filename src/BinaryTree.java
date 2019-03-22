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
    protected E valor; // valor asociado al nodo (traduccion)
    public String nombre;
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
   //Método extraido de https://serprogramador.es/programar-arboles-binarios-parte-1-introduccionclasesagregar-nodo/#agregar_nodo para agregar
   private void addBT( BinaryTree<E> nodo, BinaryTree<E> raiz ) {
        /* 2.- Partiendo de la raíz preguntamos: Nodo == null ( o no existe ) ? */
        if ( raiz == null ) {
            System.out.println(":(");
            this.papa=nodo;
        }
        else {
            System.out.println("ENTRAAA");
            /* 4.- En caso negativo preguntamos: X < Nodo */
            if ( nodo.nombre.length() <= raiz.nombre.length() ) {
                /* 
                 * 5.- En caso de ser menor pasamos al Nodo de la IZQUIERDA del
                 * que acabamos de preguntar y repetimos desde el paso 2 
                 * partiendo del Nodo al que acabamos de visitar 
                 */
                if (raiz.izq() == null) {
                    raiz.setIzq(nodo);
                }
                else {
                    addBT( nodo , raiz.izq() );
                }
            }
            else {
                /* 
                 * 6.- En caso de ser mayor pasamos al Nodo de la DERECHA y tal
                 * cual hicimos con el caso anterior repetimos desde el paso 2
                 * partiendo de este nuevo Nodo.
                 */
                if (raiz.der() == null) {
                    raiz.setDer(nodo);
                }
                else {
                    addBT( nodo, raiz.der() );
                }
            }
        }
    }
 
    public void addNodo( BinaryTree<E> nodo ) {
        this.addBT( nodo , nodo.papa );
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
    
    public BinaryTree(Association t, E value){
        //Obtiene el arbol asociado al valor y dos subarboles nuevos
        valor = value;
        nombre=(String) t.getClave();
        der = izq = new BinaryTree<E>();
        setIzq(izq);
        setDer(der);
        
    }
    
    public void setValor(E value)
 // post: sets the value associated with this node
    {
     valor = value;
    }
    public E valor()
 // post: returns value associated with this node
    {
     return valor;
    }
    public BinaryTree<E> izq()
 // post: returns reference to (possibly empty) left subtree
    {
     return izq;
    }
        
 public BinaryTree<E> der()
    // post: returns reference to (possibly empty) right subtree
    {
     return der;
    }
 //verifica si tiene un hijo izquierdo
    public boolean isLeftChild(){
             if (papa() == null) return false;
                return this == papa().izq();

        }
     public Iterator<E> iterator(){
             return iterator();

        }
        //verifica si tiene un hijo derecho
    public boolean isRightChild()
        {
        if (papa() == null) return false;
             return this == papa().der();
        }
    //constructor de bt
    public BinaryTree(E value, BinaryTree<E> left, BinaryTree<E> right)
 // post: returns a tree referencing value and two subtrees
    {
     valor = value;
     if (left == null) { left = new BinaryTree<E>(); }
     setIzq(left);
     if (right == null) { right = new BinaryTree<E>(); }
     setDer(right);
    }
    
}
