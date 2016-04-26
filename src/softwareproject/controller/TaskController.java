package softwareproject.controller;

import java.util.ArrayList;
import softwareproject.model.StudyTask;

public class TaskController {
    
    public static String getStringFromTask(StudyTask t){
        StringBuilder sb = new StringBuilder();
        sb.append(t.getTitle());
        return sb.toString();
    }
    
    public static StudyTask createNewTask(
            String title, 
            String description, 
            int hours,
            ArrayList<StudyTask> dependencies){
        
        return new StudyTask(title, description, hours, dependencies);
    }
}
