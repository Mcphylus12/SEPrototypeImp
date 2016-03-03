/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import softwareproject.view.*;

/**
 *
 * @author qxz14sru
 */
public class PanelController {
    
    private static final int xOff = 5;
    private static final int yOff = 5;
    private static final double navPanePercentage = 0.25;
    
    Container windowContentPane;
    NavPane nav;

    public PanelController(Window Window, NavPane nav) {
        this.windowContentPane = Window.getContentPane();
        this.nav = nav;
    }
    
    
    public void setModulePanel(ModuleOverview mo){
        windowContentPane.removeAll();
        windowContentPane.setLayout(null);
        Rectangle r = new Rectangle((int)((double)(windowContentPane.getWidth())*navPanePercentage) + xOff, yOff, 
                (int)((double)(windowContentPane.getWidth())*(1-navPanePercentage)) - xOff*2, windowContentPane.getHeight() - yOff*2);
        System.out.println("module rect = " + r);
        mo.setBounds(r);
        windowContentPane.add(mo);
        r = new Rectangle(xOff, yOff, (int)((double)(windowContentPane.getWidth())*navPanePercentage) - xOff*2, windowContentPane.getHeight() - yOff*2);   
        System.out.println("nav rect = " + r);
        nav.setBounds(r);
        windowContentPane.add(nav);
        windowContentPane.revalidate();
        windowContentPane.repaint();
    }
    
    public void setDashBoardPanel(DashBoardPanel dbp){
        windowContentPane.removeAll();
        windowContentPane.setLayout(null);
        Rectangle r = new Rectangle(xOff, yOff, windowContentPane.getWidth() - xOff*2, windowContentPane.getHeight() - yOff*2);
        System.out.println("dashboard rect = " + r);
        dbp.setBounds(r);
        windowContentPane.add(dbp);
        windowContentPane.revalidate();
        windowContentPane.repaint();
    }
    
}
