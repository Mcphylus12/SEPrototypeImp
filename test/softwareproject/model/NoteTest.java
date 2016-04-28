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
public class NoteTest {
    
    public NoteTest() {
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
     * Test of getName method, of class Note.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Note instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Note.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Note instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContents method, of class Note.
     */
    @Test
    public void testGetContents() {
        System.out.println("getContents");
        Note instance = null;
        String expResult = "";
        String result = instance.getContents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContents method, of class Note.
     */
    @Test
    public void testSetContents() {
        System.out.println("setContents");
        String contents = "";
        Note instance = null;
        instance.setContents(contents);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreated method, of class Note.
     */
    @Test
    public void testGetDateCreated() {
        System.out.println("getDateCreated");
        Note instance = null;
        Date expResult = null;
        Date result = instance.getDateCreated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreated method, of class Note.
     */
    @Test
    public void testSetDateCreated() {
        System.out.println("setDateCreated");
        Date dateCreated = null;
        Note instance = null;
        instance.setDateCreated(dateCreated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
