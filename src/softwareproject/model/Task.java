package softwareproject.model;

import java.util.ArrayList;
import java.util.Date;

public class Task {
    private String description;
    private ArrayList<Task> dependencies;
    private Date startDate;
    private Date endDate;
    private int progress;
    private ArrayList<Milestone> milestones;
    private ArrayList<Note> notes;

    public Task(String description, Date startDate, Date endDate, int progress) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.progress = progress;
        dependencies = new ArrayList();
        milestones = new ArrayList();
        notes = new ArrayList();
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

    public ArrayList<Milestone> getMilestones() {
        return milestones;
    }

    public void setMilestones(ArrayList<Milestone> milestones) {
        this.milestones = milestones;
    }
    
    public void addMilestone(Milestone t){
        milestones.add(t);
    }
    
    public void removeMilestone(Milestone t){
       milestones.remove(t);
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