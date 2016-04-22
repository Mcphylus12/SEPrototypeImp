package softwareproject.controller;

import java.util.ArrayList;
import java.util.Date;
import softwareproject.model.Milestone;
import softwareproject.model.Task;

public class MilestoneController {
    public static Milestone createNewMilestone(
            String title, 
            String description, 
            String dateString, 
            ArrayList<Task> relatedTasks){
        Date date = FormController.getDateFromStrings(dateString);
        return new Milestone(title, description, date, relatedTasks);
    }
    
    public static String getStringFromTask(Milestone m){
        StringBuilder sb = new StringBuilder();
        sb.append(m.getTitle());
        return sb.toString();
    }
    
}
