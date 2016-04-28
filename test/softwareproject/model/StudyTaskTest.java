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
public class StudyTaskTest {
    
    public StudyTaskTest() {
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
     * Test of getType method, of class StudyTask.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        StudyTask instance = null;
        TaskActivityType expResult = null;
        TaskActivityType result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class StudyTask.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        TaskActivityType type = null;
        StudyTask instance = null;
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class StudyTask.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        StudyTask instance = null;
        Date expResult = null;
        Date result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class StudyTask.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        Date startDate = null;
        StudyTask instance = null;
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class StudyTask.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        StudyTask instance = null;
        Date expResult = null;
        Date result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class StudyTask.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        Date endDate = null;
        StudyTask instance = null;
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelatedMilestones method, of class StudyTask.
     */
    @Test
    public void testGetRelatedMilestones() {
        System.out.println("getRelatedMilestones");
        StudyTask instance = null;
        ArrayList<Milestone> expResult = null;
        ArrayList<Milestone> result = instance.getRelatedMilestones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRelatedMilestones method, of class StudyTask.
     */
    @Test
    public void testSetRelatedMilestones() {
        System.out.println("setRelatedMilestones");
        ArrayList<Milestone> relatedMilestones = null;
        StudyTask instance = null;
        instance.setRelatedMilestones(relatedMilestones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRelatedMilestones method, of class StudyTask.
     */
    @Test
    public void testAddRelatedMilestones() {
        System.out.println("addRelatedMilestones");
        Milestone m = null;
        StudyTask instance = null;
        instance.addRelatedMilestones(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRelatedMilestones method, of class StudyTask.
     */
    @Test
    public void testRemoveRelatedMilestones() {
        System.out.println("removeRelatedMilestones");
        Milestone m = null;
        StudyTask instance = null;
        instance.removeRelatedMilestones(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsComplete method, of class StudyTask.
     */
    @Test
    public void testGetIsComplete() {
        System.out.println("getIsComplete");
        StudyTask instance = null;
        boolean expResult = false;
        boolean result = instance.getIsComplete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsComplete method, of class StudyTask.
     */
    @Test
    public void testSetIsComplete() {
        System.out.println("setIsComplete");
        boolean isComplete = false;
        StudyTask instance = null;
        instance.setIsComplete(isComplete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class StudyTask.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        StudyTask instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class StudyTask.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        StudyTask instance = null;
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDependencies method, of class StudyTask.
     */
    @Test
    public void testGetDependencies() {
        System.out.println("getDependencies");
        StudyTask instance = null;
        ArrayList<StudyTask> expResult = null;
        ArrayList<StudyTask> result = instance.getDependencies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDependencies method, of class StudyTask.
     */
    @Test
    public void testSetDependencies() {
        System.out.println("setDependencies");
        ArrayList<StudyTask> dependencies = null;
        StudyTask instance = null;
        instance.setDependencies(dependencies);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDependency method, of class StudyTask.
     */
    @Test
    public void testAddDependency() {
        System.out.println("addDependency");
        StudyTask t = null;
        StudyTask instance = null;
        instance.addDependency(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeDependency method, of class StudyTask.
     */
    @Test
    public void testRemoveDependency() {
        System.out.println("removeDependency");
        StudyTask t = null;
        StudyTask instance = null;
        instance.removeDependency(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class StudyTask.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        StudyTask instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class StudyTask.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        StudyTask instance = null;
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHours method, of class StudyTask.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        StudyTask instance = null;
        int expResult = 0;
        int result = instance.getHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHours method, of class StudyTask.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int hours = 0;
        StudyTask instance = null;
        instance.setHours(hours);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProgress method, of class StudyTask.
     */
    @Test
    public void testGetProgress() {
        System.out.println("getProgress");
        StudyTask instance = null;
        int expResult = 0;
        int result = instance.getProgress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgress method, of class StudyTask.
     */
    @Test
    public void testSetProgress() {
        System.out.println("setProgress");
        int progress = 0;
        StudyTask instance = null;
        instance.setProgress(progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotes method, of class StudyTask.
     */
    @Test
    public void testGetNotes() {
        System.out.println("getNotes");
        StudyTask instance = null;
        ArrayList<Note> expResult = null;
        ArrayList<Note> result = instance.getNotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotes method, of class StudyTask.
     */
    @Test
    public void testSetNotes() {
        System.out.println("setNotes");
        ArrayList<Note> notes = null;
        StudyTask instance = null;
        instance.setNotes(notes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNote method, of class StudyTask.
     */
    @Test
    public void testAddNote() {
        System.out.println("addNote");
        Note t = null;
        StudyTask instance = null;
        instance.addNote(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeNote method, of class StudyTask.
     */
    @Test
    public void testRemoveNote() {
        System.out.println("removeNote");
        Note t = null;
        StudyTask instance = null;
        instance.removeNote(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivities method, of class StudyTask.
     */
    @Test
    public void testGetActivities() {
        System.out.println("getActivities");
        StudyTask instance = null;
        ArrayList<Activity> expResult = null;
        ArrayList<Activity> result = instance.getActivities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addActivity method, of class StudyTask.
     */
    @Test
    public void testAddActivity() {
        System.out.println("addActivity");
        Activity a = null;
        StudyTask instance = null;
        instance.addActivity(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeActivity method, of class StudyTask.
     */
    @Test
    public void testRemoveActivity() {
        System.out.println("removeActivity");
        Activity a = null;
        StudyTask instance = null;
        instance.removeActivity(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class StudyTask.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        StudyTask instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
