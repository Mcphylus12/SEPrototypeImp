package softwareproject.model;

import java.util.Date;

public class Coursework extends Assessment {
    private Date dueDate;
    private Date setDate;
    private Date returnDate;
    private String marker;
    private String submissionType;

    public Coursework(Date dueDate, Date setDate, Date returnDate, String marker, String submissionType, boolean isSummative, boolean isOnline, int weight) {
        super(isSummative, isOnline, weight);
        this.dueDate = dueDate;
        this.setDate = setDate;
        this.returnDate = returnDate;
        this.marker = marker;
        this.submissionType = submissionType;
    }
    
    
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }
    
    
}