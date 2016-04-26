package softwareproject.view;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import softwareproject.controller.ActivityController;
import softwareproject.controller.ErrorController;
import softwareproject.controller.FormController;
import softwareproject.controller.ListPopulator;
import softwareproject.model.Activity;
import softwareproject.model.Assessment;
import softwareproject.model.Module;
import softwareproject.model.StudyTask;

/**
 *
 * @author Danny
 */
public class ActivityForm extends javax.swing.JFrame {
    private Module m;
    private ModuleOverview mo;
    private ArrayList<StudyTask> t;
    private int timeAvailable;
    private boolean validTitle;
    private boolean validDescription;
    private boolean validType;
    private boolean validTask;
    private boolean validTime;
    /**
     * Creates new form ActivityForm
     */
    public ActivityForm(Module m, ModuleOverview mo) {
        validTitle = false;
        validDescription = false;
        validType = false;
        validTask = false;
        validTime = false;
        
        this.m = m;
        this.mo = mo;
        t = new ArrayList();
        initComponents();
        lblHoursError.setVisible(false);
        fillComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblType = new javax.swing.JLabel();
        lblTasks = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblActivityForm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTasks = new javax.swing.JList();
        lblDesc = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        lblHours = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        lblHoursAvailable = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblHoursError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblType.setText("Activity Type");

        lblTasks.setText("Attach Task");

        txtTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTitleFocusLost(evt);
            }
        });

        lblTitle.setText("Title");

        btnSave.setText("Add Activity");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lblActivityForm.setText("Activity Form");

        lstTasks.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTasksValueChanged(evt);
            }
        });
        lstTasks.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lstTasksFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lstTasksFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(lstTasks);

        lblDesc.setText("Description");

        txtDesc.setColumns(20);
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setWrapStyleWord(true);
        txtDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtDesc);

        lblHours.setText("Time (Hours)");

        txtHours.setEnabled(false);
        txtHours.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoursFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoursFocusLost(evt);
            }
        });

        lblHoursAvailable.setText("Select Task(s)");

        txtType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTypeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTypeFocusLost(evt);
            }
        });

        jLabel1.setText("Select one or more");
        jLabel1.setEnabled(false);

        jLabel2.setText("All Fields are required");
        jLabel2.setEnabled(false);

        lblHoursError.setText("Must Be a positive number.");
        lblHoursError.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblActivityForm)
                            .addComponent(lblTitle))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lblType))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblTasks)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1))
                        .addComponent(lblDesc, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSave)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClose)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHours)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHoursError, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHoursAvailable)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblActivityForm)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(lblType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTasks)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHours)
                    .addComponent(lblHoursError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoursAvailable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClose)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(!validDescription || !validTitle || !validType || !validTask || !validTime){
            ErrorController.setErrorBackground(validDescription, txtDesc);
            ErrorController.setErrorBackground(validTitle, txtTitle);
            ErrorController.setErrorBackground(validType, txtType);
            ErrorController.setErrorBackground(validTask, lstTasks);
            ErrorController.setErrorBackground(validTime, txtHours);
            if(!validTime)
                lblHoursError.setVisible(true);
            JOptionPane.showMessageDialog(new JFrame(), "Please Correct Errors in Red.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            Activity act = ActivityController.createActivity(txtTitle.getText(), 
                    txtDesc.getText(), 
                    Integer.parseInt(txtHours.getText()), 
                    txtType.getText(),
                    new ArrayList(lstTasks.getSelectedValuesList()));
            mo.fillComponents();

            for(StudyTask t: act.getTasks()){
                t.addActivity(act);
            }

            FormController.closeWindow(this);  
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void lstTasksValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTasksValueChanged
        timeAvailable = 0;
        ArrayList<StudyTask> tasks = new ArrayList<>(lstTasks.getSelectedValuesList());
        for(StudyTask t: tasks){
            if(timeAvailable == 0 || t.getHours() < timeAvailable){
                timeAvailable = t.getHours();
                for(Activity a: t.getActivities()){
                    timeAvailable -= a.getHours();
                }
            }
        }
        lblHoursAvailable.setText(Integer.toString(timeAvailable)+" Hour(s) Available");
        txtHours.setEnabled(true);
    }//GEN-LAST:event_lstTasksValueChanged

    private void txtTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleFocusGained
        ErrorController.resetColour(evt);
    }//GEN-LAST:event_txtTitleFocusGained

    private void txtTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleFocusLost
        //Title Empty Validation
        validTitle = ErrorController.txtEmptyValidation(txtTitle.getText());
        ErrorController.setErrorBackground(validTitle, txtTitle);
    }//GEN-LAST:event_txtTitleFocusLost

    private void txtTypeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeFocusGained
        ErrorController.resetColour(evt);
    }//GEN-LAST:event_txtTypeFocusGained

    private void txtTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeFocusLost
        //Type Empty Validation
        validType = ErrorController.txtEmptyValidation(txtType.getText());
        ErrorController.setErrorBackground(validType, txtType);
    }//GEN-LAST:event_txtTypeFocusLost

    private void txtDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescFocusGained
        ErrorController.resetColour(evt);
    }//GEN-LAST:event_txtDescFocusGained

    private void txtDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescFocusLost
        //Description Empty Validation
        validDescription = ErrorController.txtEmptyValidation(txtDesc.getText());
        ErrorController.setErrorBackground(validDescription, txtDesc);
    }//GEN-LAST:event_txtDescFocusLost

    private void lstTasksFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstTasksFocusLost
        //TaskList Empty Validation
        validTask = ErrorController.listSelectionValidation(lstTasks);
        ErrorController.setErrorBackground(validTask, lstTasks);
    }//GEN-LAST:event_lstTasksFocusLost

    private void lstTasksFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lstTasksFocusGained
        ErrorController.resetColour(evt);
    }//GEN-LAST:event_lstTasksFocusGained

    private void txtHoursFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoursFocusGained
        ErrorController.resetColour(evt);
    }//GEN-LAST:event_txtHoursFocusGained

    private void txtHoursFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoursFocusLost
        //Hours positive int validation
        validTime = ErrorController.intValidation(txtHours);
        if(validTime){
            validTime = Integer.parseInt(txtHours.getText()) <= timeAvailable;
        }
        
        ErrorController.setErrorBackground(validTime, txtHours);
        lblHoursError.setVisible(!validTime);
    }//GEN-LAST:event_txtHoursFocusLost
    
    public void fillComponents(){
        ListPopulator<StudyTask> lp = new ListPopulator();
        for(Assessment a: m.getAssessments()){
            for(StudyTask task: a.getTasks()){
                t.add(task);
            }
        }
        lp.populateJList(t, lstTasks);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblActivityForm;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblHoursAvailable;
    private javax.swing.JLabel lblHoursError;
    private javax.swing.JLabel lblTasks;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblType;
    private javax.swing.JList lstTasks;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtType;
    // End of variables declaration//GEN-END:variables
}
