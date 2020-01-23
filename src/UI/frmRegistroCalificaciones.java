package UI;

import BLL.GestionMatricula;
import java.io.IOException;
import javax.swing.JOptionPane;

public class frmRegistroCalificaciones extends javax.swing.JInternalFrame {

    private final String titulo = "Registro Calificaiones";
    private final GestionMatricula matriculaBLL = new GestionMatricula();

    private void consultarMatricula() throws IOException {
        String numero = txt_numeroMatricula.getText();
        matriculaBLL.consultar(numero);
        txta_datosMatricula.setText(matriculaBLL.imprimir());
    }

    private String Calificar() throws IOException {
        float nota = (float) this.snn_valor.getValue();
        String mensaje = matriculaBLL.calificar(nota);
        matriculaBLL.archivar();
        return mensaje;
    }

    private boolean Validar() {
        float nota = (float) this.snn_valor.getValue();
        if (nota == 0.f) {
            vtnPrincipal.verMensage("Calificación no valida", titulo, JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public frmRegistroCalificaciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_registroCalificaciones = new javax.swing.JPanel();
        lbl_numeroMatricula = new javax.swing.JLabel();
        txt_numeroMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_datosMatricula = new javax.swing.JTextArea();
        pnl_Calificacion = new javax.swing.JPanel();
        lbl_valor = new javax.swing.JLabel();
        snn_valor = new javax.swing.JSpinner();
        btr_guardar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        pnl_registroCalificaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 217, 255)), "Registro Calificaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif Condensed", 3, 14))); // NOI18N

        lbl_numeroMatricula.setText("N° Matrícula:");

        txta_datosMatricula.setColumns(20);
        txta_datosMatricula.setRows(5);
        jScrollPane1.setViewportView(txta_datosMatricula);

        pnl_Calificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Calificacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif Condensed", 3, 14))); // NOI18N

        lbl_valor.setText("Valor:");

        snn_valor.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(20.0f), Float.valueOf(0.01f)));

        javax.swing.GroupLayout pnl_CalificacionLayout = new javax.swing.GroupLayout(pnl_Calificacion);
        pnl_Calificacion.setLayout(pnl_CalificacionLayout);
        pnl_CalificacionLayout.setHorizontalGroup(
            pnl_CalificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CalificacionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbl_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(snn_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_CalificacionLayout.setVerticalGroup(
            pnl_CalificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_CalificacionLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnl_CalificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_valor)
                    .addComponent(snn_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        btr_guardar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btr_guardar.setForeground(new java.awt.Color(30, 253, 64));
        btr_guardar.setText("GUARDAR");
        btr_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btr_guardarActionPerformed(evt);
            }
        });

        btn_buscar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(103, 163, 251));
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_registroCalificacionesLayout = new javax.swing.GroupLayout(pnl_registroCalificaciones);
        pnl_registroCalificaciones.setLayout(pnl_registroCalificacionesLayout);
        pnl_registroCalificacionesLayout.setHorizontalGroup(
            pnl_registroCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_registroCalificacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btr_guardar)
                .addGap(35, 35, 35))
            .addGroup(pnl_registroCalificacionesLayout.createSequentialGroup()
                .addGroup(pnl_registroCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_registroCalificacionesLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(pnl_registroCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                            .addComponent(pnl_Calificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_registroCalificacionesLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lbl_numeroMatricula)
                        .addGap(18, 18, 18)
                        .addComponent(txt_numeroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnl_registroCalificacionesLayout.setVerticalGroup(
            pnl_registroCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_registroCalificacionesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnl_registroCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numeroMatricula)
                    .addComponent(txt_numeroMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_Calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btr_guardar)
                .addGap(21, 21, 21))
        );

        jLabel1.setFont(new java.awt.Font("URW Bookman L", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(149, 236, 253));
        jLabel1.setText("REGISTRO CALIFICACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(pnl_registroCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(pnl_registroCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            consultarMatricula();
        } catch (IOException e) {
            vtnPrincipal.verMensage("Error al buscar la matricula " + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btr_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btr_guardarActionPerformed
        try {
            if (Validar()) {
                String mensaje = Calificar();
                vtnPrincipal.verMensage(mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            vtnPrincipal.verMensage("Error al calificar la matricula " + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btr_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btr_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_numeroMatricula;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JPanel pnl_Calificacion;
    private javax.swing.JPanel pnl_registroCalificaciones;
    private javax.swing.JSpinner snn_valor;
    private javax.swing.JTextField txt_numeroMatricula;
    private javax.swing.JTextArea txta_datosMatricula;
    // End of variables declaration//GEN-END:variables
}
