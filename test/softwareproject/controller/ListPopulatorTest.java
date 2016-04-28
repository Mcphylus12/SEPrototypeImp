/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;

import java.util.ArrayList;
import javax.swing.JList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareproject.model.StudyTask;

/**
 *
 * @author gmj14gru
 */
public class ListPopulatorTest {
    
    public ListPopulatorTest() {
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
     * Test of populateJList method, of class ListPopulator.
     */
    @Test
    public void testPopulateJList() {
        System.out.println("populateJList");
        ListPopulator instance = new ListPopulator();
        instance.populateJList(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateComboBox method, of class ListPopulator.
     */
    @Test
    public void testPopulateComboBox() {
        System.out.println("populateComboBox");
        ListPopulator instance = new ListPopulator();
        instance.populateComboBox(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateDependencyList method, of class ListPopulator.
     */
    @Test
    public void testPopulateDependencyList() {
        System.out.println("populateDependencyList");
        ArrayList<StudyTask> src = null;
        JList jl = null;
        ListPopulator instance = new ListPopulator();
        instance.populateDependencyList(src, jl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateActivityDependencyList method, of class ListPopulator.
     */
    @Test
    public void testPopulateActivityDependencyList() {
        System.out.println("populateActivityDependencyList");
        ArrayList<StudyTask> src = null;
        JList jl = null;
        ListPopulator instance = new ListPopulator();
        instance.populateActivityDependencyList(src, jl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
