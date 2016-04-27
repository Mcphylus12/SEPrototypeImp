package softwareproject.view;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import softwareproject.controller.AssessmentController;
import softwareproject.controller.ListPopulator;
import softwareproject.model.Assessment;
import softwareproject.model.StudyTask;

/**
 *
 * @author ybm14yju
 */
public class deadlineListCell extends javax.swing.JPanel {
    
    private int progress;
    private Assessment assessment;
    
    /**
     * Creates new form moduleListCell
     */
    public deadlineListCell(int progress, Assessment assessment) {
        this.progress = progress;
        this.assessment = assessment;
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

        lblAssessmentName = new javax.swing.JLabel();
        pbProgress = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTask = new javax.swing.JList();
        lblProgress = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAssessmentName.setText("Assessment Name");

        lstTask.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstTask);

        lblProgress.setText("Progress");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAssessmentName)
                        .addGap(18, 18, 18)
                        .addComponent(lblProgress)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pbProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssessmentName)
                    .addComponent(lblProgress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(pbProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fillComponents(){
        lblAssessmentName.setText(assessment.getName());
        lblProgress.setText(Integer.toString(progress)+"%");
        
        ListPopulator<StudyTask> tsk = new ListPopulator();
        tsk.populateJList(assessment.getTasks(), lstTask);
        
        pbProgress.setMinimum(0);
        pbProgress.setMaximum(100);
        pbProgress.setValue(progress);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAssessmentName;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JList lstTask;
    private javax.swing.JProgressBar pbProgress;
    // End of variables declaration//GEN-END:variables
}