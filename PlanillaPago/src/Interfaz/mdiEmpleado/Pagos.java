/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiEmpleado;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Planilla.PlanillaPago;
import Registros.RegistroPago;
import Usuarios.Empleado;

/**
 *
 * @author Gimena Navarrete
 */
public class Pagos extends javax.swing.JInternalFrame {

    private Empleado empleado;

    /**
     * Creates new form Pagos
     */
    public Pagos(Empleado empleado) {
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
        ArrayList<RegistroPago> array = planilla.getTablaPagos().getTabla();

        String[] columnas = { "Num", "Monto", "Fecha" };
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (RegistroPago registro : array) {
            if (registro.getEmpleado().getId() != this.empleado.getId()) continue;
            Object[] datos = {
                registro.getNum(),
                registro.getMonto(),
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

        tbPagosScrollEmp = new javax.swing.JScrollPane();
        tbPagosEmp = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Adelantos");
        setVisible(true);

        tbPagosScrollEmp.setMinimumSize(new java.awt.Dimension(75, 64));

        tbPagosEmp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        tbPagosEmp.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tbPagosEmp.setModel(this.arrayToTable());
        tbPagosEmp.setMaximumSize(new java.awt.Dimension(75, 64));
        tbPagosEmp.setPreferredSize(new java.awt.Dimension(75, 64));
        tbPagosScrollEmp.setViewportView(tbPagosEmp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPagosScrollEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPagosScrollEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable tbPagosEmp;
    private javax.swing.JScrollPane tbPagosScrollEmp;
    // End of variables declaration//GEN-END:variables
}
