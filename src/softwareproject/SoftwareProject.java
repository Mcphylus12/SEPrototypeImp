package softwareproject;

import java.util.Date;
import javax.swing.JFrame;
import softwareproject.controller.PanelController;
import softwareproject.model.Activity;
import softwareproject.model.Activity.ActivityType;
import softwareproject.model.CourseTest;
import softwareproject.model.Coursework;
import softwareproject.model.Exam;
import softwareproject.model.Module;
import softwareproject.model.ModuleOrganiser;
import softwareproject.model.ModuleSchedule;
import softwareproject.model.Note;
import softwareproject.model.SemesterProfile;
import softwareproject.model.Task;
import softwareproject.view.DashBoardPanel;
import softwareproject.view.ModuleOverview;
import softwareproject.view.NavPane;
import softwareproject.view.OverviewDash;
import softwareproject.view.TaskWindow;
import softwareproject.view.Window;

/**
 *
 * @author ybm14yju
 */
public class SoftwareProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SemesterProfile semp = new SemesterProfile(2015, new Date(), new Date());
        ModuleSchedule ms= new ModuleSchedule();
        
        Module m = new Module(new ModuleOrganiser("Mr Organiser", null), "CMP-555Y", "Software", ms);
        Module m2 = new Module(new ModuleOrganiser("Mr Organiser", null), "CMP-555Y", "Software", ms);
        Module m3 = new Module(new ModuleOrganiser("Mr Organiser", null), "CMP-555Y", "Software", ms);
        Module m4 = new Module(new ModuleOrganiser("Mr Organiser", null), "CMP-555Y", "Software", ms);
        Module m5 = new Module(new ModuleOrganiser("Mr Organiser", null), "CMP-555Y", "Software", ms);
        Module m6 = new Module(new ModuleOrganiser("Mr Organiser", null), "CMP-555Y", "Software", ms);
        Module m7 = new Module(new ModuleOrganiser("Mr Organiser", null), "CMP-555Y", "Software", ms);
        Module m8 = new Module(new ModuleOrganiser("Mr Organiser", null), "CMP-555Y", "Software", ms);
        
        Coursework cw = new Coursework("Cw1", new Date(), new Date(), new Date(), "marker", "sub", true, true, 10);
        Activity a = new Activity("Activity1", ActivityType.CODING);
        Task tas = new Task("BLAH", null, null);
        
        cw.addTask(tas);
        cw.addActivity(a);
        
        m.addAssessment(cw);
        semp.addModule(m);
        semp.addModule(m2);
        semp.addModule(m3);
        semp.addModule(m4);
        semp.addModule(m5);
        semp.addModule(m6);
        semp.addModule(m7);
        semp.addModule(m8);
        Window window = new Window("Study Planner V0.0.0.0.0.0.0.2r90765w2.36");
        NavPane nav = new NavPane(semp);
        PanelController pa = new PanelController(window, nav);
        nav.setPanelController(pa);
        OverviewDash overviewDashboard = new OverviewDash(pa);
        overviewDashboard.setsemP(semp);
        
        pa.setOd(overviewDashboard);
        pa.toOverViewDash();
        
//        tas.addNote(new Note("foo", "bar", new Date()));
//        tas.addNote(new Note("foo", "barbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbarbar", new Date()));
//        tas.addNote(new Note("foo", "bar", new Date()));
//        tas.addNote(new Note("foo", "bar", new Date()));
//        
//        
//        TaskWindow tw = new TaskWindow(tas, new Exam("name", 0, "", new Date(), false, 0));
//        tw.setVisible(true);
//        tw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
