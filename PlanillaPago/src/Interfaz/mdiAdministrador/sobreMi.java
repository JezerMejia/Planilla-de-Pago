/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiAdministrador;

import Usuarios.Administrador;

/**
 *
 * @author Gimena Navarrete
 */
public class sobreMi extends javax.swing.JInternalFrame {
    private Administrador administrador;

    /**
     * Creates new form sobreMi
     */
    public sobreMi() {
        initComponents();
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreS = new javax.swing.JLabel();
        apellidoS = new javax.swing.JLabel();
        idS = new javax.swing.JLabel();
        fechanNacS = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Yo");
        setVisible(true);

        nombreS.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombreS.setText("Nombre: ");

        apellidoS.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        apellidoS.setText("Apellido: ");

        idS.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idS.setText("ID: ");

        fechanNacS.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        fechanNacS.setText("Fecha de nacimiento: ");

        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Aqui podira ir algo extra");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechanNacS)
                            .addComponent(idS)
                            .addComponent(apellidoS)
                            .addComponent(nombreS)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nombreS)
                .addGap(18, 18, 18)
                .addComponent(apellidoS)
                .addGap(18, 18, 18)
                .addComponent(idS)
                .addGap(18, 18, 18)
                .addComponent(fechanNacS)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidoS;
    private javax.swing.JLabel fechanNacS;
    private javax.swing.JLabel idS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nombreS;
    // End of variables declaration//GEN-END:variables
}
