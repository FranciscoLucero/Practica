package views;

public class ViewMain extends javax.swing.JFrame {

    public ViewMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmi_Message = new javax.swing.JMenuItem();
        jmi_operaciones = new javax.swing.JMenuItem();
        jmi_mayor = new javax.swing.JMenuItem();
        jmi_ordenar = new javax.swing.JMenuItem();
        jmi_editor_texto = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmFile.setText("File");

        jmi_Message.setText("Message");
        jmFile.add(jmi_Message);

        jmi_operaciones.setText("Operaciones");
        jmFile.add(jmi_operaciones);

        jmi_mayor.setText("Mayor");
        jmi_mayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_mayorActionPerformed(evt);
            }
        });
        jmFile.add(jmi_mayor);

        jmi_ordenar.setText("Ordenar");
        jmFile.add(jmi_ordenar);

        jmi_editor_texto.setText("Editor Texto");
        jmFile.add(jmi_editor_texto);

        jMenuBar1.add(jmFile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_mayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_mayorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmi_mayorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu2;
    public javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuBar jMenuBar2;
    public javax.swing.JMenu jmFile;
    public javax.swing.JMenuItem jmi_Message;
    public javax.swing.JMenuItem jmi_editor_texto;
    public javax.swing.JMenuItem jmi_mayor;
    public javax.swing.JMenuItem jmi_operaciones;
    public javax.swing.JMenuItem jmi_ordenar;
    // End of variables declaration//GEN-END:variables
}
