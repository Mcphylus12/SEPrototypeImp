/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.model;

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
@Suite.SuiteClasses({softwareproject.model.ModuleTest.class, softwareproject.model.CourseworkTest.class, softwareproject.model.NotableTest.class, softwareproject.model.SemesterProfileTest.class, softwareproject.model.StudyTaskTest.class, softwareproject.model.ExamTest.class, softwareproject.model.AssessmentTest.class, softwareproject.model.MilestoneTest.class, softwareproject.model.TaskActivityTypeTest.class, softwareproject.model.ActivityTest.class, softwareproject.model.NoteTest.class, softwareproject.model.CourseTestTest.class, softwareproject.model.ModuleOrganiserTest.class})
public class ModelSuite {

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
