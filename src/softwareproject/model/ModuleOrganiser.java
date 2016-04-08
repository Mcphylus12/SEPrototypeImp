package softwareproject.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ModuleOrganiser {
    private ArrayList<Module> modules;

    public ModuleOrganiser(ArrayList<Module> modules) {
        this.modules = modules;
    }
    
    public ModuleOrganiser(Module ... modules){
        this.modules = new ArrayList(Arrays.asList(modules));
        
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    
    public void addModule(Module m){
        modules.add(m);
    }
    
    public void removeModule(Module m){
        modules.remove(m);
    }
    
    
    

    
    
    
}