/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject;

import softwareproject.controller.PanelController;
import softwareproject.view.DashBoardPanel;
import softwareproject.view.ModuleOverview;
import softwareproject.view.NavPane;
import softwareproject.view.Window;

/**
 *
 * @author ybm14yju
 */
public class SoftwareProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Window window = new Window("Study Planner V0.0.0.0.0.0.0.1");
        NavPane nav = new NavPane();
        ModuleOverview mo = new ModuleOverview();
        PanelController panelController = new PanelController(window, nav);
        DashBoardPanel dashBoardPanel = new DashBoardPanel();
        panelController.setModulePanel(mo);
    }
    
}
