/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria.camila
 */
public class DiccionarioTest {
    
    
    /**
     * Test of addAss method, of class Diccionario.
     * metodo que inserta las asociaciones en el diccionario
     */
    @Test
    public void testAddAss() {
        ArrayList<Association<String, String>> arrayAs = new ArrayList<>();
        String in="cat";
        String es="gato";
        Association h=new Association (in, es);
        arrayAs.add(h);
        in="ballon";
        es="globo";
        Association k=new Association (in, es);
        arrayAs.add(k);
        Diccionario instance = new Diccionario(arrayAs);
    }
    /**
     * Test of traduccion method, of class Diccionario.
     * metodo que busca una palabra en el diccionario en ingles para obtener su asociacion que es su respectiva traduccion a espanol
     */
    @Test
    public void testTraduccion() {
        ArrayList<Association<String, String>> arrayAs = new ArrayList<>();
        String in="cat";
        String es="gato";
        Association h=new Association (in, es);
        arrayAs.add(h);
        in="ballon";
        es="globo";
        Association k=new Association (in, es);
        arrayAs.add(k);
        Diccionario dicc = new Diccionario(arrayAs);//al crear un objeto diccionario igualmente se evalua el metodo de AddAss() ya que en el constructor se llama
        String palabrain="cat";
        String expResult=dicc.traduccion(dicc.getRaiz(), palabrain);
        String palabra = "gato";
        assertEquals(expResult, palabra);
    }
}
