/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Main.MainFrame;
import Main.Stopwatch;
import javax.swing.JDialog;

/**
 *
 * @author zepingluo
 */
public class startPanel extends javax.swing.JPanel {

    /**
     * Creates new form startPanel
     */
    MainFrame main;
    public startPanel(MainFrame main) {
        initComponents();
        this.main=main;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadTest = new javax.swing.JButton();

        loadTest.setText("loadTest");
        loadTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(loadTest)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(loadTest)
                .addGap(115, 115, 115))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadTestActionPerformed
        // TODO add your handling code here:
        JDialog dialog = new JDialog(main, true);
        dialog.add(new openPanel(main));
        dialog.pack();
        dialog.setVisible(true);
        main.setDisplayPanel(new Stopwatch(23,main));
    }//GEN-LAST:event_loadTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loadTest;
    // End of variables declaration//GEN-END:variables
}