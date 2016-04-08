package softwareproject.model;

import java.util.ArrayList;

public class Activity implements Notable{
    private String activityType;
    private ArrayList<Note> notes;
    private boolean isFinished;

    public Activity(String activityType) {
        this.activityType = activityType;
        isFinished = false;
        notes = new ArrayList();
    }

    public String getActivityType() {
        return activityType;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    /**
     * 
     * @return whether the activity is finished
     */
    public boolean getIsFinished() {
        return isFinished;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }
    
    public void addNote(Note note){
        notes.add(note);
    }
    
    public void removeNote(Note note){
        notes.remove(note);
    }
    
    

    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
    
    
}