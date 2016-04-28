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
import softwareproject.controller.PanelController;
import softwareproject.model.Module;
import softwareproject.model.SemesterProfile;

/**
 *
 * @author gmj14gru
 */
public class NavPaneTest {
    
    public NavPaneTest() {
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
     * Test of setSemesterProfile method, of class NavPane.
     */
    @Test
    public void testSetSemesterProfile() {
        System.out.println("setSemesterProfile");
        SemesterProfile semp = null;
        NavPane instance = new NavPane();
        instance.setSemesterProfile(semp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSemesterProfile method, of class NavPane.
     */
    @Test
    public void testGetSemesterProfile() {
        System.out.println("getSemesterProfile");
        NavPane instance = new NavPane();
        SemesterProfile expResult = null;
        SemesterProfile result = instance.getSemesterProfile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListCellRendererComponent method, of class NavPane.
     */
    @Test
    public void testGetListCellRendererComponent() {
        System.out.println("getListCellRendererComponent");
        JList<? extends Module> jlist = null;
        Module e = null;
        int i = 0;
        boolean bln = false;
        boolean bln1 = false;
        NavPane instance = new NavPane();
        Component expResult = null;
        Component result = instance.getListCellRendererComponent(jlist, e, i, bln, bln1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPanelController method, of class NavPane.
     */
    @Test
    public void testSetPanelController() {
        System.out.println("setPanelController");
        PanelController pa = null;
        NavPane instance = new NavPane();
        instance.setPanelController(pa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
