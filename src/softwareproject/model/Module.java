package softwareproject.model;

import java.util.ArrayList;

public class Module {
    private ArrayList<Assessment> assessments;

    public ArrayList<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(ArrayList<Assessment> assessments) {
        this.assessments = assessments;
    }
    private ModuleOrganiser moduleOrganiser;
    private String moduleCode;
    private String moduleName;

    public Module(ModuleOrganiser moduleOrganiser, String moduleCode, String moduleName) {
        this.moduleOrganiser = moduleOrganiser;
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
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
}