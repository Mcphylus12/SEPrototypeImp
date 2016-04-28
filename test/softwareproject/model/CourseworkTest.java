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
public class CourseworkTest {
    
    public CourseworkTest() {
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
     * Test of getSetDate method, of class Coursework.
     */
    @Test
    public void testGetSetDate() {
        System.out.println("getSetDate");
        Coursework instance = null;
        Date expResult = null;
        Date result = instance.getSetDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSetDate method, of class Coursework.
     */
    @Test
    public void testSetSetDate() {
        System.out.println("setSetDate");
        Date setDate = null;
        Coursework instance = null;
        instance.setSetDate(setDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReturnDate method, of class Coursework.
     */
    @Test
    public void testGetReturnDate() {
        System.out.println("getReturnDate");
        Coursework instance = null;
        Date expResult = null;
        Date result = instance.getReturnDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReturnDate method, of class Coursework.
     */
    @Test
    public void testSetReturnDate() {
        System.out.println("setReturnDate");
        Date returnDate = null;
        Coursework instance = null;
        instance.setReturnDate(returnDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarker method, of class Coursework.
     */
    @Test
    public void testGetMarker() {
        System.out.println("getMarker");
        Coursework instance = null;
        String expResult = "";
        String result = instance.getMarker();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarker method, of class Coursework.
     */
    @Test
    public void testSetMarker() {
        System.out.println("setMarker");
        String marker = "";
        Coursework instance = null;
        instance.setMarker(marker);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubmissionType method, of class Coursework.
     */
    @Test
    public void testGetSubmissionType() {
        System.out.println("getSubmissionType");
        Coursework instance = null;
        String expResult = "";
        String result = instance.getSubmissionType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubmissionType method, of class Coursework.
     */
    @Test
    public void testSetSubmissionType() {
        System.out.println("setSubmissionType");
        String submissionType = "";
        Coursework instance = null;
        instance.setSubmissionType(submissionType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
