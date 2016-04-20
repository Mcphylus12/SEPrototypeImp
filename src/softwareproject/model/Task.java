package softwareproject.model;

import java.util.ArrayList;
import java.util.Date;

public class Task implements Notable{
    private String title;
    private String description;
    private ArrayList<Task> dependencies;
    private ArrayList<Note> notes;
    private Date startDate;
    private Date endDate;
    private int progress;
    

    public Task(String title, String description, Date endDate, ArrayList<Task> dependencies) {
        this.title=title;
        this.description = description;
        this.startDate = new Date();
        this.endDate = endDate;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
}