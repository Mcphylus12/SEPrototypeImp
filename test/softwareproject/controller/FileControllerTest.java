/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareproject.model.SemesterProfile;

/**
 *
 * @author gmj14gru
 */
public class FileControllerTest {
    
    public FileControllerTest() {
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
     * Test of readSemesterFile method, of class FileController.
     */
    @Test
    public void testReadSemesterFile() {
        System.out.println("readSemesterFile");
        String fileName = "";
        SemesterProfile expResult = null;
        SemesterProfile result = FileController.readSemesterFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeToFile method, of class FileController.
     */
    @Test
    public void testWriteToFile() {
        System.out.println("writeToFile");
        SemesterProfile semp = null;
        String path = "";
        boolean expResult = false;
        boolean result = FileController.writeToFile(semp, path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFromSer method, of class FileController.
     */
    @Test
    public void testReadFromSer() {
        System.out.println("readFromSer");
        String fileName = "";
        SemesterProfile expResult = null;
        SemesterProfile result = FileController.readFromSer(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
