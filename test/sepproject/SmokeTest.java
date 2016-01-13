/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jan
 */
public class SmokeTest {
    
    public SmokeTest() {
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
     * Test of fibSum method, of class Compiler.
     */
    @Test
   public void testFibSumForOne() {
        int count = 1;
        Compiler instance = new Compiler();
        long expResult = 0;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @Test
    public void testFibSumForTwo() {
        int count = 2;
        Compiler instance = new Compiler();
        long expResult = 1;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @Test
    public void testFibSumForThree() {
        int count = 3;
        Compiler instance = new Compiler();
        long expResult = 1;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @Test
    public void testFibSumForFour() {
        int count = 4;
        Compiler instance = new Compiler();
        long expResult = 2;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @Test
    public void testFibSumForFive() {
        int count = 5;
        Compiler instance = new Compiler();
        long expResult = 2;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @Test
    public void testFibSumForSix() {
        int count = 6;
        Compiler instance = new Compiler();
        long expResult = 5;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @Test
    public void testFibSumForSeven() {
        int count = 7;
        Compiler instance = new Compiler();
        long expResult = 8;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }
    
}
