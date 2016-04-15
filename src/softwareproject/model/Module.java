package softwareproject.model;

import java.util.ArrayList;

public class Module {
    private ArrayList<Assessment> assessments;
    private ModuleOrganiser moduleOrganiser;
    private String moduleCode;
    private String moduleName;
    private ModuleSchedule moduleSchedule;

    public Module(ModuleOrganiser moduleOrganiser, String moduleCode, String moduleName, ModuleSchedule moduleSchedule) {
        this.moduleOrganiser = moduleOrganiser;
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.moduleSchedule = moduleSchedule;
        this.assessments = new ArrayList();
    }
    
    public void addAssessment(Assessment a){
        this.assessments.add(a);
    }

    public ModuleOrganiser getModuleOrganiser() {
        return moduleOrganiser;
    }

    public void setModuleOrganiser(ModuleOrganiser moduleOrganiser) {
        this.moduleOrganiser = moduleOrganiser;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ModuleSchedule getModuleSchedule() {
        return moduleSchedule;
    }

    public void setModuleSchedule(ModuleSchedule moduleSchedule) {
        this.moduleSchedule = moduleSchedule;
    }
    
    
}