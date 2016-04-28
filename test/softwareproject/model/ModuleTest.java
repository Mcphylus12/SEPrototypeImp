/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gmj14gru
 */
public class ModuleTest {
    
    public ModuleTest() {
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
     * Test of getAssessments method, of class Module.
     */
    @Test
    public void testGetAssessments() {
        System.out.println("getAssessments");
        Module instance = null;
        ArrayList<Assessment> expResult = null;
        ArrayList<Assessment> result = instance.getAssessments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssessments method, of class Module.
     */
    @Test
    public void testSetAssessments() {
        System.out.println("setAssessments");
        ArrayList<Assessment> assessments = null;
        Module instance = null;
        instance.setAssessments(assessments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAssessment method, of class Module.
     */
    @Test
    public void testAddAssessment() {
        System.out.println("addAssessment");
        Assessment a = null;
        Module instance = null;
        instance.addAssessment(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModuleOrganiser method, of class Module.
     */
    @Test
    public void testGetModuleOrganiser() {
        System.out.println("getModuleOrganiser");
        Module instance = null;
        String expResult = "";
        String result = instance.getModuleOrganiser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModuleOrganiser method, of class Module.
     */
    @Test
    public void testSetModuleOrganiser() {
        System.out.println("setModuleOrganiser");
        String moduleOrganiser = "";
        Module instance = null;
        instance.setModuleOrganiser(moduleOrganiser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModuleCode method, of class Module.
     */
    @Test
    public void testGetModuleCode() {
        System.out.println("getModuleCode");
        Module instance = null;
        String expResult = "";
        String result = instance.getModuleCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModuleCode method, of class Module.
     */
    @Test
    public void testSetModuleCode() {
        System.out.println("setModuleCode");
        String moduleCode = "";
        Module instance = null;
        instance.setModuleCode(moduleCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModuleName method, of class Module.
     */
    @Test
    public void testGetModuleName() {
        System.out.println("getModuleName");
        Module instance = null;
        String expResult = "";
        String result = instance.getModuleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModuleName method, of class Module.
     */
    @Test
    public void testSetModuleName() {
        System.out.println("setModuleName");
        String moduleName = "";
        Module instance = null;
        instance.setModuleName(moduleName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
