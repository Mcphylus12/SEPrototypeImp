package softwareproject.model;

import java.util.ArrayList;
import java.util.Date;

public class Milestone {
    private String title;
    private String description;
    private boolean isComplete;
    private Date deadline;
    private ArrayList<Task> relatedTasks;

    public Milestone(String title, String description, Date deadline, ArrayList<Task> relatedTasks) {
        this.title = title;
        this.description = description;
        this.isComplete = false;
        this.deadline = deadline;
        this.relatedTasks = relatedTasks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public ArrayList<Task> getRelatedTasks() {
        return relatedTasks;
    }

    public void setRelatedTasks(ArrayList<Task> relatedTasks) {
        this.relatedTasks = relatedTasks;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.title).append(" - ").append(this.description);
        return sb.toString();
    }
}