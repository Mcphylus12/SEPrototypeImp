package softwareproject.model;

public class Student {
    private int studentNo;
    private SemesterProfile studySemProfile;

    public Student(int studentNo, SemesterProfile studySemProfile) {
        this.studentNo = studentNo;
        this.studySemProfile = studySemProfile;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public SemesterProfile getStudySemProfile() {
        return studySemProfile;
    }

    public void setStudySemProfile(SemesterProfile studySemProfile) {
        this.studySemProfile = studySemProfile;
    }
    
    
}