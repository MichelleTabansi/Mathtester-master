/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Main.MainFrame;
import staticClasses.InfoTableModel;

/**
 *
 * @author zepingluo
 */
public class endPanel extends javax.swing.JPanel {

    /**
     * Creates new form endPanel
     */
    public static final int EASY = 0;
    public static final int MEDIUM = 1;
    public static final int HARD =2;
    public static final int UNKNOWN=-1;
    public int totalRight=0;
    
    MainFrame frame;
    public endPanel(MainFrame frame) {
        initComponents();
        this.frame =frame;
        drawScoreTable();
        scoreFinal.setText("TOTAL RIGHT:"+totalRight+ " out of"+ frame.questionList.size()); 
        frame.finishBeforeTime=true;
    }
        
    public void drawScoreTable()
    {
        String[] rosterHeader = {
            "Question#", "Correct", "Your Answer", "Difficulty"
        };

        // Get data for table
        String[][] tableData = new String[frame.questionList.size()][rosterHeader.length];
        // Populate table with data
        for (int x = 0; x < tableData.length; x++) {
            // Athlete Info
            tableData[x][0] = ""+(x+1);
            tableData[x][1] = frame.questionList.get(x).getCorrectAnswer();
            if(frame.questionList.get(x).getUserAnswer().equals(frame.questionList.get(x).getCorrectAnswer())){
                totalRight++;
                int ascii = 0x2713;;      
                String checkMark = Character.toString((char)ascii);
                tableData[x][2] =checkMark;
            }
            else{
                tableData[x][2] = frame.questionList.get(x).getUserAnswer();
            }
            
            int dif =frame.questionList.get(x).getDifficulty();
            String str = null;
            switch (dif)
            {
                case EASY : str="*";
                break;
                case MEDIUM : str="**";
                break;
                case HARD : str="***";
                break;
            }
            tableData[x][3]=str;
                   
            
        }

        // Create JTable with all our data
        reportTable.setModel(new InfoTableModel(tableData, rosterHeader));

        reportTable.getColumnModel().getColumn(0).setMinWidth(100);
        reportTable.getColumnModel().getColumn(1).setMinWidth(25);
        reportTable.getColumnModel().getColumn(2).setMinWidth(100);
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
        reportTable = new javax.swing.JTable();
        scoreFinal = new javax.swing.JLabel();

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(reportTable);

        scoreFinal.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(scoreFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(scoreFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reportTable;
    private javax.swing.JLabel scoreFinal;
    // End of variables declaration//GEN-END:variables
}
