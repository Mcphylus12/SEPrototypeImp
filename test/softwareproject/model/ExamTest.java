/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.model;

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
public class ExamTest {
    
    public ExamTest() {
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
     * Test of getDuration method, of class Exam.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Exam instance = null;
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuration method, of class Exam.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        int duration = 0;
        Exam instance = null;
        instance.setDuration(duration);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocation method, of class Exam.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Exam instance = null;
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLocation method, of class Exam.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        Exam instance = null;
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSetDate method, of class Exam.
     */
    @Test
    public void testGetSetDate() {
        System.out.println("getSetDate");
        Exam instance = null;
        Date expResult = null;
        Date result = instance.getSetDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
