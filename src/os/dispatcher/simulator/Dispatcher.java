package os.dispatcher.simulator;

import java.text.NumberFormat;
import java.util.Collections;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;
import javax.swing.table.*;

/**
 *
 * @author Tyler McFaden
 */
public class Dispatcher extends javax.swing.JFrame {
    
    private static int pidCounter;
    private ArrayList<Process> ready;
    private ArrayList<Process> blocked;
    private Process running;

    /**
     * Creates new form SimulatorUI
     */
    public Dispatcher() {
        initComponents();
        pidCounter = 10;
        ready = new ArrayList<>();
        blocked = new ArrayList<>();
        running = new Process(pidCounter, 30, ProcessStatus.RUNNING);
        ++pidCounter;
        initialSet();
        drawTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jProcessAdd = new javax.swing.JButton();
        jProcessAddLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jControlLabel = new javax.swing.JLabel();
        jBlockProcess = new javax.swing.JButton();
        jUnblockProcess = new javax.swing.JButton();
        jKillProcess = new javax.swing.JButton();
        jKillAll = new javax.swing.JButton();
        jPriorityInput = new javax.swing.JTextField();
        jReset = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jProcessAdd.setText("Add");
        jProcessAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProcessAddActionPerformed(evt);
            }
        });

        jProcessAddLabel.setText("Add Process");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Priority", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jControlLabel.setText("Controls");

        jBlockProcess.setText("Block Selected");

        jUnblockProcess.setText("Unblock Selected");

        jKillProcess.setText("Kill Selected");
        jKillProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKillProcessActionPerformed(evt);
            }
        });

        jKillAll.setText("Kill All");
        jKillAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKillAllActionPerformed(evt);
            }
        });

        jPriorityInput.setText("Priority (Int)");

        jReset.setText("Reset");
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        jLabel1.setText("Tyler McFaden - CS 471 Project");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jPriorityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jProcessAdd))
                                    .addComponent(jLabel1))
                                .addGap(170, 170, 170)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBlockProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jUnblockProcess)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jProcessAddLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jControlLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jKillProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jKillAll, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jControlLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBlockProcess)
                            .addComponent(jKillProcess)
                            .addComponent(jReset)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProcessAddLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jProcessAdd)
                            .addComponent(jPriorityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jUnblockProcess)
                            .addComponent(jKillAll)
                            .addComponent(jExit))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Kills all processes.
     * @param evt The button press from the UI.
     */
    private void jKillAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKillAllActionPerformed
        ready.clear();
        blocked.clear();
        running = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        ready = new ArrayList<>();
        blocked = new ArrayList<>();
    }//GEN-LAST:event_jKillAllActionPerformed

    /**
     * Kills the selected Process (That is, the process currently highlighted on the table).
     * If the process killed was currently running, a new process will be started.
     * @param evt The button press from the UI.
     */
    private void jKillProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKillProcessActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        int row = jTable1.getSelectedRow();
        Vector rowData = (Vector)model.getDataVector().elementAt(row);
        final int targetPid = (int)rowData.elementAt(0);
        ProcessStatus status = (ProcessStatus)rowData.elementAt(2);
        model.removeRow(row);
        
        //Remove the process from ArrayList
        switch(status){
            case RUNNING:
                //TODO properly update the table with the new running
                running = contextSwitch(); //Or highest priority ready process
                          
            case READY:
                for (Process p : ready) {
                    if(p.getPid() == targetPid){
                        ready.remove(p);
                        break;
                    }
                }
                break;
                
            case BLOCKED:
                for (Process p : blocked) {
                    if(p.getPid() == targetPid){
                        blocked.remove(p);
                        break;
                    }
                }
                break;
                
            default: 
                System.err.println("Invalid status");
                break;
        }
    }//GEN-LAST:event_jKillProcessActionPerformed

    /**
     * Adds a Process, given a priority, to the ready ArrayList. 
     * PID is assigned automatically.
     * @param evt The button press from the UI.
     */
    private void jProcessAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProcessAddActionPerformed
        
        if(isInteger(jPriorityInput.getText(),10)){
            int getPriority = Integer.parseInt(jPriorityInput.getText());
            if(getPriority >= 0){
                if(running == null)
                    running = new Process(pidCounter,getPriority,ProcessStatus.RUNNING);
                else ready.add(new Process(pidCounter,getPriority,ProcessStatus.READY));
                ++pidCounter;
                reDrawTable();
            }
            else JOptionPane.showMessageDialog(null, "Please enter an positive integer value.");
        }

        else JOptionPane.showMessageDialog(null, "Please enter an positive integer value.");
    }//GEN-LAST:event_jProcessAddActionPerformed

    /**
     * Resets the program to its initial state.
     * @param evt The button press from the UI.
     */
    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        ready.clear();
        blocked.clear();
        running = null;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        pidCounter = 10;
        ready = new ArrayList<>();
        blocked = new ArrayList<>();
        running = new Process(pidCounter, 30, ProcessStatus.RUNNING);
        ++pidCounter;
        initialSet();
        drawTable();
    }//GEN-LAST:event_jResetActionPerformed

    /**
     * Exits the program.
     * @param evt The button press from the UI.
     */
    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dispatcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dispatcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dispatcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dispatcher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dispatcher().setVisible(true);
            }
        });
    }
    
    /**
     * Populate table with a set of processes
     * @param processes an ArrayList of Process objects
     */
    public void populateTable(ArrayList<Process> processes){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jTable1.setModel(model);
        processes.stream().map((process) -> {
            Object[] row = new Object[3];
            row[0] = process.getPid();
            //If reading off of blocked list, ignore priority
            if(process.getStatus() == ProcessStatus.BLOCKED)
                row[1] = -1;
            else row[1] = process.getPriority();
            row[2] = process.getStatus();
            return row;
        }).forEachOrdered((row) -> {
           model.addRow(row);
        });
    }
    
    /**
     * Populate table with a single process
     * @param process a single Process
     */
    public void populateTable(Process process){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jTable1.setModel(model);
        Object[] row = new Object[3];
        row[0] = process.getPid();
        row[1] = process.getPriority();
        row[2] = process.getStatus();
        model.addRow(row);
    }
    
    /**
     * Draws the table from all lists.
     * For Ready processes, they are sorted by priority.
     */
    public void drawTable(){
        populateTable(running);
        Collections.sort(ready);
        populateTable(ready);
        populateTable(blocked);
    }
    
    /**
     * Erases contents of the table and redraws it.
     */
    public void reDrawTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        drawTable();
    }
    
    /**
     * Fills the sets with arbitrary initial values.
     */
    public void initialSet(){
        ready.add(new Process(pidCounter, 20, ProcessStatus.READY));
        ++pidCounter;
        ready.add(new Process(pidCounter, 43, ProcessStatus.READY));
        ++pidCounter;
        ready.add(new Process(pidCounter, 18, ProcessStatus.READY));
        ++pidCounter;
        ready.add(new Process(pidCounter, 34, ProcessStatus.READY));
        ++pidCounter;
    }
    
    public Process contextSwitch(){
        Process newRunning = ready.get(0);
        return newRunning;
    }
    
    /**
     * A function to check if a given string is a valid integer.
     * @param s the string to examine
     * @param radix the acceptable number set (10 is generally appropriate)
     * @return true if found to be an acceptable integer
     */
    public static boolean isInteger(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
           if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return true;
}
    
    //<editor-fold defaultstate="collapsed" desc="JFrame Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlockProcess;
    private javax.swing.JLabel jControlLabel;
    private javax.swing.JButton jExit;
    private javax.swing.JButton jKillAll;
    private javax.swing.JButton jKillProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jPriorityInput;
    private javax.swing.JButton jProcessAdd;
    private javax.swing.JLabel jProcessAddLabel;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUnblockProcess;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
