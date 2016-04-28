/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareproject.model.Milestone;
import softwareproject.model.StudyTask;

/**
 *
 * @author gmj14gru
 */
public class MilestoneControllerTest {
    
    public MilestoneControllerTest() {
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
     * Test of createNewMilestone method, of class MilestoneController.
     */
    @Test
    public void testCreateNewMilestone() {
        System.out.println("createNewMilestone");
        String title = "";
        String description = "";
        String dateString = "";
        ArrayList<StudyTask> relatedTasks = null;
        Milestone expResult = null;
        Milestone result = MilestoneController.createNewMilestone(title, description, dateString, relatedTasks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStringFromTask method, of class MilestoneController.
     */
    @Test
    public void testGetStringFromTask() {
        System.out.println("getStringFromTask");
        Milestone m = null;
        String expResult = "";
        String result = MilestoneController.getStringFromTask(m);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
