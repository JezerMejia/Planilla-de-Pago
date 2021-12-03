/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiAdministrador;

import java.awt.Color;

/**
 *
 * @author Gimena Navarrete
 */
public class editarEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form editarEmpleado
     */
    public editarEmpleado() {
        initComponents();
        buscar.setEnabled(false);
        buscar.setBackground(new Color(204,204,204));
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
        ScrolltbEdit = new javax.swing.JScrollPane();
        tbEmpEdit = new javax.swing.JTable();
        asAdmin = new javax.swing.JButton();
        desEmo = new javax.swing.JButton();
        buscar = new javax.swing.JButton();

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

        ScrolltbEdit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        tbEmpEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Cargo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrolltbEdit.setViewportView(tbEmpEdit);

        asAdmin.setBackground(new java.awt.Color(204, 102, 0));
        asAdmin.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        asAdmin.setText("Ascender a administrador");

        desEmo.setBackground(new java.awt.Color(255, 102, 0));
        desEmo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        desEmo.setText("Descender a empleado");

        buscar.setBackground(new java.awt.Color(255, 102, 0));
        buscar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        buscar.setText("Buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScrolltbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(asAdmin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(desEmo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar)))
                .addContainerGap(20, Short.MAX_VALUE))
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
                .addComponent(ScrolltbEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asAdmin)
                    .addComponent(desEmo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTFKeyReleased
       iniciarBoton();
    }//GEN-LAST:event_idTFKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrolltbEdit;
    private javax.swing.JButton asAdmin;
    private javax.swing.JButton buscar;
    private javax.swing.JButton desEmo;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel labelID;
    private javax.swing.JTable tbEmpEdit;
    // End of variables declaration//GEN-END:variables
}
