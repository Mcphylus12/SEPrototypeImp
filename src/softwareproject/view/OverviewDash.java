package softwareproject.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.filechooser.FileNameExtensionFilter;
import softwareproject.controller.FileController;
import softwareproject.controller.ListPopulator;
import softwareproject.controller.ModuleController;
import softwareproject.controller.PanelController;
import softwareproject.model.Assessment;
import softwareproject.model.Module;
import softwareproject.model.SemesterProfile;

/**
 *
 * @author ybm14yju
 */
public class OverviewDash extends javax.swing.JPanel implements ListCellRenderer<Module>{

    private SemesterProfile sp;
    private PanelController pa;
    public String openFileName = "";
    
    /**
     * Creates new form OverviewDashboard
     */
    public OverviewDash(PanelController pa) {
        sp = null;
        this.pa = pa;
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

        jFileChooser1 = new javax.swing.JFileChooser();
        btnNewSemProf = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnUpdateDeadlines = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstModules = new javax.swing.JList();
        btnSaveSemp = new javax.swing.JButton();
        btnLoadSemp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        btnNewSemProf.setText("New Semester Profile");
        btnNewSemProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewSemProfActionPerformed(evt);
            }
        });

        lblWelcome.setText("Welcome - Overview Dashboard");

        btnUpdateDeadlines.setText("Update Deadlines");
        btnUpdateDeadlines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDeadlinesActionPerformed(evt);
            }
        });

        lstModules.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstModules.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstModulesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstModules);

        btnSaveSemp.setText("Save");
        btnSaveSemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSempActionPerformed(evt);
            }
        });

        btnLoadSemp.setText("Open Semester Profile");
        btnLoadSemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadSempActionPerformed(evt);
            }
        });

        jButton1.setText("View Deadlines");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWelcome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaveSemp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNewSemProf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoadSemp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateDeadlines, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome)
                    .addComponent(btnSaveSemp)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewSemProf)
                    .addComponent(btnLoadSemp)
                    .addComponent(btnUpdateDeadlines))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewSemProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewSemProfActionPerformed
        openFileName = "";
        SemesterProfile semp = null;
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "CSV files", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
           semp = FileController.readSemesterFile(chooser.getSelectedFile().getName());
           this.setsemP(semp);
           fillComponents();
           pa.setSemesterProfile(semp);
        }

    }//GEN-LAST:event_btnNewSemProfActionPerformed

    private void lstModulesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstModulesMouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            pa.setModulePanel(new ModuleOverview(sp, (Module)lstModules.getSelectedValue()));
                    
        }
    }//GEN-LAST:event_lstModulesMouseClicked

    private void btnLoadSempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadSempActionPerformed
        SemesterProfile semp = null;
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "SER files", "ser");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
           openFileName = chooser.getSelectedFile().getName();
           semp = FileController.readFromSer(openFileName);
           this.setsemP(semp);
        }
        if(semp != null){
            this.setsemP(semp);
            fillComponents();
            pa.setSemesterProfile(semp);
        }
        else {
            JOptionPane.showMessageDialog(new JFrame(), "No previous semester profile found. Please import a New semester profile", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoadSempActionPerformed

    private void btnSaveSempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSempActionPerformed
        String path = JOptionPane.showInputDialog("Enter File Name:");
        if(path.trim().isEmpty()){
            if(openFileName.isEmpty()){
                path = "newSemesterProfile.ser";
            }else{
                path = openFileName;            
            }
        }else{
            if(!path.endsWith(".ser")){
                path += ".ser";
            }
            openFileName = path;
        }
        if(FileController.writeToFile(sp, path)){
            JOptionPane.showMessageDialog(new JFrame(), "Semester profile saved to "+path, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(new JFrame(), "Error while saving. Semester profile is not saved", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveSempActionPerformed

    private void btnUpdateDeadlinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDeadlinesActionPerformed
        openFileName = "";
        SemesterProfile semp = null;
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "CSV files", "csv");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                 chooser.getSelectedFile().getName());
            semp = FileController.readSemesterFile(chooser.getSelectedFile().getName());
        }
        
        for(Module m: semp.getModules()){
            for(Module thisM: sp.getModules()){
                if(m.getModuleCode().equals(thisM.getModuleCode())){
                    for(Assessment a: m.getAssessments()){
                        for(Assessment thisA: thisM.getAssessments()){
                            if(a.getName().equals(thisA.getName())){
                                if(!thisA.getDueDate().toString().equals(a.getDueDate().toString())){
                                    JOptionPane.showMessageDialog(new JFrame(), 
                                        "Updated Deadline for "+
                                                m.getModuleName()+
                                                " - "+a.getName()+
                                                " From: "+thisA.getDueDate()+
                                                " To: "+a.getDueDate()
                                            , "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                                    thisA.setDueDate(a.getDueDate());
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
            }
        }
        fillComponents();
    }//GEN-LAST:event_btnUpdateDeadlinesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DeadlineOverview(sp.getModules()).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fillComponents(){
        DefaultListModel<Module> lm = new DefaultListModel();
        ListPopulator<Module> lp = new ListPopulator();
        if(sp != null){
            lp.populateJList(sp.getModules(), lstModules);
            lstModules.setCellRenderer(this);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadSemp;
    private javax.swing.JButton btnNewSemProf;
    private javax.swing.JButton btnSaveSemp;
    private javax.swing.JButton btnUpdateDeadlines;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JList lstModules;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Module> jlist, Module e, int i, boolean bln, boolean bln1) {
        moduleListCell cellPane = new moduleListCell(
                e.getModuleName(),
                e.getModuleCode(), 
                e.getModuleOrganiser(), 
                ModuleController.getAssessments(e));
        if(bln){
            cellPane.setBackground(Color.gray);
        }
        
        return cellPane;
    }
    
    public void setsemP(SemesterProfile p){
        sp = p;
        fillComponents();
    }
}
