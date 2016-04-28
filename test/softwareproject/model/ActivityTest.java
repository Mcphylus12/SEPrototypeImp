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
public class ActivityTest {
    
    public ActivityTest() {
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
     * Test of getStartDate method, of class Activity.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Activity instance = null;
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Activity.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        Date startDate = null;
        Activity instance = null;
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Activity.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Activity instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Activity.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Activity instance = null;
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHours method, of class Activity.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Activity instance = null;
        int expResult = 0;
        int result = instance.getHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHours method, of class Activity.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int hours = 0;
        Activity instance = null;
        instance.setHours(hours);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Activity.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Activity instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Activity.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Activity instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTasks method, of class Activity.
     */
    @Test
    public void testGetTasks() {
        System.out.println("getTasks");
        Activity instance = null;
        ArrayList<StudyTask> expResult = null;
        ArrayList<StudyTask> result = instance.getTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTasks method, of class Activity.
     */
    @Test
    public void testSetTasks() {
        System.out.println("setTasks");
        ArrayList<StudyTask> tasks = null;
        Activity instance = null;
        instance.setTasks(tasks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class Activity.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        Activity instance = null;
        ArrayList<Note> expResult = null;
        ArrayList<Note> result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsFinished method, of class Activity.
     */
    @Test
    public void testGetIsFinished() {
        System.out.println("getIsFinished");
        Activity instance = null;
        boolean expResult = false;
        boolean result = instance.getIsFinished();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class Activity.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        ArrayList<Note> notes = null;
        Activity instance = null;
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNote method, of class Activity.
     */
    @Test
    public void testAddNote() {
        System.out.println("addNote");
        Note note = null;
        Activity instance = null;
        instance.addNote(note);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeNote method, of class Activity.
     */
    @Test
    public void testRemoveNote() {
        System.out.println("removeNote");
        Note note = null;
        Activity instance = null;
        instance.removeNote(note);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class Activity.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        StudyTask task = null;
        Activity instance = null;
        instance.addTask(task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTask method, of class Activity.
     */
    @Test
    public void testRemoveTask() {
        System.out.println("removeTask");
        StudyTask task = null;
        Activity instance = null;
        instance.removeTask(task);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsFinished method, of class Activity.
     */
    @Test
    public void testSetIsFinished() {
        System.out.println("setIsFinished");
        boolean isFinished = false;
        Activity instance = null;
        instance.setIsFinished(isFinished);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Activity.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Activity instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
