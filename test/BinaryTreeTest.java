/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isEmpty method, of class BinaryTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinaryTree instance = new BinaryTree();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNodo method, of class BinaryTree.
     */
    @Test
    public void testAddNodo() {
        System.out.println("addNodo");
        BinaryTree instance = new BinaryTree();
        instance.addNodo(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPapa method, of class BinaryTree.
     */
    @Test
    public void testSetPapa() {
        System.out.println("setPapa");
        BinaryTree instance = new BinaryTree();
        instance.setPapa(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of papa method, of class BinaryTree.
     */
    @Test
    public void testPapa() {
        System.out.println("papa");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.papa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIzq method, of class BinaryTree.
     */
    @Test
    public void testSetIzq() {
        System.out.println("setIzq");
        BinaryTree instance = new BinaryTree();
        instance.setIzq(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDer method, of class BinaryTree.
     */
    @Test
    public void testSetDer() {
        System.out.println("setDer");
        BinaryTree instance = new BinaryTree();
        instance.setDer(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class BinaryTree.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Object value = null;
        BinaryTree instance = new BinaryTree();
        instance.setValor(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valor method, of class BinaryTree.
     */
    @Test
    public void testValor() {
        System.out.println("valor");
        BinaryTree instance = new BinaryTree();
        Object expResult = null;
        Object result = instance.valor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of izq method, of class BinaryTree.
     */
    @Test
    public void testIzq() {
        System.out.println("izq");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.izq();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of der method, of class BinaryTree.
     */
    @Test
    public void testDer() {
        System.out.println("der");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.der();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeftChild method, of class BinaryTree.
     */
    @Test
    public void testIsLeftChild() {
        System.out.println("isLeftChild");
        BinaryTree instance = new BinaryTree();
        boolean expResult = false;
        boolean result = instance.isLeftChild();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }    
}
