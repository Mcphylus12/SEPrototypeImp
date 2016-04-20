package softwareproject.controller;

import java.util.ArrayList;
import java.util.Date;
import softwareproject.model.Milestone;
import softwareproject.model.Task;

public class MilestoneController {
    public static Milestone createNewMilestone(
            String title, 
            String description, 
            String day, 
            String month,
            String year, 
            ArrayList<Task> relatedTasks)
    {
        Date date = FormController.getDateFromStrings(day, month, year);
        
        return new Milestone(title, description, date, relatedTasks);
    }
}
