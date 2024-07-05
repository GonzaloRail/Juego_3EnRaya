/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

/**
 *
 * @author Gonzalo
 */
public class ventanaInicial extends javax.swing.JFrame {
    
    private String usuario1;
    private String usuario2;
    
    public ventanaInicial() {
        initComponents();
        setSize(630, 600);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaNombre1 = new javax.swing.JTextField();
        cajaNombre2 = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzarJuego = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 608));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Tres en Raya");
        jPanel1.add(etiquetaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 633, -1));

        etiquetaNombre1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        etiquetaNombre1.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre1.setText("INGRESE JUGADOR 1: ");
        jPanel1.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        etiquetaNombre2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        etiquetaNombre2.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaNombre2.setText("INGRESE JUGADOR 2:");
        jPanel1.add(etiquetaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        cajaNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(cajaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 220, 33));

        cajaNombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombre2ActionPerformed(evt);
            }
        });
        jPanel1.add(cajaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 220, 30));

        botonGuardar.setBackground(new java.awt.Color(153, 153, 255));
        botonGuardar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        etiquetaMuestra1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        etiquetaMuestra1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(etiquetaMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 351, 318, -1));

        etiquetaMuestra2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        etiquetaMuestra2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(etiquetaMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 318, -1));

        botonComenzarJuego.setBackground(new java.awt.Color(153, 153, 255));
        botonComenzarJuego.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botonComenzarJuego.setForeground(new java.awt.Color(255, 255, 255));
        botonComenzarJuego.setText("Comenzar Juego");
        botonComenzarJuego.setVisible(false);
        botonComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(botonComenzarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/index.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombre1ActionPerformed

    private void cajaNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombre2ActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        usuario1=cajaNombre1.getText();
        usuario2=cajaNombre2.getText();
        botonGuardar.setVisible(false);
        etiquetaMuestra1.setText(usuario1+" usa la X");
        etiquetaMuestra2.setText(usuario2+" la O");
        botonComenzarJuego.setVisible(true);
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarJuegoActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal ventanaP=new VentanaPrincipal(usuario1, usuario2);
        ventanaP.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_botonComenzarJuegoActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzarJuego;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaNombre1;
    private javax.swing.JTextField cajaNombre2;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
