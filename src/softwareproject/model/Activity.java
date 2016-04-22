package softwareproject.model;

import java.util.ArrayList;

public class Activity implements Notable{
    private String name;
    private String description;
    private ArrayList<Note> notes;
    private ArrayList<Task> tasks;
    private boolean isFinished;
    private int hours;
    private String activityType;

    public Activity(String name, String description, int hours, String activityType, ArrayList<Task> tasks) {
        this.name = name;
        this.description = description;
        this.hours = hours;
        this.activityType = activityType;
        isFinished = false;
        notes = new ArrayList();
        this.tasks = tasks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
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
    
    @Override
    public void addNote(Note note){
        notes.add(note);
    }
    
    public void removeNote(Note note){
        notes.remove(note);
    }
    
    public void addTask(Task task){
        tasks.add(task);
    }
    
    public void removeTask(Task task){
        tasks.remove(task);
    }
    
    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(" - ").append(this.description).append(" - ");
        if(isFinished){
            sb.append(" Complete");
        }else
            sb.append(" In Progress");
        return sb.toString();
    }
}