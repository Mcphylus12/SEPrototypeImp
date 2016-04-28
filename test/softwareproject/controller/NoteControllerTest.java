/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareproject.model.Notable;
import softwareproject.model.Note;

/**
 *
 * @author gmj14gru
 */
public class NoteControllerTest {
    
    public NoteControllerTest() {
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
     * Test of createNote method, of class NoteController.
     */
    @Test
    public void testCreateNote() {
        System.out.println("createNote");
        String name = "";
        String contents = "";
        Date dateCreated = null;
        Note expResult = null;
        Note result = NoteController.createNote(name, contents, dateCreated);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attachNote method, of class NoteController.
     */
    @Test
    public void testAttachNote() {
        System.out.println("attachNote");
        Notable parent = null;
        Note newNote = null;
        NoteController.attachNote(parent, newNote);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoteAsString method, of class NoteController.
     */
    @Test
    public void testGetNoteAsString() {
        System.out.println("getNoteAsString");
        Note n = null;
        String expResult = "";
        String result = NoteController.getNoteAsString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
