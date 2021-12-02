/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiEmpleado;

import java.awt.Color;

/**
 *
 * @author Gimena Navarrete
 */
public class solicitarAdelanto extends javax.swing.JInternalFrame {

    /**
     * Creates new form solicitarAdelanto
     */
    public solicitarAdelanto() {
        initComponents();
        enviarB.setEnabled(false);
        enviarB.setBackground(new Color(204,204,204));
    }

    public void iniciarBoton(){
        
        if(!idSolTF.getText().isEmpty() && !cantSolTF.getText().isEmpty()){
            enviarB.setEnabled(true);
            enviarB.setBackground(new Color(247,104,8));
            
        }else{
            enviarB.setEnabled(false);
            enviarB.setBackground(new Color(204,204,204));
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idSol = new javax.swing.JLabel();
        cantidadSol = new javax.swing.JLabel();
        idSolTF = new javax.swing.JTextField();
        cantSolTF = new javax.swing.JTextField();
        justificacionSol = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        justificacion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        enviarB = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Solicitar Adelanto");

        idSol.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        idSol.setText("ID: ");

        cantidadSol.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cantidadSol.setText("Cantidad de dinero a adelantar: ");

        idSolTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        idSolTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idSolTFKeyReleased(evt);
            }
        });

        cantSolTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        cantSolTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantSolTFKeyReleased(evt);
            }
        });

        justificacionSol.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        justificacionSol.setText("Justificacion: ");

        justificacion.setColumns(20);
        justificacion.setLineWrap(true);
        justificacion.setRows(5);
        justificacion.setWrapStyleWord(true);
        justificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jScrollPane1.setViewportView(justificacion);

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));

        enviarB.setBackground(new java.awt.Color(255, 102, 0));
        enviarB.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        enviarB.setText("Enviar Solicitud");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantidadSol)
                    .addComponent(idSol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantSolTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idSolTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(justificacionSol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enviarB)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idSol)
                    .addComponent(idSolTF, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadSol)
                    .addComponent(cantSolTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(justificacionSol)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviarB)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idSolTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idSolTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_idSolTFKeyReleased

    private void cantSolTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantSolTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_cantSolTFKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantSolTF;
    private javax.swing.JLabel cantidadSol;
    private javax.swing.JButton enviarB;
    private javax.swing.JLabel idSol;
    private javax.swing.JTextField idSolTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea justificacion;
    private javax.swing.JLabel justificacionSol;
    // End of variables declaration//GEN-END:variables
}
