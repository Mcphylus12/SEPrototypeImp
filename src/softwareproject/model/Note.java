package softwareproject.model;

import java.util.Date;

public class Note {
    private String name;
    private String contents;
    private Date dateCreated;

    public Note(String name, String contents, Date dateCreated) {
        this.name = name;
        this.contents = contents;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    
}