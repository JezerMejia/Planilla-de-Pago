/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiEmpleado;

import java.awt.Color;

import Usuarios.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author Gimena Navarrete
 */
public class solicitarAdelanto extends javax.swing.JInternalFrame {

    private Empleado empleado;
    private Adelantos adelantos;

    /**
     * Creates new form solicitarAdelanto
     */
    public solicitarAdelanto(Empleado empleado, Adelantos adelantos) {
        this.empleado = empleado;
        this.adelantos = adelantos;
        initComponents();
        enviarB.setEnabled(false);
        enviarB.setBackground(new Color(204,204,204));
    }

    public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public void iniciarBoton(){
        
        if(!cantSolTF.getText().isEmpty()){
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

        cantidadSol = new javax.swing.JLabel();
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

        cantidadSol.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cantidadSol.setText("Cantidad de dinero a adelantar: ");

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
        enviarB.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        enviarB.setText("Enviar Solicitud");
        enviarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(cantidadSol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cantSolTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(justificacionSol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 240, Short.MAX_VALUE)
                        .addComponent(enviarB)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cantidadSol)
                    .addComponent(cantSolTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(justificacionSol)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enviarB)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantSolTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantSolTFKeyReleased
        iniciarBoton();
    }//GEN-LAST:event_cantSolTFKeyReleased

    private void enviarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarBActionPerformed
        String monto_str = this.cantSolTF.getText();
        String justificacion = this.justificacion.getText();
        if (monto_str.isBlank()) return;
        
        Float monto = 0f;
        try {
            monto = Float.parseFloat(monto_str);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa un número", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.empleado.solicitarAdelanto(monto, justificacion);
        this.adelantos.getTbAdelanto().setModel(this.adelantos.arrayToTable());
    }//GEN-LAST:event_enviarBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantSolTF;
    private javax.swing.JLabel cantidadSol;
    private javax.swing.JButton enviarB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea justificacion;
    private javax.swing.JLabel justificacionSol;
    // End of variables declaration//GEN-END:variables
}
