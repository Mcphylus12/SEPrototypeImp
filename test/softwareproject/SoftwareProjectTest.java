/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareproject.model.SemesterProfile;

/**
 *
 * @author gmj14gru
 */
public class SoftwareProjectTest {
    
    public SoftwareProjectTest() {
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
     * Test of main method, of class SoftwareProject.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SoftwareProject.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of genDummy method, of class SoftwareProject.
     */
    @Test
    public void testGenDummy() {
        System.out.println("genDummy");
        SemesterProfile expResult = null;
        SemesterProfile result = SoftwareProject.genDummy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
