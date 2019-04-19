/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class cardTest {
    
    public cardTest() {
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
     * Test of GetFileName method, of class card.
     */
    @Test
    public void testGetFileName() {
        System.out.println("GetFileName");
        card instance = null;
        String expResult = "";
        String result = instance.GetFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of GetBlackjackValue method, of class card.
     */
    @Test
    public void testGetBlackjackValue() {
        System.out.println("GetBlackjackValue");
        card instance = null;
        int expResult = 0;
        int result = instance.GetBlackjackValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
