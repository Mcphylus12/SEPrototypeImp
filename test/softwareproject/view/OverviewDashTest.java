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
import softwareproject.model.Module;
import softwareproject.model.SemesterProfile;

/**
 *
 * @author gmj14gru
 */
public class OverviewDashTest {
    
    public OverviewDashTest() {
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
     * Test of getListCellRendererComponent method, of class OverviewDash.
     */
    @Test
    public void testGetListCellRendererComponent() {
        System.out.println("getListCellRendererComponent");
        JList<? extends Module> jlist = null;
        Module e = null;
        int i = 0;
        boolean bln = false;
        boolean bln1 = false;
        OverviewDash instance = null;
        Component expResult = null;
        Component result = instance.getListCellRendererComponent(jlist, e, i, bln, bln1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setsemP method, of class OverviewDash.
     */
    @Test
    public void testSetsemP() {
        System.out.println("setsemP");
        SemesterProfile p = null;
        OverviewDash instance = null;
        instance.setsemP(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
