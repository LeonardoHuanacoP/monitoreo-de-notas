/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package monitoreonotastpoo;

/**
 *
 * @author Acer
 */
public class pantalaMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form pantalaMenuAdmin
     */
    public pantalaMenuAdmin() {
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

        jLabel1 = new javax.swing.JLabel();
        btnEstudiantesAdmin = new javax.swing.JButton();
        btnProfeAdmin = new javax.swing.JButton();
        btnPadresAdmin = new javax.swing.JButton();
        btnCursosGruposAdmin = new javax.swing.JButton();
        btnRegresarinic = new javax.swing.JButton();
        btnAdminAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu de Gestion");

        btnEstudiantesAdmin.setText("Estudiantes");
        btnEstudiantesAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesAdminActionPerformed(evt);
            }
        });

        btnProfeAdmin.setText("Profesores");
        btnProfeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfeAdminActionPerformed(evt);
            }
        });

        btnPadresAdmin.setText("Padres");
        btnPadresAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPadresAdminActionPerformed(evt);
            }
        });

        btnCursosGruposAdmin.setText("Cursos y grupos");
        btnCursosGruposAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosGruposAdminActionPerformed(evt);
            }
        });

        btnRegresarinic.setText("Regresar inicio");
        btnRegresarinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarinicActionPerformed(evt);
            }
        });

        btnAdminAdmin.setText("administrador");
        btnAdminAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProfeAdmin)
                                    .addComponent(btnEstudiantesAdmin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnPadresAdmin))))
                            .addComponent(btnCursosGruposAdmin)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresarinic))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnAdminAdmin)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEstudiantesAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnProfeAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPadresAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCursosGruposAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnAdminAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnRegresarinic)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstudiantesAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesAdminActionPerformed
        // TODO add your handling code here:
        PantallaGEsEstudiantes pantallaGEsEstudiantes = new PantallaGEsEstudiantes();
        pantallaGEsEstudiantes.setVisible(true);
    }//GEN-LAST:event_btnEstudiantesAdminActionPerformed

    private void btnProfeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfeAdminActionPerformed
        PantallaGesProfesor pantallaGesProfesor = new PantallaGesProfesor();
                pantallaGesProfesor.setVisible(true);
    }//GEN-LAST:event_btnProfeAdminActionPerformed

    private void btnPadresAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPadresAdminActionPerformed
        // TODO add your handling code here:
        PantallaGesPadres pntallaGesPadres  = new PantallaGesPadres();
        pntallaGesPadres.setVisible(true);
    }//GEN-LAST:event_btnPadresAdminActionPerformed

    private void btnCursosGruposAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosGruposAdminActionPerformed
         // Cerrar la ventana del menú (pantalaMenuAdmin)
    this.dispose();
    
    // Crear y mostrar la ventana de gestión de cursos y grupos
    PantallaGesCursosGrupos pantallaCursosGrupos = new PantallaGesCursosGrupos();
    pantallaCursosGrupos.setVisible(true);
    }//GEN-LAST:event_btnCursosGruposAdminActionPerformed

    private void btnAdminAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminAdminActionPerformed
        // TODO add your handling code here:
        PantallaGesAdmin pantallaGesAdmin = new PantallaGesAdmin();
                pantallaGesAdmin.setVisible(true);
    }//GEN-LAST:event_btnAdminAdminActionPerformed

    private void btnRegresarinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarinicActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarinicActionPerformed

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
            java.util.logging.Logger.getLogger(pantalaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalaMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalaMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminAdmin;
    private javax.swing.JButton btnCursosGruposAdmin;
    private javax.swing.JButton btnEstudiantesAdmin;
    private javax.swing.JButton btnPadresAdmin;
    private javax.swing.JButton btnProfeAdmin;
    private javax.swing.JButton btnRegresarinic;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
