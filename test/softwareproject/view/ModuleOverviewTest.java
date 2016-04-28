/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.view;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareproject.model.Assessment;

/**
 *
 * @author gmj14gru
 */
public class ModuleOverviewTest {
    
    public ModuleOverviewTest() {
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
     * Test of setSelectedAssignment method, of class ModuleOverview.
     */
    @Test
    public void testSetSelectedAssignment() {
        System.out.println("setSelectedAssignment");
        Assessment a = null;
        ModuleOverview instance = null;
        instance.setSelectedAssignment(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillComponents method, of class ModuleOverview.
     */
    @Test
    public void testFillComponents() {
        System.out.println("fillComponents");
        ModuleOverview instance = null;
        instance.fillComponents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadAssessments method, of class ModuleOverview.
     */
    @Test
    public void testLoadAssessments() {
        System.out.println("loadAssessments");
        ModuleOverview instance = null;
        instance.loadAssessments();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
