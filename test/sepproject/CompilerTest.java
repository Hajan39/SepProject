/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepproject;

import com.github.ferstl.junit.testgroups.TestGroup;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.ClassRule;
import org.junit.experimental.categories.Category;

/**
 *
 * @author Jan
 */

@TestGroup
public class CompilerTest {
    
 
    public CompilerTest() {
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
     @org.junit.Test
    public void testFibSumForOne() {
        int count = 1;
        Compiler instance = new Compiler();
        long expResult = 0;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFibSumForTwo() {
        int count = 2;
        Compiler instance = new Compiler();
        long expResult = 1;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFibSumForThree() {
        int count = 3;
        Compiler instance = new Compiler();
        long expResult = 1;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFibSumForFour() {
        int count = 4;
        Compiler instance = new Compiler();
        long expResult = 2;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFibSumForFive() {
        int count = 5;
        Compiler instance = new Compiler();
        long expResult = 3;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFibSumForSix() {
        int count = 6;
        Compiler instance = new Compiler();
        long expResult = 5;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testFibSumForSeven() {
        int count = 7;
        Compiler instance = new Compiler();
        long expResult = 8;
        long result = instance.fibSum(count);
        assertEquals(expResult, result);
    }

    /**
     * Test of fibSum method, of class Compiler.
     */
    @Test
    public void testFibSum() {
        int n = 0;
        Compiler instance = new Compiler();
        long expResult = 0;
        long result = instance.fibSum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
