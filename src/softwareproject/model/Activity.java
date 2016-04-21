package softwareproject.model;

import java.util.ArrayList;

public class Activity implements Notable{
    private String name;
    private String description;
    private ActivityType activityType;
    private ArrayList<Note> notes;
    private ArrayList<Task> tasks;
    private boolean isFinished;
    private int hours;
    public enum ActivityType {
        READING, RESEARCH, WRITING, CODING
    };

    public Activity(String name, String description, int hours, ActivityType activityType) {
        this.name = name;
        this.description = description;
        this.hours = hours;
        this.activityType = activityType;
        isFinished = false;
        notes = new ArrayList();
        tasks = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ActivityType getActivityType() {
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

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }
    
    @Override
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