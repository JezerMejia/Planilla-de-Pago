/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Gimena Navarrete
 */
public class InicioDeSesion extends javax.swing.JFrame {

    /**
     * Creates new form Portada
     */
    public InicioDeSesion() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Contrasenia = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        contra = new javax.swing.JPasswordField();
        oc = new javax.swing.JButton();
        Ingresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        id = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo.png"))); // NOI18N
        jPanel3.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        Contrasenia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Contrasenia.setText("Contraseña:");
        jPanel3.add(Contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 120, 20));

        ID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ID.setText("ID:");
        jPanel3.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 30, 20));

        contra.setEnabled(false);
        jPanel3.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, -1));

        oc.setBackground(new java.awt.Color(51, 81, 249));
        oc.setText(":c");
        oc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocActionPerformed(evt);
            }
        });
        jPanel3.add(oc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        Ingresar.setBackground(new java.awt.Color(51, 51, 255));
        Ingresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        jPanel3.add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(id);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/fondo.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocActionPerformed
        JOptionPane.showMessageDialog(null,"ID = 12345\ncontra = 123");
    }//GEN-LAST:event_ocActionPerformed

    
    public void habilitarBoton(){
        if(!id.getText().isBlank() && !id.getText().isBlank()){
            contra.setEnabled(true);
        
        }else{
            contra.setEnabled(false);
        }
    }
    
    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        String Admin = "Pedro";
        String Usuario1 = "Luis Gerardo";
        String Usuario2 = "Ernesto Jose";
        String id1 = "12345",id2 = "678910";
        String contrasenia = "123";
        
        String pass = new String(contra.getPassword());
        
        
        if(id.getText().equals(id1) && pass.equals(contrasenia)){
            
            JOptionPane.showMessageDialog(null,"HA ACCEDIDO AL SISTEMA\nHola "+Usuario1);
        }else{
            JOptionPane.showMessageDialog(null,"ERROR CONTRASENIA Y/O USUARIO INCORRECTO");
        }
        
    }//GEN-LAST:event_IngresarActionPerformed

    private void idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_idKeyReleased

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
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contrasenia;
    private javax.swing.JLabel ID;
    private javax.swing.JButton Ingresar;
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField contra;
    private javax.swing.JTextPane id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton oc;
    // End of variables declaration//GEN-END:variables
}
