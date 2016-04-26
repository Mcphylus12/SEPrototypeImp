package softwareproject.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

public class FormController {
    public static void closeWindow(JFrame jf){
        jf.setVisible(false);
        jf.dispose();
    }
    
    public static Date getDateFromStrings(String dateString){
        String dateStr = dateString;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
            date = sd.parse(dateStr);
        } catch (ParseException ex) {
            System.out.println("Failed to parse date " + dateStr);
        }
        
        return date;
    }
}


