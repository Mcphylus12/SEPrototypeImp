package softwareproject.model;

import java.util.ArrayList;

public class Activity {
    private String activityType;
    private ArrayList<Note> notes;
    private boolean isFinished;

    public Activity(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityType() {
        return activityType;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public boolean isIsFinished() {
        return isFinished;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
    
    
}