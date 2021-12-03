/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiAdministrador;

import Planilla.PlanillaPago;
import java.awt.Color;

import Usuarios.Administrador;
import Usuarios.Empleado;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gimena Navarrete
 */
public class editarEmpleado extends javax.swing.JInternalFrame {

    private Administrador administrador;
    private Trabajadores trabajadores;

    /**
     * Creates new form editarEmpleado
     */
    public editarEmpleado(Administrador administrador, Trabajadores trabajadores) {
        this.administrador = administrador;
        this.trabajadores = trabajadores;
        initComponents();
        buscar.setEnabled(false);
        buscar.setBackground(new Color(204,204,204));
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    public void setEditarEmpleado(int id) {
        PlanillaPago planilla = this.administrador.getPlanillaPago();
        ArrayList<Empleado> array = planilla.getTablaEmpleados().getTabla();
        
        Empleado empleado = null;
        for (Empleado registro : array) {
            if (registro.getId() == id) {
                empleado = registro;
            }
        }
        if (empleado == null) return;
        
        this.nombreTF.setText(empleado.getNombre());
        this.apellidoTF.setText(empleado.getApellido());
        this.cargoTF.setText(empleado.getCargo());
        this.contraTF.setText(empleado.getContraseña());
        if (empleado.getPrivilegios() == 0)
            this.privilegiosCB.setSelectedIndex(0);
        else
            this.privilegiosCB.setSelectedIndex(1);
    }

    public void iniciarBoton(){
        
        if(!idTF.getText().isEmpty()){
            buscar.setEnabled(true);
            buscar.setBackground(new Color(247,104,8));
        }else{
            buscar.setEnabled(false);
            buscar.setBackground(new Color(204,204,204));
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelID = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        contra = new javax.swing.JLabel();
        nombreEmp = new javax.swing.JLabel();
        contraTF = new javax.swing.JTextField();
        apellidoEmp = new javax.swing.JLabel();
        cargoEmp = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        apellidoTF = new javax.swing.JTextField();
        cargoTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        contra1 = new javax.swing.JLabel();
        privilegiosCB = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Editar Empleado");
        setVisible(true);

        labelID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        labelID.setText("ID:");

        idTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        idTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idTFKeyReleased(evt);
            }
        });

        buscar.setBackground(new java.awt.Color(255, 102, 0));
        buscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        contra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        contra.setText("Contraseña:");

        nombreEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreEmp.setText("Nombre: ");

        contraTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        contraTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contraTFKeyReleased(evt);
            }
        });

        apellidoEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        apellidoEmp.setText("Apellido: ");

        cargoEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cargoEmp.setText("Cargo: ");

        nombreTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 104, 8)));
        nombreTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreTFKeyReleased(evt);
            }
        });

        apellidoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        apellidoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidoTFKeyReleased(evt);
            }
        });

        cargoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        cargoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cargoTFKeyReleased(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        contra1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        contra1.setText("Privilegios:");

        privilegiosCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(contra)
                                .addComponent(contra1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(privilegiosCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(apellidoEmp)
                                .addComponent(nombreEmp)
                                .addComponent(cargoEmp))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(apellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cargoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelID)
                    .addComponent(buscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreEmp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoEmp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoEmp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contra)
                    .addComponent(contraTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contra1)
                    .addComponent(privilegiosCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTFKeyReleased
       iniciarBoton();
    }//GEN-LAST:event_idTFKeyReleased

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String id_str = this.idTF.getText();
        if (id_str.isBlank()) return;
        
        int id = 0;
        try {
            id = Integer.parseInt(id_str);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un número", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.setEditarEmpleado(id);
    }//GEN-LAST:event_buscarActionPerformed

    private void contraTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_contraTFKeyReleased

    private void nombreTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_nombreTFKeyReleased

    private void apellidoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_apellidoTFKeyReleased

    private void cargoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_cargoTFKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id_str = this.idTF.getText();
        String nombre_str = this.nombreTF.getText();
        String apellido_str = this.apellidoTF.getText();
        String cargo_str = this.cargoTF.getText();
        String contra_str = this.contraTF.getText();
        int privilegios = this.privilegiosCB.getSelectedIndex();
        
        if (id_str.isBlank()) return;
        
        int id = 0;
        try {
            id = Integer.parseInt(id_str);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un número", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.administrador.editarEmpleado(id, nombre_str, apellido_str, cargo_str, contra_str, privilegios);
        this.trabajadores.getTbEmpleados().setModel(this.trabajadores.arrayToTable(null));
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoEmp;
    private javax.swing.JTextField apellidoTF;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel cargoEmp;
    private javax.swing.JTextField cargoTF;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel contra1;
    private javax.swing.JTextField contraTF;
    private javax.swing.JTextField idTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel nombreEmp;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JComboBox<String> privilegiosCB;
    // End of variables declaration//GEN-END:variables
}
