/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiAdministrador;

import static Interfaz.mdiAdministrador.AdministradorC.centralA;
import Planilla.PlanillaPago;
import Registros.RegistroAdelanto;
import Registros.RegistroPago;
import Usuarios.Administrador;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gimena Navarrete
 */
public class Solicitudes extends javax.swing.JInternalFrame {

    private Administrador administrador;

    /**
     * Creates new form Solicitud
     */
    public Solicitudes(Administrador administrador) {
        this.administrador = administrador;
        initComponents();
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    public DefaultTableModel arrayToTable() {
        PlanillaPago planilla = this.administrador.getPlanillaPago();
        ArrayList<RegistroAdelanto> array = planilla.getTablaAdelantos().getTabla();

        String[] columnas = { "Num", "Monto", "Estado", "Justificación" ,"Fecha", "idEmpleado" };
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (RegistroAdelanto registro : array) {
            String estado = "En progreso...";
            if (registro.getAceptado() == 1)
                estado = "Aceptado";
            if (registro.getAceptado() == 2)
                estado = "Rechazado";
            Object[] datos = {
                registro.getNum(),
                registro.getAdelanto(),
                estado,
                registro.getJustificacion(),
                registro.getFecha(),
                registro.getEmpleado().getId(),
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

        tbSolicitudScroll = new javax.swing.JScrollPane();
        tbSolicitud = new javax.swing.JTable();
        admSolicitudes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Solicitudes");
        setVisible(true);

        tbSolicitud.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        tbSolicitud.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tbSolicitud.setModel(this.arrayToTable());
        tbSolicitudScroll.setViewportView(tbSolicitud);

        admSolicitudes.setBackground(new java.awt.Color(255, 102, 0));
        admSolicitudes.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        admSolicitudes.setText("Administrar Solicitudes");
        admSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admSolicitudesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tbSolicitudScroll)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(admSolicitudes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(admSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(tbSolicitudScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admSolicitudesActionPerformed
        AdministrarAdelantos adm = new AdministrarAdelantos(this.administrador, this);
        AdministradorC.centralA.add(adm);
        Dimension desktopSize = centralA.getSize();
        Dimension FrameSize = adm.getSize();
        adm.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        adm.show();
        adm.toFront();
    }//GEN-LAST:event_admSolicitudesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admSolicitudes;
    private javax.swing.JTable tbSolicitud;
    private javax.swing.JScrollPane tbSolicitudScroll;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the tbSolicitud
     */
    public javax.swing.JTable getTbSolicitud() {
        return tbSolicitud;
    }
}
