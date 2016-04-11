package softwareproject.controller;

import java.util.ArrayList;
import softwareproject.model.Assessment;
import softwareproject.model.CourseTest;
import softwareproject.model.Coursework;
import softwareproject.model.Exam;


public class AssessmentController {
    
    public static String getAssessmentAsString(Assessment as){
        StringBuilder sb = new StringBuilder();
        sb.append(as.getName()).append(" - ").append(as.getDueDate()).append(" - ").append(as.getWeight()).append("%");
        return sb.toString();
        
    }
    

}