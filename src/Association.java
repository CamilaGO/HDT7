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
    
    private K key ;
    private V value;
    
    public Association (K clave, V valor){
        this.key=clave;
        this.value=valor;
    }
    
    public String toString(){
        return "Ingles: "+key+"-> Español: "+value;
    }
    
    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
    
    public boolean comparar(Object otro)
    {
        Association otroAsso = (Association)otro;
        boolean resul = getKey().equals(otroAsso.getKey());
        return resul;
    }
    
    public int hashCode()
    {
        return getKey().hashCode();
    }
    
      public V setValue(V valor)
    {
        V oldValue = value;
        this.value = valor;
        return oldValue;
    }
      
      
    
    
    
}
