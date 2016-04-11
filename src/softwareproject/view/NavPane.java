/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package softwareproject.view;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import softwareproject.controller.ModuleController;
import softwareproject.controller.PanelController;
import softwareproject.model.Module;
import softwareproject.model.SemesterProfile;

/**
 *
 * @author qxz14sru
 */
public class NavPane extends javax.swing.JPanel implements ListCellRenderer<Module>{

    PanelController pa;
    SemesterProfile sp;
    
    /**
     * Creates new form NavPane
     */
    public NavPane(SemesterProfile sp) {
        this.sp = sp;
        initComponents();
        fillComponents();

    }
    
    private void fillComponents(){
        DefaultListModel<Module> lm = new DefaultListModel();
        
        if(sp != null){
            for(Module m :sp.getModules()){
                lm.addElement(m);  
                
            }
        }
        jList1.setCellRenderer(this);
        jList1.setModel(lm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        btnSetToDash = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setMaximumSize(new java.awt.Dimension(188, 562));
        setMinimumSize(new java.awt.Dimension(188, 562));
        setPreferredSize(new java.awt.Dimension(188, 562));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        btnSetToDash.setText("Back to Dashboard");
        btnSetToDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetToDashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(btnSetToDash, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSetToDash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        JList list = (JList)evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            pa.setModulePanel(new ModuleOverview((Module)jList1.getSelectedValue()));
                    
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void btnSetToDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetToDashActionPerformed
        pa.toOverViewDash();
    }//GEN-LAST:event_btnSetToDashActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetToDash;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    @Override
    public Component getListCellRendererComponent(JList<? extends Module> jlist, Module e, int i, boolean bln, boolean bln1) {
        moduleListCellNav cellPane = new moduleListCellNav(e.getModuleName(), e.getModuleCode(), e.getModuleOrganiser(), ModuleController.getAssessments(e));
        if(bln){
            cellPane.setBackground(Color.gray);
        }
        
        return cellPane;
    }

    public void setPanelController(PanelController pa) {
        this.pa = pa;
    }
}
