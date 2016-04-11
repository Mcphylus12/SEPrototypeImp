package softwareproject.controller;

import java.util.ArrayList;
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
    
}
