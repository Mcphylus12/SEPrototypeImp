/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareproject.model.Assessment;
import softwareproject.model.Module;

/**
 *
 * @author gmj14gru
 */
public class ModuleControllerTest {
    
    public ModuleControllerTest() {
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
     * Test of getAssessments method, of class ModuleController.
     */
    @Test
    public void testGetAssessments() {
        System.out.println("getAssessments");
        Module m = null;
        ArrayList<Assessment> expResult = null;
        ArrayList<Assessment> result = ModuleController.getAssessments(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
