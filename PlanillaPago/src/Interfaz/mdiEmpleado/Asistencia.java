/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiEmpleado;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import Planilla.PlanillaPago;
import Registros.RegistroAsistencia;
import Usuarios.Empleado;

/**
 *
 * @author Gimena Navarrete
 */
public class Asistencia extends javax.swing.JInternalFrame {

    private Empleado empleado;

    /**
     * Creates new form Asistencia
     */
    public Asistencia(Empleado empleado) {
        this.empleado = empleado;
        initComponents();
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public DefaultTableModel arrayToTable() {
        PlanillaPago planilla = this.empleado.getPlanillaPago();
        System.out.println(planilla);
        ArrayList<RegistroAsistencia> array = planilla.getTablaAsistencia().getTabla();

        String[] columnas = { "Num", "Asistencia", "Fecha" };
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (RegistroAsistencia registro : array) {
            if (registro.getEmpleado().getId() != this.empleado.getId()) continue;
            Object[] datos = {
                registro.getNum(),
                registro.getAsistencia() == 1 ? "Entrada" : "Salida",
                registro.getFecha(),
            };
            dtm.addRow(datos);
        }
        return dtm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbAsistenciaSrollEmp = new javax.swing.JScrollPane();
        tbAsisteciaEmp = new javax.swing.JTable();
        regisAsistencia = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setVisible(true);

        tbAsisteciaEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        tbAsisteciaEmp.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tbAsisteciaEmp.setModel(this.arrayToTable());
        tbAsisteciaEmp.setMaximumSize(new java.awt.Dimension(75, 64));
        tbAsisteciaEmp.setMinimumSize(new java.awt.Dimension(75, 64));
        tbAsistenciaSrollEmp.setViewportView(tbAsisteciaEmp);

        regisAsistencia.setBackground(new java.awt.Color(255, 102, 0));
        regisAsistencia.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        regisAsistencia.setText("Registrar Asistencia");
        regisAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisAsistenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tbAsistenciaSrollEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(regisAsistencia)
                        .addGap(161, 161, 161))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbAsistenciaSrollEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(regisAsistencia)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regisAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisAsistenciaActionPerformed
        this.empleado.registrarAsistencia();
        this.tbAsisteciaEmp.setModel(this.arrayToTable());
    }//GEN-LAST:event_regisAsistenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton regisAsistencia;
    private javax.swing.JTable tbAsisteciaEmp;
    private javax.swing.JScrollPane tbAsistenciaSrollEmp;
    // End of variables declaration//GEN-END:variables
}
