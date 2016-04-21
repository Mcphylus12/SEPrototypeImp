package softwareproject.model;

import java.util.ArrayList;

public class Task implements Notable{
    private String title;
    private String description;
    private ArrayList<Task> dependencies;
    private ArrayList<Note> notes;
    private int hours;
    private int progress;
    

    public Task(String title, String description, int hours,  ArrayList<Task> dependencies) {
        this.title=title;
        this.description = description;
        this.hours = hours;
        this.progress = 0;
        this.dependencies = dependencies;
        this.notes = new ArrayList();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Task> getDependencies() {
        return dependencies;
    }

    public void setDependencies(ArrayList<Task> dependencies) {
        this.dependencies = dependencies;
    }
    
    public void addDependency(Task t){
        dependencies.add(t);
    }
    
    public void removeDependency(Task t){
       dependencies.remove(t);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }
    
        
    public void addNote(Note t){
        notes.add(t);
    }
    
    public void removeNote(Note t){
       notes.remove(t);
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.title).append(" - ").append(this.description);
        return sb.toString();
    }
}