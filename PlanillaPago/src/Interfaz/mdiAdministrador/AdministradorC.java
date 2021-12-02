/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz.mdiAdministrador;

import Interfaz.Login;
import Interfaz.mdiEmpleado.ImagenFondo;
import Usuarios.Administrador;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 *
 * @author Gimena Navarrete
 */
public class AdministradorC extends javax.swing.JFrame {

   //public InputStream foto1 = this.getClass().getResourceAsStream("/Iconos/fondoCentral.png");
    private Administrador administrador;
    
    public AdministradorC() {
        initComponents();
        this.setLocationRelativeTo(null);
        //cargarImagen(centralA,foto1);
        //setSize(700,700);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/logo.png")).getImage());
        logo.setHorizontalAlignment(SwingConstants.CENTER);
        logo.setVerticalAlignment(SwingConstants.CENTER);
        
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    /*public void cargarImagen(javax.swing.JDesktopPane jDesk, InputStream fileImage){
      
        try{
            BufferedImage image = ImageIO.read(fileImage);
            jDesk.setBorder(new ImagenFondo(image));
        }catch(Exception e){
            System.out.println("No hay imagen");
        }
        
    }
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        centralA = new javax.swing.JDesktopPane();
        logo = new javax.swing.JLabel();
        BarraMAdministrador = new javax.swing.JMenuBar();
        rePago = new javax.swing.JMenu();
        solAdelanto = new javax.swing.JMenu();
        Empleados = new javax.swing.JMenu();
        sobreMi = new javax.swing.JMenu();
        salir = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();
        cerrarPro = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleado");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        centralA.setBackground(new java.awt.Color(255, 255, 255));
        centralA.setOpaque(false);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo3.png"))); // NOI18N

        centralA.setLayer(logo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout centralALayout = new javax.swing.GroupLayout(centralA);
        centralA.setLayout(centralALayout);
        centralALayout.setHorizontalGroup(
            centralALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centralALayout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(286, 286, 286))
        );
        centralALayout.setVerticalGroup(
            centralALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centralALayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(logo)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        BarraMAdministrador.setBackground(new java.awt.Color(255, 169, 133));
        BarraMAdministrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        rePago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/metodo-de-pago (1).png"))); // NOI18N
        rePago.setText("Realizar Pago");
        rePago.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rePago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rePagoMouseClicked(evt);
            }
        });
        BarraMAdministrador.add(rePago);

        solAdelanto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/perfiles (1).png"))); // NOI18N
        solAdelanto.setText("Solictudes de adelanto");
        solAdelanto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        solAdelanto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solAdelantoMouseClicked(evt);
            }
        });
        BarraMAdministrador.add(solAdelanto);

        Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/empleado.png"))); // NOI18N
        Empleados.setText("Empleados");
        Empleados.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpleadosMouseClicked(evt);
            }
        });
        BarraMAdministrador.add(Empleados);

        sobreMi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario (1) (1).png"))); // NOI18N
        sobreMi.setText("Sobre mi");
        sobreMi.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        sobreMi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sobreMiMouseClicked(evt);
            }
        });
        BarraMAdministrador.add(sobreMi);

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-sesion.png"))); // NOI18N
        salir.setText("Salir");
        salir.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        cerrarSesion.setText("Cerrar Sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        salir.add(cerrarSesion);

        cerrarPro.setText("Cerrar Programa");
        cerrarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarProActionPerformed(evt);
            }
        });
        salir.add(cerrarPro);

        BarraMAdministrador.add(salir);

        setJMenuBar(BarraMAdministrador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(centralA)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(centralA)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rePagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rePagoMouseClicked
        RealizarPago rp = new RealizarPago();
        
        centralA.add(rp);
        Dimension desktopSize = centralA.getSize();
        Dimension FrameSize = rp.getSize();
        rp.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        rp.show();
        rp.toFront();
        
        
    }//GEN-LAST:event_rePagoMouseClicked

    private void solAdelantoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_solAdelantoMouseClicked
        Solicitudes sol = new Solicitudes();
        
        centralA.add(sol);
        Dimension desktopSize = centralA.getSize();
        Dimension FrameSize = sol.getSize();
        sol.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        sol.show();
        sol.toFront();
    }//GEN-LAST:event_solAdelantoMouseClicked

    private void EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpleadosMouseClicked
        Trabajadores trab = new Trabajadores();
         
        centralA.add(trab);
        Dimension desktopSize = centralA.getSize();
        Dimension FrameSize = trab.getSize();
        trab.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        trab.show();
        trab.toFront();
    }//GEN-LAST:event_EmpleadosMouseClicked

    private void sobreMiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sobreMiMouseClicked
       sobreMi sm = new sobreMi();
       
       centralA.add(sm);
       Dimension desktopSize = centralA.getSize();
        Dimension FrameSize = sm.getSize();
        sm.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        sm.show();
        sm.toFront();
    }//GEN-LAST:event_sobreMiMouseClicked

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
       Login lo = new Login();
       
       lo.setVisible(true);
       dispose();
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void cerrarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarProActionPerformed
       System.exit(0);
    }//GEN-LAST:event_cerrarProActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministradorC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMAdministrador;
    private javax.swing.JMenu Empleados;
    public static javax.swing.JDesktopPane centralA;
    private javax.swing.JMenuItem cerrarPro;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JLabel logo;
    private javax.swing.JMenu rePago;
    private javax.swing.JMenu salir;
    private javax.swing.JMenu sobreMi;
    private javax.swing.JMenu solAdelanto;
    // End of variables declaration//GEN-END:variables
}
