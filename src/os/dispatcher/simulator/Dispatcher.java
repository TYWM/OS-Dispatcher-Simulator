package os.dispatcher.simulator;

import java.util.Set;
import java.util.TreeSet;
import javax.swing.table.*;

/**
 *
 * @author Tyler McFaden
 */
public class Dispatcher extends javax.swing.JFrame {
    
    private static int pidCounter = 10;
    private Set<Process> processes;

    /**
     * Creates new form SimulatorUI
     */
    public Dispatcher() {
        initComponents();
        runProgram();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPriorityInput = new javax.swing.JTextField();
        jProcessAdd = new javax.swing.JButton();
        jProcessAddLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jControlLabel = new javax.swing.JLabel();
        jBlockProcess = new javax.swing.JButton();
        jUnblockProcess = new javax.swing.JButton();
        jKillProcess = new javax.swing.JButton();
        jKillAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPriorityInput.setText("Priority (Int)");
        jPriorityInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPriorityInputActionPerformed(evt);
            }
        });

        jProcessAdd.setText("Add");

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

        jKillAll.setText("Kill All");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProcessAddLabel)
                            .addComponent(jPriorityInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jProcessAdd)
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jUnblockProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBlockProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jKillAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jKillProcess, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                .addGap(84, 84, 84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jControlLabel)
                                .addGap(201, 201, 201))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jControlLabel)
                            .addComponent(jProcessAddLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBlockProcess)
                            .addComponent(jKillProcess)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPriorityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProcessAdd))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jKillAll)
                    .addComponent(jUnblockProcess))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPriorityInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPriorityInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPriorityInputActionPerformed

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
        
        Dispatcher program = new Dispatcher();
        //program.runProgram();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dispatcher().setVisible(true);
            }
        });

        
    }
    
    public void runProgram(){
        processes = initialSet();
        
        //Populate table with initial process set
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jTable1.setModel(model);
        processes.stream().map((process) -> {
            Object[] row = new Object[3];
            row[0] = process.getPid();
            row[1] = process.getPriority();
            row[2] = process.getStatus();
            return row;
        }).forEachOrdered((row) -> {
           model.addRow(row);
        });
        

    }
    
    /**
     * 
     * @return the initial set of processes
     */
    public Set<Process> initialSet(){
        
        Set<Process> processes = new TreeSet<>();
        
        Process p1 = new Process(pidCounter, 20, ProcessStatus.RUNNING);
        processes.add(p1);
        ++pidCounter;
        Process p2 = new Process(pidCounter, 43, ProcessStatus.READY);
        processes.add(p2);
        ++pidCounter;
        Process p3 = new Process(pidCounter, 18, ProcessStatus.READY);
        processes.add(p3);
        ++pidCounter;
        
        return processes;
    }
    
    public static void killProcess(int pid){
        
    }
    
    public static void blockProcess(int pid){
        
    }
    
    public static void resumeProcess(int pid){
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="JFrame Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlockProcess;
    private javax.swing.JLabel jControlLabel;
    private javax.swing.JButton jKillAll;
    private javax.swing.JButton jKillProcess;
    private javax.swing.JTextField jPriorityInput;
    private javax.swing.JButton jProcessAdd;
    private javax.swing.JLabel jProcessAddLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUnblockProcess;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
