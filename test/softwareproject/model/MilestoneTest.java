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
public class MilestoneTest {
    
    public MilestoneTest() {
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
     * Test of getStartDate method, of class Milestone.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Milestone instance = null;
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Milestone.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        Date startDate = null;
        Milestone instance = null;
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Milestone.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Milestone instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Milestone.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Milestone instance = null;
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Milestone.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Milestone instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Milestone.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Milestone instance = null;
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsComplete method, of class Milestone.
     */
    @Test
    public void testIsIsComplete() {
        System.out.println("isIsComplete");
        Milestone instance = null;
        boolean expResult = false;
        boolean result = instance.isIsComplete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsComplete method, of class Milestone.
     */
    @Test
    public void testSetIsComplete() {
        System.out.println("setIsComplete");
        boolean isComplete = false;
        Milestone instance = null;
        instance.setIsComplete(isComplete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeadline method, of class Milestone.
     */
    @Test
    public void testGetDeadline() {
        System.out.println("getDeadline");
        Milestone instance = null;
        Date expResult = null;
        Date result = instance.getDeadline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeadline method, of class Milestone.
     */
    @Test
    public void testSetDeadline() {
        System.out.println("setDeadline");
        Date deadline = null;
        Milestone instance = null;
        instance.setDeadline(deadline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelatedTasks method, of class Milestone.
     */
    @Test
    public void testGetRelatedTasks() {
        System.out.println("getRelatedTasks");
        Milestone instance = null;
        ArrayList<StudyTask> expResult = null;
        ArrayList<StudyTask> result = instance.getRelatedTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRelatedTasks method, of class Milestone.
     */
    @Test
    public void testSetRelatedTasks() {
        System.out.println("setRelatedTasks");
        ArrayList<StudyTask> relatedTasks = null;
        Milestone instance = null;
        instance.setRelatedTasks(relatedTasks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Milestone.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Milestone instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
