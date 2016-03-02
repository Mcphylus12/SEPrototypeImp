package softwareproject.model;

import java.util.Date;

public class Task {
    private String description;
    private Task[] dependencies;
    private Date startDate;
    private Date endDate;
    private int progress;
    private Milestone[] milestones;
    private Note[] notes;
}