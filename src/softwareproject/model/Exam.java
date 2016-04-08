package softwareproject.model;

import java.util.Date;

public class Exam {
    private int duration;
    private String location;
    private Date date;

    public Exam(int duration, String location, Date date) {
        this.duration = duration;
        this.location = location;
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
     
}