package softwareproject.model;

import java.util.ArrayList;
import java.util.Date;

public class SemesterProfile {
    private int year;
    private ArrayList<Module> modules;
    private Date startDate;
    private Date endDate;

    public SemesterProfile(int year, Date startDate, Date endDate) {
        this.year = year;
        this.modules = new ArrayList();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
    
    public void addModule(Module m){
        modules.add(m);
    }
            
    public void removeModule(Module m){
        modules.remove(m);
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
}