/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiAdministrador;

import java.awt.Color;
import Usuarios.Administrador;

/**
 *
 * @author Gimena Navarrete
 */
public class crearEmpleado extends javax.swing.JInternalFrame {

    private Administrador administrador;

    /**
     * Creates new form crearEmpleado
     */
    public crearEmpleado() {
        initComponents();
        crearEmp.setEnabled(false);
        crearEmp.setBackground(new Color(204,204,204));
        
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public void iniciarBoton(){
        
        if(!nombreTF.getText().isEmpty() && !apellidoTF.getText().isEmpty() && !cargoTF.getText().isEmpty() &&
           !idTF.getText().isEmpty() && !contraTF.getText().isEmpty()){
            crearEmp.setEnabled(true);
            crearEmp.setBackground(new Color(247,104,8));
        
        }else{
            crearEmp.setEnabled(false);
            crearEmp.setBackground(new Color(204,204,204));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreEmp = new javax.swing.JLabel();
        apellidoEmp = new javax.swing.JLabel();
        cargoEmp = new javax.swing.JLabel();
        idEmp = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        apellidoTF = new javax.swing.JTextField();
        cargoTF = new javax.swing.JTextField();
        idTF = new javax.swing.JTextField();
        crearEmp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        contra = new javax.swing.JLabel();
        contraTF = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Crear Empleado");
        setVisible(true);

        nombreEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreEmp.setText("Nombre: ");

        apellidoEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        apellidoEmp.setText("Apellido: ");

        cargoEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cargoEmp.setText("Cargo: ");

        idEmp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idEmp.setText("ID:");

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

        idTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        idTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idTFKeyReleased(evt);
            }
        });

        crearEmp.setBackground(new java.awt.Color(247, 104, 8));
        crearEmp.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        crearEmp.setText("Crear Empleado");
        crearEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEmpActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        contra.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        contra.setText("Contraseña:");

        contraTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        contraTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contraTFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apellidoEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(apellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargoEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(contra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(nombreEmp)
                        .addGap(45, 45, 45)
                        .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(idEmp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crearEmp)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
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
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idEmp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contra)
                    .addComponent(contraTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_nombreTFKeyReleased

    private void apellidoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_apellidoTFKeyReleased

    private void cargoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargoTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_cargoTFKeyReleased

    private void idTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTFKeyReleased
        iniciarBoton(); 
    }//GEN-LAST:event_idTFKeyReleased

    private void contraTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraTFKeyReleased
       iniciarBoton(); 
    }//GEN-LAST:event_contraTFKeyReleased

    private void crearEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEmpActionPerformed
        this.administrador.crearEmpleado(Integer.parseInt(idTF.getText()), nombreTF.getText(), apellidoTF.getText(), cargoTF.getText(), contraTF.getText());
    }//GEN-LAST:event_crearEmpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoEmp;
    private javax.swing.JTextField apellidoTF;
    private javax.swing.JLabel cargoEmp;
    private javax.swing.JTextField cargoTF;
    private javax.swing.JLabel contra;
    private javax.swing.JTextField contraTF;
    private javax.swing.JButton crearEmp;
    private javax.swing.JLabel idEmp;
    private javax.swing.JTextField idTF;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreEmp;
    private javax.swing.JTextField nombreTF;
    // End of variables declaration//GEN-END:variables
}
