package UI;

import BEU.Curso;
import BEU.Matricula;
import BLL.GestionCurso;
import BLL.GestionMatricula;
import fonseca.util;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmReporteCalificaciones extends javax.swing.JInternalFrame {

    private final String titulo = "Registro Matricula";
    private GestionCurso cursoBLL = new GestionCurso();
    private List<Curso> curso;
    private final DefaultTableModel dtmCalificaciones = new DefaultTableModel();
    private GestionMatricula matriculaBLL = new GestionMatricula();
    private List<Matricula> calificaciones;

    private void configurarModeloTabla() {
        String[] columnas = {"Nombre", "Promedio", "Estado"};
        this.dtmCalificaciones.setColumnIdentifiers(columnas);
        this.tbl_calificaciones.setModel(dtmCalificaciones);
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

    private void MostrarCalificaciones() {
        int lim = this.dtmCalificaciones.getRowCount() - 1;
        for (int i = lim; i >= 0; i--) {
            this.dtmCalificaciones.removeRow(i);
        }

        for (Matricula m : calificaciones) {
            Vector fila = new Vector();
            fila.addElement(m.getEstudiante());
            fila.addElement(m.getPromedio());
            fila.addElement(m.getEstado());
            this.dtmCalificaciones.addRow(fila);
        }
        this.tbl_calificaciones.setModel(dtmCalificaciones);
    }

    private void buscarMatriculas() throws IOException {

        Curso seleccionado = (Curso) cmb_curso.getSelectedItem();
        calificaciones = matriculaBLL.reportar(seleccionado.getTitulo());
        MostrarCalificaciones();
    }

    public frmReporteCalificaciones() {
        initComponents();
        leerCursos();
        configurarModeloTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_registroMatricula = new javax.swing.JLabel();
        lbl_curso = new javax.swing.JLabel();
        cmb_curso = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_calificaciones = new javax.swing.JTable();

        setTitle("Reporte Calificaciones");

        lbl_registroMatricula.setFont(new java.awt.Font("URW Bookman L", 3, 36)); // NOI18N
        lbl_registroMatricula.setForeground(new java.awt.Color(149, 236, 253));
        lbl_registroMatricula.setText("REPORTE DE CALIFICACIONES");

        lbl_curso.setText("Curso:");

        btn_buscar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(103, 163, 251));
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tbl_calificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_calificaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_buscar))
                    .addComponent(lbl_registroMatricula)
                    .addComponent(jScrollPane1))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbl_registroMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_curso)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            buscarMatriculas();
        } catch (IOException e) {
            util.print(e.toString());
            vtnPrincipal.verMensage("Error el buscar matrícula ", titulo, JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<Curso> cmb_curso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_curso;
    private javax.swing.JLabel lbl_registroMatricula;
    private javax.swing.JTable tbl_calificaciones;
    // End of variables declaration//GEN-END:variables

}
