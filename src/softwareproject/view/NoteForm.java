package softwareproject.view;

import java.util.Date;
import softwareproject.controller.NoteController;
import softwareproject.model.Notable;

/**
 *
 * @author Danny
 */
public class NoteForm extends javax.swing.JFrame {

    private Notable parent;
    private TaskWindow tw;
    private ActivityWindow aw;
    /**
     * 
     * @param parent item to add note to
     * @param tw
     */
    public NoteForm(Notable parent, TaskWindow tw) {
        this.parent = parent;
        this.tw = tw;
        initComponents();
    }
    public NoteForm(Notable parent, ActivityWindow aw) {
        this.parent = parent;
        this.aw = aw;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        noteTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteContents = new javax.swing.JTextArea();
        btnSaveNote = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblContents = new javax.swing.JLabel();
        lblNoteFormTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        noteContents.setColumns(20);
        noteContents.setRows(5);
        noteContents.setWrapStyleWord(true);
        jScrollPane1.setViewportView(noteContents);

        btnSaveNote.setText("Save Note");
        btnSaveNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveNoteActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblTitle.setText("Title");
        lblTitle.setToolTipText("");

        lblContents.setText("Contents");

        lblNoteFormTitle.setText("Create Note");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaveNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle)
                            .addComponent(lblContents))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(lblNoteFormTitle)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNoteFormTitle)
                .addGap(8, 8, 8)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContents)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveNote)
                    .addComponent(btnCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveNoteActionPerformed
        NoteController.attachNote(parent, NoteController.createNote(noteTitle.getText(), noteContents.getText(), new Date()));
        if(tw != null){
            tw.fillComponents();
        }else{
            aw.fillComponents();
        }
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnSaveNoteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSaveNote;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContents;
    private javax.swing.JLabel lblNoteFormTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea noteContents;
    private javax.swing.JTextField noteTitle;
    // End of variables declaration//GEN-END:variables
}
