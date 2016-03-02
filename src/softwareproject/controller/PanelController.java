/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.controller;

import softwareproject.view.*;

/**
 *
 * @author qxz14sru
 */
public class PanelController {
    
    Window window;
    NavPane nav;

    public PanelController(Window Window) {
        this.window = Window;
    }
    
    
    public void setModulePanel(ModuleOverview mo){
        window.removeAll();
        window.add(mo);
        window.add(nav);
        
    }
    
    public void setDashBoardPanel(DashBoardPanel dbp){
        window.removeAll();
        window.add(dbp);
    }
    
}
