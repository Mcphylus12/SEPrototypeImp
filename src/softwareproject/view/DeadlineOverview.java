/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.view;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import softwareproject.controller.FormController;
import softwareproject.controller.ListPopulator;
import softwareproject.model.Activity;
import softwareproject.model.Assessment;
import softwareproject.model.Module;
import softwareproject.model.StudyTask;

/**
 *
 * @author qxz14sru
 */
public class DeadlineOverview extends javax.swing.JFrame implements ListCellRenderer<Assessment>{
    
    ArrayList<Module> m;
    
    /**
     * Creates new form DeadlineDashboard
     */
    public DeadlineOverview(ArrayList<Module> m) {
        this.m = m;
        initComponents();
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        btnClose = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstCompleted = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstUpcoming = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstMissed = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        lstCompleted.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(lstCompleted);

        lstUpcoming.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(lstUpcoming);

        lstMissed.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(lstMissed);

        jLabel1.setText("Deadline Overview");

        jLabel2.setText("Upcoming Deadlines");

        jLabel3.setText("Completed Deadlines");

        jLabel4.setText("Missed Deadlines");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnClose))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 24, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        FormController.closeWindow(this);
    }//GEN-LAST:event_btnCloseActionPerformed
    
    private void fillComponents(){
        ArrayList<Assessment> missed = new ArrayList<>();
        ArrayList<Assessment> upcoming = new ArrayList<>();
        ArrayList<Assessment> completed = new ArrayList<>();
        
        for(Module m: m){
            for(Assessment a: m.getAssessments()){
                int totalTaskHours = 0;
                int totalTaskCompHours = 0;
                for(StudyTask t: a.getTasks()){
                    totalTaskHours += t.getHours();
                    for(Activity act: t.getActivities()){
                        totalTaskCompHours += act.getHours();
                    }
                }
                if(totalTaskCompHours == totalTaskHours){
                    completed.add(a);
                }else if(a.getDueDate().after(new Date())){
                    missed.add(a);
                }else{
                    upcoming.add(a);
                }
                if(totalTaskHours == 0){
                    a.setProgress(100);
                }else{
                    a.setProgress((100*totalTaskCompHours)/totalTaskHours);
                }
            }
        }
        ListPopulator<Assessment> alp = new ListPopulator<>();
        alp.populateJList(missed, lstMissed);
        lstMissed.setCellRenderer(this);
        alp.populateJList(upcoming, lstUpcoming);
        lstUpcoming.setCellRenderer(this);
        alp.populateJList(completed, lstCompleted);
        lstCompleted.setCellRenderer(this);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList lstCompleted;
    private javax.swing.JList lstMissed;
    private javax.swing.JList lstUpcoming;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getListCellRendererComponent(JList<? extends Assessment> jlist, Assessment e, int i, boolean bln, boolean bln1) {
        deadlineListCell cellPane = new deadlineListCell(e.getProgress(), e);
        if(bln){
            cellPane.setBackground(Color.gray);
        }
        
        return cellPane;
    }
}