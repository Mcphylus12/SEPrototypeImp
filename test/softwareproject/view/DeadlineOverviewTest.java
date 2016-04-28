/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.view;

import java.awt.Component;
import javax.swing.JList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareproject.model.Assessment;

/**
 *
 * @author gmj14gru
 */
public class DeadlineOverviewTest {
    
    public DeadlineOverviewTest() {
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
     * Test of getListCellRendererComponent method, of class DeadlineOverview.
     */
    @Test
    public void testGetListCellRendererComponent() {
        System.out.println("getListCellRendererComponent");
        JList<? extends Assessment> jlist = null;
        Assessment e = null;
        int i = 0;
        boolean bln = false;
        boolean bln1 = false;
        DeadlineOverview instance = null;
        Component expResult = null;
        Component result = instance.getListCellRendererComponent(jlist, e, i, bln, bln1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
