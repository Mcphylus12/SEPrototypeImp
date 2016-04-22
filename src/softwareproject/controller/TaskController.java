package softwareproject.controller;

import java.util.ArrayList;
import softwareproject.model.Task;

public class TaskController {
    
    public static String getStringFromTask(Task t){
        StringBuilder sb = new StringBuilder();
        sb.append(t.getTitle());
        return sb.toString();
    }
    
    public static Task createNewTask(
            String title, 
            String description, 
            int hours,
            ArrayList<Task> dependencies){
        
        return new Task(title, description, hours, dependencies);
    }
}
