/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.view;

import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
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
public class GanttChartWindowTest {
    
    public GanttChartWindowTest() {
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
     * Test of createDataset method, of class GanttChartWindow.
     */
    @Test
    public void testCreateDataset() {
        System.out.println("createDataset");
        GanttChartWindow instance = null;
        IntervalCategoryDataset expResult = null;
        IntervalCategoryDataset result = instance.createDataset();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createChart method, of class GanttChartWindow.
     */
    @Test
    public void testCreateChart() {
        System.out.println("createChart");
        IntervalCategoryDataset dataset = null;
        GanttChartWindow instance = null;
        JFreeChart expResult = null;
        JFreeChart result = instance.createChart(dataset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
