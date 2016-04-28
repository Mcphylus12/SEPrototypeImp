/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;

import java.util.Date;
import javax.swing.JFrame;
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
public class FormControllerTest {
    
    public FormControllerTest() {
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
     * Test of closeWindow method, of class FormController.
     */
    @Test
    public void testCloseWindow() {
        System.out.println("closeWindow");
        JFrame jf = null;
        FormController.closeWindow(jf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateToString method, of class FormController.
     */
    @Test
    public void testDateToString() {
        System.out.println("dateToString");
        Date date = null;
        String expResult = "";
        String result = FormController.dateToString(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateFromStrings method, of class FormController.
     */
    @Test
    public void testGetDateFromStrings() {
        System.out.println("getDateFromStrings");
        String dateString = "";
        Date expResult = null;
        Date result = FormController.getDateFromStrings(dateString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
