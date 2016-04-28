/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;

import java.awt.Component;
import java.awt.event.FocusEvent;
import javax.swing.JList;
import javax.swing.JTextField;
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
public class ErrorControllerTest {
    
    public ErrorControllerTest() {
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
     * Test of intValidation method, of class ErrorController.
     */
    @Test
    public void testIntValidation() {
        System.out.println("intValidation");
        JTextField txt = null;
        boolean expResult = false;
        boolean result = ErrorController.intValidation(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateValidation method, of class ErrorController.
     */
    @Test
    public void testDateValidation() {
        System.out.println("dateValidation");
        String inputDate = "";
        boolean expResult = false;
        boolean result = ErrorController.dateValidation(inputDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetColour method, of class ErrorController.
     */
    @Test
    public void testResetColour() {
        System.out.println("resetColour");
        FocusEvent evt = null;
        ErrorController.resetColour(evt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of txtEmptyValidation method, of class ErrorController.
     */
    @Test
    public void testTxtEmptyValidation() {
        System.out.println("txtEmptyValidation");
        String s = "";
        boolean expResult = false;
        boolean result = ErrorController.txtEmptyValidation(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listSelectionValidation method, of class ErrorController.
     */
    @Test
    public void testListSelectionValidation() {
        System.out.println("listSelectionValidation");
        JList lst = null;
        boolean expResult = false;
        boolean result = ErrorController.listSelectionValidation(lst);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setErrorBackground method, of class ErrorController.
     */
    @Test
    public void testSetErrorBackground() {
        System.out.println("setErrorBackground");
        boolean valid = false;
        Component c = null;
        ErrorController.setErrorBackground(valid, c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
