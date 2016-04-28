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
import softwareproject.model.StudyTask;
import softwareproject.model.TaskActivityType;

/**
 *
 * @author gmj14gru
 */
public class TaskControllerTest {
    
    public TaskControllerTest() {
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
     * Test of getStringFromTask method, of class TaskController.
     */
    @Test
    public void testGetStringFromTask() {
        System.out.println("getStringFromTask");
        StudyTask t = null;
        String expResult = "";
        String result = TaskController.getStringFromTask(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewTask method, of class TaskController.
     */
    @Test
    public void testCreateNewTask() {
        System.out.println("createNewTask");
        String title = "";
        String description = "";
        int hours = 0;
        TaskActivityType type = null;
        String endDate = "";
        ArrayList<StudyTask> dependencies = null;
        StudyTask expResult = null;
        StudyTask result = TaskController.createNewTask(title, description, hours, type, endDate, dependencies);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
