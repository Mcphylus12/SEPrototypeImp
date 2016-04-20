package softwareproject.controller;

import java.util.ArrayList;
import java.util.Date;
import softwareproject.model.Activity;
import softwareproject.model.Assessment;
import softwareproject.model.Task;

public class TaskController {
    
    public static ArrayList<Activity> getsActivitesByTask(Task t, Assessment as){
        ArrayList<Activity> act = new ArrayList();
        for(Activity a : as.getActivities()){
            for(Task t1 : a.getTasks()){
                if(t1 == t){
                    act.add(a);
                }
            }
        }
        return act;
    }
    
    public static String getStringFromTask(Task t){
        StringBuilder sb = new StringBuilder();
        sb.append(t.getDescription());
        return sb.toString();
    }
    
    public static Task createNewTask(
            String title, 
            String description, 
            String day, 
            String month, 
            String year, 
            ArrayList<Task> dependencies){
        
        Date date = FormController.getDateFromStrings(day, month, year);
        
        return new Task(title, description, date, dependencies);
    }
    
}
