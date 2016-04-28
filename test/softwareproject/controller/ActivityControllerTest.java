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
import softwareproject.model.Activity;
import softwareproject.model.StudyTask;

/**
 *
 * @author gmj14gru
 */
public class ActivityControllerTest {
    
    public ActivityControllerTest() {
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
     * Test of createActivity method, of class ActivityController.
     */
    @Test
    public void testCreateActivity() {
        System.out.println("createActivity");
        String name = "";
        String description = "";
        int hours = 0;
        ArrayList<StudyTask> tasks = null;
        Activity expResult = null;
        Activity result = ActivityController.createActivity(name, description, hours, tasks);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActivityAsString method, of class ActivityController.
     */
    @Test
    public void testGetActivityAsString() {
        System.out.println("getActivityAsString");
        Activity act = null;
        String expResult = "";
        String result = ActivityController.getActivityAsString(act);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
