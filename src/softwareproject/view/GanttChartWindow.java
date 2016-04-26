package softwareproject.view;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import org.swiftgantt.Config;
import org.swiftgantt.GanttChart;
import org.swiftgantt.common.Time;
import org.swiftgantt.model.GanttModel;
import org.swiftgantt.model.Task;
import org.swiftgantt.ui.TimeUnit;
import softwareproject.model.Activity;
import softwareproject.model.Assessment;
import softwareproject.model.Milestone;
import softwareproject.model.Module;
import softwareproject.model.StudyTask;

/**
 *
 * @author qxz14sru
 */
public class GanttChartWindow extends JFrame{
    
    
    Module displayedModule;
    
    public GanttChartWindow(Date startDate, Date endDate, Module m){
        super("Gantt chart");
        displayedModule = m;
        
        Calendar start = Calendar.getInstance();
        start.setTime(startDate);
        Time KickOffTime = new Time(start);
        
        Calendar end = Calendar.getInstance();
        start.setTime(endDate);
        Time deadline = new Time(end);
        
        GanttChart gantt = new GanttChart();
        
        gantt.setTimeUnit(TimeUnit.Day);
        
        Config config = gantt.getConfig();
        
        GanttModel model = new GanttModel();
        model.setKickoffTime(KickOffTime);
        model.setDeadline(deadline);
        
        for(Assessment assess: m.getAssessments()){
            
            //Task taskGroup = new Task(assess.getName(), assess.getDueDate(), assess.getDueDate());
            
            for(StudyTask task: assess.getTasks()){
                
            }
            
            for(Activity activity: assess.getActivities()){
                
            }
            
            for(Milestone milestone: assess.getMilestones()){
                
            }
        }
        
    }
    
}
