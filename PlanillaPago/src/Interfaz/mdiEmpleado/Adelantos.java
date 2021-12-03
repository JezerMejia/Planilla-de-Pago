/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz.mdiEmpleado;

import java.awt.Dimension;
import static Interfaz.mdiEmpleado.EmpleadoC.centralE;

/**
 *
 * @author Gimena Navarrete
 */
public class Adelantos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Adelantos
     */
    public Adelantos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbAdelantoScroll = new javax.swing.JScrollPane();
        tbAdelanto = new javax.swing.JTable();
        soliAdelanto = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setVisible(true);

        tbAdelanto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        tbAdelanto.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        tbAdelanto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Estado", "Monto", "Justificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tbAdelanto.setMaximumSize(new java.awt.Dimension(75, 64));
        tbAdelantoScroll.setViewportView(tbAdelanto);

        soliAdelanto.setBackground(new java.awt.Color(255, 102, 0));
        soliAdelanto.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        soliAdelanto.setText("Solicitar Adelanto");
        soliAdelanto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soliAdelantoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbAdelantoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(soliAdelanto)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tbAdelantoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(soliAdelanto, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soliAdelantoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soliAdelantoMouseClicked
        solicitarAdelanto sa = new solicitarAdelanto();
        EmpleadoC.centralE.add(sa);
        Dimension desktopSize = centralE.getSize();
        Dimension FrameSize = sa.getSize();
        sa.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        sa.show();
        sa.toFront();
    }//GEN-LAST:event_soliAdelantoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton soliAdelanto;
    private javax.swing.JTable tbAdelanto;
    private javax.swing.JScrollPane tbAdelantoScroll;
    // End of variables declaration//GEN-END:variables
}
