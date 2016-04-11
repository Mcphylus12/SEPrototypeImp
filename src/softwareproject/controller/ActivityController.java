package softwareproject.controller;

import softwareproject.model.Activity;

public class ActivityController {
    
    public static String getActivityAsString(Activity act){
        StringBuilder sb = new StringBuilder();
        sb.append(act.getName()).append(". Type: ").append(act.getActivityType().name().toLowerCase())
                .append(" - ");
        if(act.getIsFinished())
            sb.append("Complete");
        else
            sb.append("In progress");
               
        
        return sb.toString();
    }
    
}
