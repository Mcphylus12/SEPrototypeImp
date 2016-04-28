/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.model;

import java.util.ArrayList;
import java.util.Date;
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
public class SemesterProfileTest {
    
    public SemesterProfileTest() {
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
     * Test of getYear method, of class SemesterProfile.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        SemesterProfile instance = null;
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class SemesterProfile.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        SemesterProfile instance = null;
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class SemesterProfile.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        SemesterProfile instance = null;
        ArrayList<Module> expResult = null;
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModules method, of class SemesterProfile.
     */
    @Test
    public void testSetModules() {
        System.out.println("setModules");
        ArrayList<Module> modules = null;
        SemesterProfile instance = null;
        instance.setModules(modules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModule method, of class SemesterProfile.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module m = null;
        SemesterProfile instance = null;
        instance.addModule(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeModule method, of class SemesterProfile.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module m = null;
        SemesterProfile instance = null;
        instance.removeModule(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class SemesterProfile.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        SemesterProfile instance = null;
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class SemesterProfile.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        Date startDate = null;
        SemesterProfile instance = null;
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class SemesterProfile.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        SemesterProfile instance = null;
        Date expResult = null;
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class SemesterProfile.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        Date endDate = null;
        SemesterProfile instance = null;
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
