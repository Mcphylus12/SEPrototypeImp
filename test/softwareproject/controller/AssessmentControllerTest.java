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
import softwareproject.model.Assessment;
import softwareproject.model.Milestone;
import softwareproject.model.StudyTask;

/**
 *
 * @author gmj14gru
 */
public class AssessmentControllerTest {
    
    public AssessmentControllerTest() {
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
     * Test of getAssessmentAsString method, of class AssessmentController.
     */
    @Test
    public void testGetAssessmentAsString() {
        System.out.println("getAssessmentAsString");
        Assessment as = null;
        String expResult = "";
        String result = AssessmentController.getAssessmentAsString(as);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attachTask method, of class AssessmentController.
     */
    @Test
    public void testAttachTask() {
        System.out.println("attachTask");
        Assessment a = null;
        StudyTask t = null;
        AssessmentController.attachTask(a, t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attachMilestone method, of class AssessmentController.
     */
    @Test
    public void testAttachMilestone() {
        System.out.println("attachMilestone");
        Assessment a = null;
        Milestone m = null;
        AssessmentController.attachMilestone(a, m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
