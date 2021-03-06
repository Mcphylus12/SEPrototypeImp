package softwareproject.view;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import softwareproject.controller.ListPopulator;
import softwareproject.model.Activity;
import softwareproject.model.Assessment;
import softwareproject.model.CourseTest;
import softwareproject.model.Coursework;
import softwareproject.model.Exam;
import softwareproject.model.Milestone;
import softwareproject.model.Module;
import softwareproject.model.SemesterProfile;
import softwareproject.model.StudyTask;

/**
 *
 * @author qxz14sru
 */
public class ModuleOverview extends javax.swing.JPanel {
    
    Assessment selectedAssessment;
    Module m;
    SemesterProfile sp;
    /**
     * Creates new form ModuleOverview
     */
    public ModuleOverview(SemesterProfile sp, Module m) {
        this.selectedAssessment = null;
        this.m = m;
        this.sp = sp;
        initComponents();
        loadAssessments();
        lstCoursework.setSelectedIndex(0);
    }
    
    public void setSelectedAssignment(Assessment a){
        this.selectedAssessment = a;
    }
    
    public void fillComponents(){
        DefaultListModel<StudyTask> lmtComp = new DefaultListModel();
        DefaultListModel<StudyTask> lmt = new DefaultListModel();
        ListPopulator<Activity> lpAct = new ListPopulator();
        ListPopulator<Milestone> lpMile = new ListPopulator();
        
        for(StudyTask t: this.selectedAssessment.getTasks()){
            if(t.getIsComplete()){
                lmtComp.addElement(t);
            }else{
                lmt.addElement(t);
            }
        }
        lstCompletedTasks.setModel(lmtComp);
        lstCurrentTasks.setModel(lmt);
        
        //lpTask.populateJList(this.selectedAssessment.getTasks(), lstCurrentTasks);
        lpMile.populateJList(this.selectedAssessment.getMilestones(), lstMilestones);
        lpAct.populateJList(this.selectedAssessment.getActivities(), lstActivities);
    }
    
    public void loadAssessments(){
        lblModTitle.setText(m.getModuleName() + " - " + m.getModuleCode());
        DefaultListModel<Exam> lme = new DefaultListModel();
        DefaultListModel<Coursework> lmcw = new DefaultListModel();
        DefaultListModel<CourseTest> lmct = new DefaultListModel();
        
        for(Assessment a : m.getAssessments()){
            if(a instanceof Exam){
                lme.addElement((Exam)a);
            }
            else if(a instanceof Coursework){
                lmcw.addElement((Coursework) a);
            }
            else {
                lmct.addElement((CourseTest) a);
            }
        }
        lstExam.setModel(lme);
        lstCoursework.setModel(lmcw);
        lstCourseTest.setModel(lmct);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddTask = new javax.swing.JButton();
        btnAddMilestone = new javax.swing.JButton();
        btnAddActivity = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCoursework = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCourseTest = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstExam = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstCurrentTasks = new javax.swing.JList();
        lblCourseTest = new javax.swing.JLabel();
        lblExam = new javax.swing.JLabel();
        lblCoursework = new javax.swing.JLabel();
        lblCurrentTasks = new javax.swing.JLabel();
        lblModTitle = new javax.swing.JLabel();
        lblMilestones = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstMilestones = new javax.swing.JList();
        lblCompletedTasks = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstCompletedTasks = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        lblCompletedTasks1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstActivities = new javax.swing.JList();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(585, 562));
        setMinimumSize(new java.awt.Dimension(585, 562));

