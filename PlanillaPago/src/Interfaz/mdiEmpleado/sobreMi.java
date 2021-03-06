/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiEmpleado;

import Interfaz.Login;
import Usuarios.Empleado;

/**
 *
 * @author Gimena Navarrete
 */
public class sobreMi extends javax.swing.JInternalFrame {
    private Empleado empleado;
    /**
     * Creates new form Yo
     */
    public sobreMi(Empleado empleado) {
        this.empleado = empleado;
        initComponents();
    }
    
    public Empleado getAdministrador() {
        return empleado;
    }

    public void setAdministrador(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreEmp = new javax.swing.JLabel();
        idEmp = new javax.swing.JLabel();
        cargoEmp = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        cargo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Sobre mi");
        setVisible(true);

        nombreEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreEmp.setText(this.empleado.getNombre() + " " + this.empleado.getApellido());

        idEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idEmp.setText("" + this.empleado.getId());

        cargoEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cargoEmp.setText(this.empleado.getCargo());

        nombre.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        nombre.setText("Nombre:");

        id.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        id.setText("ID:");

        cargo.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        cargo.setText("Cargo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre)
                    .addComponent(id)
                    .addComponent(cargo))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cargoEmp)
                    .addComponent(idEmp)
                    .addComponent(nombreEmp))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEmp)
                    .addComponent(nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idEmp)
                    .addComponent(id))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cargoEmp)
                    .addComponent(cargo))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    private void nombreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTFActionPerformed
        nombreTF.setText(this.empleado.getNombre()); 
    }//GEN-LAST:event_nombreTFActionPerformed

    private void apellidoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTFActionPerformed
         apellidoTF.setText(this.empleado.getApellido());
    }//GEN-LAST:event_apellidoTFActionPerformed
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cargo;
    private javax.swing.JLabel cargoEmp;
    private javax.swing.JLabel id;
    private javax.swing.JLabel idEmp;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreEmp;
    // End of variables declaration//GEN-END:variables
}
