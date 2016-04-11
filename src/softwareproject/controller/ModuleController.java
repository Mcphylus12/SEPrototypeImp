package softwareproject.controller;

import java.util.ArrayList;
import softwareproject.model.Assessment;
import softwareproject.model.Module;

public class ModuleController{
        public static ArrayList<Assessment> getAssessments(Module m){
        ArrayList<Assessment> thing = new ArrayList();
        thing.addAll(m.getModuleSchedule().getExams());
        thing.addAll(m.getModuleSchedule().getCourseTests());
        thing.addAll(m.getModuleSchedule().getCourseWork());
        return thing;
    }
}