/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javafx.stage.Stage;
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
public class MainTest {
    
    public MainTest() {
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
     * Test of start method, of class Main.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Stage primaryStage =null;
        Main instance = new Main();
        instance.start(primaryStage);
        // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
    }

    /**
     * Test of dealToDealer method, of class Main.
     */
    @Test
    public void testDealToDealer() {
        System.out.println("dealToDealer");
        Main instance = new Main();
        instance.dealToDealer();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

   
   
}
