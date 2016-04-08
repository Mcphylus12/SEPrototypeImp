package softwareproject.model;

import java.util.Date;

public class CourseTest extends Assessment {
    private String websiteURL;
    private Date dueDate;

    public CourseTest(String websiteURL, Date dueDate, boolean isSummative, boolean isOnline, int weight) {
        super(isSummative, isOnline, weight);
        this.websiteURL = websiteURL;
        this.dueDate = dueDate;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }


    
    
    
}