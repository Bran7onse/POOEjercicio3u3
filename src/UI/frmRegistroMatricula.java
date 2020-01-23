package UI;

import BEU.Curso;
import BEU.Estudiante;
import BLL.GestionCurso;
import BLL.GestionEstudiante;
import BLL.GestionMatricula;
import fonseca.util;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class frmRegistroMatricula extends javax.swing.JInternalFrame {

    private final String titulo = "Registro Matricula";
    private GestionCurso cursoBLL = new GestionCurso();
    private List<Curso> curso;
    private GestionEstudiante estudiantesBLL = new GestionEstudiante();
    private GestionMatricula matriculaBLL = new GestionMatricula();
    private List<Estudiante> estudiante;

    public boolean Validar() {
        Curso cr = (Curso) cmb_curso.getSelectedItem();
        if (cr.getTitulo().equals("-Seleccione-")) {
            vtnPrincipal.verMensage("Curso no válido", titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        Estudiante est = (Estudiante) this.cmb_estudiante.getSelectedItem();
        if (est.getNombre().equals("-Seleccione-")) {
            vtnPrincipal.verMensage("Estudiante no válido", titulo, JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void leerCursos() {
        try {
            Curso ficticio = new Curso("Seleccione", "", 0.0f);
            ficticio.setTitulo("-Seleccione-");
            curso = cursoBLL.getCursos();
            this.cmb_curso.addItem(ficticio);
            //Expresion lambda
            curso.forEach((c) -> {
                this.cmb_curso.addItem(c);
            });

        } catch (IOException e) {
            vtnPrincipal.verMensage("Error al leer los cursos" + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void leerEstudiantes() {
        try {
            Estudiante ficticio = new Estudiante();
            ficticio.setNombre("-Seleccione-");
            ficticio.setApellido("");
            this.cmb_estudiante.addItem(ficticio);
            estudiante = estudiantesBLL.leerEstudiantes();
            //Expresion lambda
            estudiante.forEach((est) -> {
                this.cmb_estudiante.addItem(est);
            });
        } catch (Exception e) {
            vtnPrincipal.verMensage("Error al leer los estudiantes" + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CrearMatricula() throws IOException {
        Curso cr = (Curso) this.cmb_curso.getSelectedItem();
        Estudiante est = (Estudiante) this.cmb_estudiante.getSelectedItem();
        matriculaBLL.crear();
        matriculaBLL.configurar(cr, est);
        matriculaBLL.archivar();
    }

    public frmRegistroMatricula() {
        initComponents();
        try {
            leerCursos();
            leerEstudiantes();
        } catch (Exception e) {
            util.print(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_estudiante = new javax.swing.JLabel();
        cmb_estudiante = new javax.swing.JComboBox<>();
        cmb_curso = new javax.swing.JComboBox<>();
        lbl_curso = new javax.swing.JLabel();
        btr_guardar = new javax.swing.JButton();
        lbl_registroMatricula = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 252)), "Registro Matricula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif Condensed", 3, 14))); // NOI18N

        lbl_estudiante.setText("Estudiante:");

        lbl_curso.setText("Curso:");

        btr_guardar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btr_guardar.setForeground(new java.awt.Color(30, 253, 64));
        btr_guardar.setText("GUARDAR");
        btr_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btr_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_estudiante)
                            .addComponent(lbl_curso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmb_estudiante, 0, 292, Short.MAX_VALUE)
                            .addComponent(cmb_curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btr_guardar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_estudiante)
                    .addComponent(cmb_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_curso)
                    .addComponent(cmb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(btr_guardar))
        );

        lbl_registroMatricula.setFont(new java.awt.Font("URW Bookman L", 3, 36)); // NOI18N
        lbl_registroMatricula.setForeground(new java.awt.Color(149, 236, 253));
        lbl_registroMatricula.setText("REGISTRO DE MATRÍCULA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lbl_registroMatricula)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbl_registroMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btr_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btr_guardarActionPerformed
        try {
            if (Validar()) {
                CrearMatricula();
                vtnPrincipal.verMensage("Matricula creada correctamente", titulo, JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            vtnPrincipal.verMensage("Error al crear la matricula" + e.toString(), titulo, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btr_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btr_guardar;
    private javax.swing.JComboBox<Curso> cmb_curso;
    private javax.swing.JComboBox<Estudiante> cmb_estudiante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_estudiante;
    private javax.swing.JLabel lbl_registroMatricula;
    // End of variables declaration//GEN-END:variables
}
