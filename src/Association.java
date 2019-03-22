/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class Association <K,V>  {
    
     private K clave ;
    private V valor;
    
    public Association (K clave, V valor){
        this.clave=clave;
        this.valor=valor;
        
    }
    public String toString(){
        return "Ingles: "+clave+"-> Español: "+valor;
    }
    public K getClave(){
        return clave;
    }

    public V getValor(){
        return valor;
    }
    
    
}
