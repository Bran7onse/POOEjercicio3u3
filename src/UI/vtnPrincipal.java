package UI;

import javax.swing.JOptionPane;

public class vtnPrincipal extends javax.swing.JFrame {

    public static void verMensage(String msg, String titulo, int type) {
        JOptionPane.showMessageDialog(null, msg, titulo, type);
    }

    public vtnPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        mni_nuevoEstudiante = new javax.swing.JMenuItem();
        mni_reporteCalificaciones = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        mni_nuevaMatricula = new javax.swing.JMenuItem();
        mni_Calificaciones = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editMenu.setMnemonic('e');
        editMenu.setText("Estudiante");

        mni_nuevoEstudiante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mni_nuevoEstudiante.setMnemonic('t');
        mni_nuevoEstudiante.setText("Nuevo");
        mni_nuevoEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_nuevoEstudianteActionPerformed(evt);
            }
        });
        editMenu.add(mni_nuevoEstudiante);

        mni_reporteCalificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mni_reporteCalificaciones.setMnemonic('y');
        mni_reporteCalificaciones.setText("Reporte de Calificaciones");
        mni_reporteCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_reporteCalificacionesActionPerformed(evt);
            }
        });
        editMenu.add(mni_reporteCalificaciones);

        menuBar.add(editMenu);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Matricula");

        mni_nuevaMatricula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mni_nuevaMatricula.setMnemonic('o');
        mni_nuevaMatricula.setText("Nueva");
        mni_nuevaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_nuevaMatriculaActionPerformed(evt);
            }
        });
        fileMenu.add(mni_nuevaMatricula);

        mni_Calificaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mni_Calificaciones.setMnemonic('s');
        mni_Calificaciones.setText("Calificar");
        mni_Calificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mni_CalificacionesActionPerformed(evt);
            }
        });
        fileMenu.add(mni_Calificaciones);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mni_nuevaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_nuevaMatriculaActionPerformed
       frmRegistroMatricula FrmMatricula = new frmRegistroMatricula();
       this.desktopPane.add(FrmMatricula);
       FrmMatricula.show();
    }//GEN-LAST:event_mni_nuevaMatriculaActionPerformed

    private void mni_CalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_CalificacionesActionPerformed
        frmRegistroCalificaciones FrmCalificaiones = new frmRegistroCalificaciones();
        this.desktopPane.add(FrmCalificaiones);
        FrmCalificaiones.show();
    }//GEN-LAST:event_mni_CalificacionesActionPerformed

    private void mni_nuevoEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_nuevoEstudianteActionPerformed
        frmRegistroEstudiante FrmEstudiante = new frmRegistroEstudiante();
        this.desktopPane.add(FrmEstudiante);
        FrmEstudiante.show();;
    }//GEN-LAST:event_mni_nuevoEstudianteActionPerformed

    private void mni_reporteCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mni_reporteCalificacionesActionPerformed
       frmReporteCalificaciones Frmreporte = new frmReporteCalificaciones();
       this.desktopPane.add(Frmreporte);
       Frmreporte.show();
    }//GEN-LAST:event_mni_reporteCalificacionesActionPerformed

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
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mni_Calificaciones;
    private javax.swing.JMenuItem mni_nuevaMatricula;
    private javax.swing.JMenuItem mni_nuevoEstudiante;
    private javax.swing.JMenuItem mni_reporteCalificaciones;
    // End of variables declaration//GEN-END:variables

}
