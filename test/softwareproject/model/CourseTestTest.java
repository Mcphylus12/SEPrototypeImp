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
public class CourseTestTest {
    
    public CourseTestTest() {
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
     * Test of getWebsiteURL method, of class CourseTest.
     */
    @Test
    public void testGetWebsiteURL() {
        System.out.println("getWebsiteURL");
        CourseTest instance = null;
        String expResult = "";
        String result = instance.getWebsiteURL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWebsiteURL method, of class CourseTest.
     */
    @Test
    public void testSetWebsiteURL() {
        System.out.println("setWebsiteURL");
        String websiteURL = "";
        CourseTest instance = null;
        instance.setWebsiteURL(websiteURL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSetDate method, of class CourseTest.
     */
    @Test
    public void testGetSetDate() {
        System.out.println("getSetDate");
        CourseTest instance = null;
        Date expResult = null;
        Date result = instance.getSetDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
