/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gmj14gru
 */
public class ModuleOrganiserTest {
    
    public ModuleOrganiserTest() {
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
     * Test of getName method, of class ModuleOrganiser.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ModuleOrganiser instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class ModuleOrganiser.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ModuleOrganiser instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModules method, of class ModuleOrganiser.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        ModuleOrganiser instance = null;
        ArrayList<Module> expResult = null;
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModules method, of class ModuleOrganiser.
     */
    @Test
    public void testSetModules() {
        System.out.println("setModules");
        ArrayList<Module> modules = null;
        ModuleOrganiser instance = null;
        instance.setModules(modules);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addModule method, of class ModuleOrganiser.
     */
    @Test
    public void testAddModule() {
        System.out.println("addModule");
        Module m = null;
        ModuleOrganiser instance = null;
        instance.addModule(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeModule method, of class ModuleOrganiser.
     */
    @Test
    public void testRemoveModule() {
        System.out.println("removeModule");
        Module m = null;
        ModuleOrganiser instance = null;
        instance.removeModule(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
