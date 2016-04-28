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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author gmj14gru
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({softwareproject.controller.PanelControllerTest.class, softwareproject.controller.FileControllerTest.class, softwareproject.controller.ActivityControllerTest.class, softwareproject.controller.NoteControllerTest.class, softwareproject.controller.ModuleControllerTest.class, softwareproject.controller.ErrorControllerTest.class, softwareproject.controller.ListPopulatorTest.class, softwareproject.controller.TaskControllerTest.class, softwareproject.controller.AssessmentControllerTest.class, softwareproject.controller.FormControllerTest.class, softwareproject.controller.MilestoneControllerTest.class})
public class ControllerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
