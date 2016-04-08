package softwareproject.model;

import java.util.ArrayList;
import java.util.Date;

public class ModuleSchedule {
    private ArrayList<Exam> exams;
    private ArrayList<CourseTest> courseTests;
    private ArrayList<Coursework> courseWork;
    private ArrayList<Date> lectureTimes;
    private ArrayList<Date> seminarTimes;
    private ArrayList<Date> labTimes;

    public ModuleSchedule() {
        courseTests = new ArrayList();
        courseWork = new ArrayList();
        exams = new ArrayList();
        labTimes = new ArrayList();
        lectureTimes = new ArrayList();
        seminarTimes = new ArrayList();
    }
    
    

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }
    
    public void addExam(Exam e){
        exams.add(e);
    }

    public void removeExam(Exam e){
        exams.remove(e);
    }
    
    public ArrayList<CourseTest> getCourseTests() {
        return courseTests;
    }

    public void setCourseTests(ArrayList<CourseTest> courseTests) {
        this.courseTests = courseTests;
    }
    
    public void addCourseTest(CourseTest e){
        courseTests.add(e);
    }

    public void removeCourseTest(CourseTest e){
        courseTests.remove(e);
    }

    public ArrayList<Coursework> getCourseWork() {
        return courseWork;
    }

    public void setCourseWork(ArrayList<Coursework> courseWork) {
        this.courseWork = courseWork;
    }
    
    public void addCoursework(Coursework e){
        courseWork.add(e);
    }

    public void removeCoursework(Coursework e){
        courseWork.remove(e);
    }

    public ArrayList<Date> getLectureTimes() {
        return lectureTimes;
    }

    public void setLectureTimes(ArrayList<Date> lectureTimes) {
        this.lectureTimes = lectureTimes;
    }
    
    public void addLectureTime(Date e){
        lectureTimes.add(e);
    }

    public void removeLectureTime(Date e){
        lectureTimes.remove(e);
    }

    public ArrayList<Date> getSeminarTimes() {
        return seminarTimes;
    }

    public void setSeminarTimes(ArrayList<Date> seminarTimes) {
        this.seminarTimes = seminarTimes;
    }
    
    public void addSeminarTime(Date e){
        seminarTimes.add(e);
    }

    public void removeSeminarTime(Date e){
        seminarTimes.remove(e);
    }

    public ArrayList<Date> getLabTimes() {
        return labTimes;
    }

    public void setLabTimes(ArrayList<Date> labTimes) {
        this.labTimes = labTimes;
    }
    
    public void addLabTime(Date e){
        labTimes.add(e);
    }

    public void removeLabTime(Date e){
        labTimes.remove(e);
    }
    
    
    
    
}