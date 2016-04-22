package softwareproject.controller;

import softwareproject.model.Assessment;
import softwareproject.model.Milestone;
import softwareproject.model.Task;


public class AssessmentController {
    
    public static String getAssessmentAsString(Assessment as){
        StringBuilder sb = new StringBuilder();
        sb.append(as.getName()).append(" - ").append(as.getDueDate()).append(" - ").append(as.getWeight()).append("%");
        return sb.toString();
        
    }
    
    public static void attachTask(Assessment a, Task t){
        a.addTask(t);
    }
    public static void attachMilestone(Assessment a, Milestone m){
        a.addMilestone(m);
    }
}