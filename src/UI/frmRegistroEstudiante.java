package UI;

import BEU.Estudiante;
import BLL.GestionEstudiante;
import fonseca.util;
import java.io.IOException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class frmRegistroEstudiante extends javax.swing.JInternalFrame {

    private final String titulo = "Registro Matricula";
    private GestionEstudiante estudiantesBLL = new GestionEstudiante();

    private String verificarClub(JCheckBox chk) {
        return chk.isSelected() ? chk.getText() : "";

        /*if (chk.isSelected()) {
            return chk.getText();
        }
        return "";*/
    }

    private void iniciarListado() throws IOException {
        estudiantesBLL.leerEstudiantes();
    }

    private void CrearEstudiante() {
        Estudiante nuevo = new Estudiante();
        nuevo.setCedula(this.txt_cedula.getText());
        nuevo.setApellido(this.txt_apellidos.getText());
        nuevo.setNombre(this.txt_nombres.getText());
        nuevo.setCarrera(this.cmb_carrera.getSelectedItem().toString());

        nuevo.addClub(verificarClub(chk_danza));
        nuevo.addClub(verificarClub(this.chk_ajedrez));
        nuevo.addClub(verificarClub(this.chk_andinismo));
        nuevo.addClub(verificarClub(this.chk_artesPlasticas));
        nuevo.addClub(verificarClub(this.chk_futbol));
        nuevo.addClub(verificarClub(this.chk_musica));
        nuevo.addClub(verificarClub(this.chk_robotica));
        nuevo.addClub(verificarClub(this.chk_tenisMesa));

        estudiantesBLL.getEstudiantes().add(nuevo);
    }

    private void archivar() throws IOException {
        estudiantesBLL.archivar();
    }

    public frmRegistroEstudiante() {
        initComponents();
        try {
            iniciarListado();

        } catch (Exception ex) {
            util.print(ex.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_registroEstudiante = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_cedula = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        lbl_apellios = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        pnl_datosAcademicos = new javax.swing.JPanel();
        lbl_carrera = new javax.swing.JLabel();
        cmb_carrera = new javax.swing.JComboBox<>();
        pnl_datosExtracurriculares = new javax.swing.JPanel();
        chk_andinismo = new javax.swing.JCheckBox();
        chk_danza = new javax.swing.JCheckBox();
        chk_musica = new javax.swing.JCheckBox();
        chk_robotica = new javax.swing.JCheckBox();
        chk_ajedrez = new javax.swing.JCheckBox();
        chk_futbol = new javax.swing.JCheckBox();
        chk_tenisMesa = new javax.swing.JCheckBox();
        chk_artesPlasticas = new javax.swing.JCheckBox();
        btr_guardar = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);

        lbl_registroEstudiante.setFont(new java.awt.Font("URW Bookman L", 3, 36)); // NOI18N
        lbl_registroEstudiante.setForeground(new java.awt.Color(149, 236, 253));
        lbl_registroEstudiante.setText("REGISTRO DE ESTUDIANTE");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 252)), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif Condensed", 3, 14))); // NOI18N

        lbl_cedula.setText("Cedula:");

        lbl_nombres.setText("Nombres:");

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });

        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        lbl_apellios.setText("Apellidos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_cedula)
                            .addComponent(lbl_nombres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lbl_apellios)
                            .addGap(18, 18, 18)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cedula)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_nombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_apellios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnl_datosAcademicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 252)), "Datos Académicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif Condensed", 3, 14))); // NOI18N

        lbl_carrera.setText("Carrera:");

        cmb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria Software", "Ingenieria Automotriz", "Ingenieria Finanzas", "Ingenieria Robotica" }));

        javax.swing.GroupLayout pnl_datosAcademicosLayout = new javax.swing.GroupLayout(pnl_datosAcademicos);
        pnl_datosAcademicos.setLayout(pnl_datosAcademicosLayout);
        pnl_datosAcademicosLayout.setHorizontalGroup(
            pnl_datosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosAcademicosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbl_carrera)
                .addGap(18, 18, 18)
                .addComponent(cmb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnl_datosAcademicosLayout.setVerticalGroup(
            pnl_datosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosAcademicosLayout.createSequentialGroup()
                .addGroup(pnl_datosAcademicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pnl_datosExtracurriculares.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 252)), "Datos Académicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif Condensed", 3, 14))); // NOI18N

        chk_andinismo.setText("Clud de Andinismo");

        chk_danza.setText("Clud de Danza");

        chk_musica.setText("Clud de Música");

        chk_robotica.setText("Club de Robótica");

        chk_ajedrez.setText("Clud de Ajedrez");

        chk_futbol.setText("Clud de Fútbol");

        chk_tenisMesa.setText("Clud de Tenis de Mesa");

        chk_artesPlasticas.setText("Clud de Artes plásticas");

        javax.swing.GroupLayout pnl_datosExtracurricularesLayout = new javax.swing.GroupLayout(pnl_datosExtracurriculares);
        pnl_datosExtracurriculares.setLayout(pnl_datosExtracurricularesLayout);
        pnl_datosExtracurricularesLayout.setHorizontalGroup(
            pnl_datosExtracurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosExtracurricularesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_datosExtracurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_danza)
                    .addComponent(chk_andinismo)
                    .addComponent(chk_robotica)
                    .addComponent(chk_musica))
                .addGap(93, 93, 93)
                .addGroup(pnl_datosExtracurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_artesPlasticas)
                    .addComponent(chk_tenisMesa)
                    .addComponent(chk_futbol)
                    .addComponent(chk_ajedrez))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_datosExtracurricularesLayout.setVerticalGroup(
            pnl_datosExtracurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datosExtracurricularesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_datosExtracurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_danza)
                    .addComponent(chk_ajedrez))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_datosExtracurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_andinismo)
                    .addComponent(chk_futbol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_datosExtracurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk_robotica)
                    .addComponent(chk_tenisMesa, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(pnl_datosExtracurricularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datosExtracurricularesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(chk_artesPlasticas))
                    .addGroup(pnl_datosExtracurricularesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_musica)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btr_guardar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btr_guardar.setForeground(new java.awt.Color(30, 253, 64));
        btr_guardar.setText("GUARDAR");
        btr_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btr_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(lbl_registroEstudiante))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(pnl_datosExtracurriculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(pnl_datosAcademicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btr_guardar)
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbl_registroEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_datosAcademicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_datosExtracurriculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btr_guardar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed

    }//GEN-LAST:event_txt_nombresActionPerformed

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed

    }//GEN-LAST:event_txt_apellidosActionPerformed

    private void btr_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btr_guardarActionPerformed
        try {
            CrearEstudiante();
            archivar();
            vtnPrincipal.verMensage("Estudiante agregado correctamente", titulo, JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            vtnPrincipal.verMensage("Error al guaradar el estudiante " + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btr_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btr_guardar;
    private javax.swing.JCheckBox chk_ajedrez;
    private javax.swing.JCheckBox chk_andinismo;
    private javax.swing.JCheckBox chk_artesPlasticas;
    private javax.swing.JCheckBox chk_danza;
    private javax.swing.JCheckBox chk_futbol;
    private javax.swing.JCheckBox chk_musica;
    private javax.swing.JCheckBox chk_robotica;
    private javax.swing.JCheckBox chk_tenisMesa;
    private javax.swing.JComboBox<String> cmb_carrera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_apellios;
    private javax.swing.JLabel lbl_carrera;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_registroEstudiante;
    private javax.swing.JPanel pnl_datosAcademicos;
    private javax.swing.JPanel pnl_datosExtracurriculares;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables

}
