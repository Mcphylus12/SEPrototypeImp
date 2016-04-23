/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproject.view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import softwareproject.controller.AssessmentController;
import softwareproject.controller.ErrorController;
import softwareproject.controller.FormController;
import softwareproject.controller.ListPopulator;
import softwareproject.controller.TaskController;
import softwareproject.model.Assessment;
import softwareproject.model.Module;
import softwareproject.model.Task;

/**
 *
 * @author Danny
 */
public class TaskForm extends javax.swing.JFrame {
    private Module m;
    private ModuleOverview mo;
    private boolean validTitle;
    private boolean validDescription;
    private boolean validHours;
    
    /**
     * Creates new form TaskForm
     */
    public TaskForm(Module m, ModuleOverview mo) {
        validTitle = false;
        validDescription = false;
        validHours = false;
        
        this.m = m;
        this.mo = mo;
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

        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblTaskForm = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDepend = new javax.swing.JList();
        lblDepend = new javax.swing.JLabel();
        cmbAssessment = new javax.swing.JComboBox();
        lblAssessment = new javax.swing.JLabel();
        lblHours = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        lblHoursError = new javax.swing.JLabel();
        lblReq = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSave.setText("Save");
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

        lblTaskForm.setText("Task Form");

        lblTitle.setText("Title*");

        txtTitle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTitleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTitleFocusLost(evt);
            }
        });

        lblDesc.setText("Description*");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        txtDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtDesc);

        jScrollPane2.setViewportView(lstDepend);

        lblDepend.setText("Dependencies");

        cmbAssessment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAssessment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAssessmentActionPerformed(evt);
            }
        });

        lblAssessment.setText("Assessment");

        lblHours.setText("Time (Hours)*");

        txtHours.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoursFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoursFocusLost(evt);
            }
        });

        lblHoursError.setText("Must Be a positive number.");
        lblHoursError.setEnabled(false);

        lblReq.setText("Fields Marked with * are required");
        lblReq.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblReq, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaskForm)
                            .addComponent(lblDesc)
                            .addComponent(lblDepend)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTitle))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAssessment)
                                    .addComponent(cmbAssessment, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtHours, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHours, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHoursError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTaskForm)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(lblAssessment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAssessment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHours)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoursError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblDepend)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClose)
                    .addComponent(lblReq))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed

        FormController.closeWindow(this);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(!validDescription || !validTitle || !validHours){
            ErrorController.setErrorBackground(validDescription, txtDesc);
            ErrorController.setErrorBackground(validTitle, txtTitle);
            ErrorController.setErrorBackground(validHours, txtHours);
            if(!validHours)
                lblHoursError.setVisible(true);
            JOptionPane.showMessageDialog(new JFrame(), "Please Correct Errors in Red.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            Task t = TaskController.createNewTask(txtTitle.getText(), txtDesc.getText(), 
                    Integer.parseInt(txtHours.getText()), 
                    new ArrayList(lstDepend.getSelectedValuesList()));
            Assessment selectedAssess = (Assessment)cmbAssessment.getSelectedItem();
            AssessmentController.attachTask(selectedAssess, t);
            mo.setSelectedAssignment(selectedAssess);
            mo.fillComponents();

            FormController.closeWindow(this);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbAssessmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAssessmentActionPerformed
        lstDepend.removeAll();
        Assessment a = (Assessment)cmbAssessment.getSelectedItem();
        ListPopulator<Task> lp = new ListPopulator();
        if(a != null){
            lp.populateJList(a.getTasks(), lstDepend);
        }
    }//GEN-LAST:event_cmbAssessmentActionPerformed

    private void txtTitleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleFocusLost
        //Title Empty Validation
        validTitle = ErrorController.txtEmptyValidation(txtTitle.getText());
        if(!validTitle){
            txtTitle.setBackground(Color.RED);
        }else{
            txtTitle.setBackground(UIManager.getColor("TextField.background"));
        }
    }//GEN-LAST:event_txtTitleFocusLost

    private void txtTitleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTitleFocusGained
        ErrorController.resetColour(evt);
    }//GEN-LAST:event_txtTitleFocusGained

    private void txtDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescFocusLost
        //Description Empty Validation
        validDescription = ErrorController.txtEmptyValidation(txtDesc.getText());
        if(!validDescription){
            txtDesc.setBackground(Color.RED);
        }else{
            txtDesc.setBackground(UIManager.getColor("TextField.background"));
        }
    }//GEN-LAST:event_txtDescFocusLost

    private void txtDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescFocusGained
        ErrorController.resetColour(evt);
    }//GEN-LAST:event_txtDescFocusGained

    private void txtHoursFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoursFocusLost
        //Hours positive int validation
        validHours = ErrorController.intValidation(txtHours);
        lblHoursError.setVisible(!validHours);
    }//GEN-LAST:event_txtHoursFocusLost

    private void txtHoursFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoursFocusGained
        ErrorController.resetColour(evt);
    }//GEN-LAST:event_txtHoursFocusGained
    
    public void fillComponents(){
        ListPopulator<Assessment> lp = new ListPopulator();
        lp.populateComboBox(m.getAssessments(), cmbAssessment);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbAssessment;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAssessment;
    private javax.swing.JLabel lblDepend;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblHoursError;
    private javax.swing.JLabel lblReq;
    private javax.swing.JLabel lblTaskForm;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList lstDepend;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