        btnAddTask.setText("Add Task");
        btnAddTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTaskActionPerformed(evt);
            }
        });

        btnAddMilestone.setText("Add Milestone");
        btnAddMilestone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMilestoneActionPerformed(evt);
            }
        });

        btnAddActivity.setText("Add Activity");
        btnAddActivity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActivityActionPerformed(evt);
            }
        });

        lstCoursework.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCoursework.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCourseworkValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCoursework);

        lstCourseTest.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCourseTest.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCourseTestValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstCourseTest);

        lstExam.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstExam.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstExamValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstExam);

        lstCurrentTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCurrentTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCurrentTasksMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(lstCurrentTasks);

        lblCourseTest.setText("Course Test");

        lblExam.setText("Exams");

        lblCoursework.setText("Coursework");

        lblCurrentTasks.setText("Current Tasks");

        lblModTitle.setText("MODULE TITLE");

        lblMilestones.setText("Milestones");

        lstMilestones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMilestones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMilestonesMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(lstMilestones);

        lblCompletedTasks.setText("Completed Tasks");

        lstCompletedTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCompletedTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCompletedTasksMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(lstCompletedTasks);

        jButton1.setText("View Gantt Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblCompletedTasks1.setText("Activities");

        lstActivities.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstActivities.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstActivitiesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(lstActivities);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddTask)
                .addGap(18, 18, 18)
                .addComponent(btnAddMilestone)
                .addGap(18, 18, 18)
                .addComponent(btnAddActivity)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCurrentTasks)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(lblCompletedTasks)
                            .addComponent(lblCompletedTasks1)
                            .addComponent(jScrollPane6)
                            .addComponent(lblMilestones)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane5))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblExam)
                            .addComponent(lblCourseTest)
                            .addComponent(lblCoursework))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblModTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoursework)
                    .addComponent(lblCurrentTasks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lblCompletedTasks))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMilestones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCompletedTasks1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblExam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCourseTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTask)
                    .addComponent(btnAddMilestone)
                    .addComponent(btnAddActivity)
                    .addComponent(jButton1))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMilestoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMilestoneActionPerformed
        if(lstCurrentTasks.getModel().getSize() > 0){
            MilestoneForm mf = new MilestoneForm(m, this);
        mf.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "No Tasks available to add a Milestone to.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddMilestoneActionPerformed

    private void btnAddTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTaskActionPerformed
        TaskForm tf = new TaskForm(m, this);
        tf.setVisible(true);
    }//GEN-LAST:event_btnAddTaskActionPerformed

    private void lstCurrentTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCurrentTasksMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            TaskWindow tw = new TaskWindow((StudyTask)list.getSelectedValue(), selectedAssessment, this);
            tw.setVisible(true);
        }
    }//GEN-LAST:event_lstCurrentTasksMouseClicked

    private void lstCourseworkValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCourseworkValueChanged
        this.selectedAssessment = (Assessment)lstCoursework.getSelectedValue();
        lstExam.clearSelection();
        lstCourseTest.clearSelection();
        if(this.selectedAssessment != null){
            fillComponents();
        }
    }//GEN-LAST:event_lstCourseworkValueChanged

    private void lstExamValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstExamValueChanged
        this.selectedAssessment = (Assessment)lstExam.getSelectedValue();
        lstCoursework.clearSelection();
        lstCourseTest.clearSelection();
        if(this.selectedAssessment != null){
            fillComponents();
        }
    }//GEN-LAST:event_lstExamValueChanged

    private void lstCourseTestValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCourseTestValueChanged
        this.selectedAssessment = (Assessment)lstCourseTest.getSelectedValue();
        lstExam.clearSelection();
        lstCoursework.clearSelection();
        if(this.selectedAssessment != null){
            fillComponents();
        }
    }//GEN-LAST:event_lstCourseTestValueChanged

    private void btnAddActivityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActivityActionPerformed
        if(lstCurrentTasks.getModel().getSize() > 0){
            ActivityForm af = new ActivityForm(selectedAssessment, m, this);
            af.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "No Tasks available to add an activity to.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnAddActivityActionPerformed

    private void lstMilestonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMilestonesMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            MilestoneWindow mw = new MilestoneWindow((Milestone)list.getSelectedValue(), selectedAssessment, this);
            mw.setVisible(true);
        }
    }//GEN-LAST:event_lstMilestonesMouseClicked

    private void lstCompletedTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCompletedTasksMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            TaskWindow tw = new TaskWindow((StudyTask)list.getSelectedValue(), selectedAssessment, this);
            tw.setVisible(true);
        }
    }//GEN-LAST:event_lstCompletedTasksMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GanttChartWindow gantt = new GanttChartWindow(sp.getStartDate(), sp.getEndDate(), m);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lstActivitiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstActivitiesMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            ActivityWindow aw = new ActivityWindow((Activity)list.getSelectedValue(), selectedAssessment, this);
            aw.setVisible(true);
        }
    }//GEN-LAST:event_lstActivitiesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddActivity;
    private javax.swing.JButton btnAddMilestone;
    private javax.swing.JButton btnAddTask;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblCompletedTasks;
    private javax.swing.JLabel lblCompletedTasks1;
    private javax.swing.JLabel lblCourseTest;
    private javax.swing.JLabel lblCoursework;
    private javax.swing.JLabel lblCurrentTasks;
    private javax.swing.JLabel lblExam;
    private javax.swing.JLabel lblMilestones;
    private javax.swing.JLabel lblModTitle;
    private javax.swing.JList lstActivities;
    private javax.swing.JList lstCompletedTasks;
    private javax.swing.JList lstCourseTest;
    private javax.swing.JList lstCoursework;
    private javax.swing.JList lstCurrentTasks;
    private javax.swing.JList lstExam;
    private javax.swing.JList lstMilestones;
    // End of variables declaration//GEN-END:variables
}
