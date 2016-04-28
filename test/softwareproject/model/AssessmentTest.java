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
public class AssessmentTest {
    
    public AssessmentTest() {
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
     * Test of getProgress method, of class Assessment.
     */
    @Test
    public void testGetProgress() {
        System.out.println("getProgress");
        Assessment instance = null;
        int expResult = 0;
        int result = instance.getProgress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProgress method, of class Assessment.
     */
    @Test
    public void testSetProgress() {
        System.out.println("setProgress");
        int progress = 0;
        Assessment instance = null;
        instance.setProgress(progress);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSetDate method, of class Assessment.
     */
    @Test
    public void testGetSetDate() {
        System.out.println("getSetDate");
        Assessment instance = null;
        Date expResult = null;
        Date result = instance.getSetDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMilestones method, of class Assessment.
     */
    @Test
    public void testGetMilestones() {
        System.out.println("getMilestones");
        Assessment instance = null;
        ArrayList<Milestone> expResult = null;
        ArrayList<Milestone> result = instance.getMilestones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMilestones method, of class Assessment.
     */
    @Test
    public void testSetMilestones() {
        System.out.println("setMilestones");
        ArrayList<Milestone> milestones = null;
        Assessment instance = null;
        instance.setMilestones(milestones);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDueDate method, of class Assessment.
     */
    @Test
    public void testGetDueDate() {
        System.out.println("getDueDate");
        Assessment instance = null;
        Date expResult = null;
        Date result = instance.getDueDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDueDate method, of class Assessment.
     */
    @Test
    public void testSetDueDate() {
        System.out.println("setDueDate");
        Date dueDate = null;
        Assessment instance = null;
        instance.setDueDate(dueDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTask method, of class Assessment.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        StudyTask t = null;
        Assessment instance = null;
        instance.addTask(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addActivity method, of class Assessment.
     */
    @Test
    public void testAddActivity() {
        System.out.println("addActivity");
        Activity a = null;
        Assessment instance = null;
        instance.addActivity(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMilestone method, of class Assessment.
     */
    @Test
    public void testAddMilestone() {
        System.out.println("addMilestone");
        Milestone m = null;
        Assessment instance = null;
        instance.addMilestone(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivities method, of class Assessment.
     */
    @Test
    public void testGetActivities() {
        System.out.println("getActivities");
        Assessment instance = null;
        ArrayList<Activity> expResult = null;
        ArrayList<Activity> result = instance.getActivities();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Assessment.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Assessment instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Assessment.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Assessment instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTasks method, of class Assessment.
     */
    @Test
    public void testGetTasks() {
        System.out.println("getTasks");
        Assessment instance = null;
        ArrayList<StudyTask> expResult = null;
        ArrayList<StudyTask> result = instance.getTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActivities method, of class Assessment.
     */
    @Test
    public void testSetActivities() {
        System.out.println("setActivities");
        ArrayList<Activity> activities = null;
        Assessment instance = null;
        instance.setActivities(activities);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTasks method, of class Assessment.
     */
    @Test
    public void testSetTasks() {
        System.out.println("setTasks");
        ArrayList<StudyTask> tasks = null;
        Assessment instance = null;
        instance.setTasks(tasks);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsSummative method, of class Assessment.
     */
    @Test
    public void testIsIsSummative() {
        System.out.println("isIsSummative");
        Assessment instance = null;
        boolean expResult = false;
        boolean result = instance.isIsSummative();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsSummative method, of class Assessment.
     */
    @Test
    public void testSetIsSummative() {
        System.out.println("setIsSummative");
        boolean isSummative = false;
        Assessment instance = null;
        instance.setIsSummative(isSummative);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsOnline method, of class Assessment.
     */
    @Test
    public void testIsIsOnline() {
        System.out.println("isIsOnline");
        Assessment instance = null;
        boolean expResult = false;
        boolean result = instance.isIsOnline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsOnline method, of class Assessment.
     */
    @Test
    public void testSetIsOnline() {
        System.out.println("setIsOnline");
        boolean isOnline = false;
        Assessment instance = null;
        instance.setIsOnline(isOnline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Assessment.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Assessment instance = null;
        int expResult = 0;
        int result = instance.getWeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Assessment.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        int weight = 0;
        Assessment instance = null;
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Assessment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Assessment instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AssessmentImpl extends Assessment {

        public AssessmentImpl() {
            super("", false, false, 0, null);
        }

        public Date getSetDate() {
            return null;
        }
    }
    
}
