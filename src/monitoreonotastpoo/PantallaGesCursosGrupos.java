/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package monitoreonotastpoo;
import javax.swing.*;

/**
 *
 * @author Acer
 */
public class PantallaGesCursosGrupos extends javax.swing.JFrame {

      // Modelos para las listas
    private DefaultListModel<String> modeloCursos;
    private DefaultListModel<String> modeloGrupos;

    public PantallaGesCursosGrupos() {
        initComponents();
        // Inicializar los modelos de las listas
        modeloCursos = new DefaultListModel<>();
        modeloGrupos = new DefaultListModel<>();
        jList1.setModel(modeloCursos);
        jList2.setModel(modeloGrupos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCURSO = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoGRupo = new javax.swing.JTextField();
        btnagregarGrupo = new javax.swing.JButton();
        btneliminarGrupo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        btnREgresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnagregarcurso = new javax.swing.JButton();
        btnelimianrcurso = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CURSOS");

        jLabel2.setText("Nombre");

        txtCURSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCURSOActionPerformed(evt);
            }
        });

        jLabel3.setText("GRUPOS");

        jLabel4.setText("GRUPO CODIGO");

        txtCodigoGRupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoGRupoActionPerformed(evt);
            }
        });

        btnagregarGrupo.setText("agregar");
        btnagregarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarGrupoActionPerformed(evt);
            }
        });

        btneliminarGrupo.setText("eliminar");
        btneliminarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarGrupoActionPerformed(evt);
            }
        });

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        btnREgresar.setText("REGRESAR");
        btnREgresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREgresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnagregarGrupo)
                                    .addComponent(txtCodigoGRupo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btneliminarGrupo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnREgresar)
                                .addGap(19, 19, 19)))
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoGRupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnagregarGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminarGrupo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnREgresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        btnagregarcurso.setText("agregar");
        btnagregarcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarcursoActionPerformed(evt);
            }
        });

        btnelimianrcurso.setText("eliminar");
        btnelimianrcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimianrcursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCURSO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnelimianrcurso)
                                    .addComponent(btnagregarcurso))))))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCURSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnagregarcurso)
                        .addGap(18, 18, 18)
                        .addComponent(btnelimianrcurso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCURSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCURSOActionPerformed
        
    }//GEN-LAST:event_txtCURSOActionPerformed

    private void btnagregarcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarcursoActionPerformed
        // TODO add your handling code here:
        agregarCurso();
    }//GEN-LAST:event_btnagregarcursoActionPerformed

    private void btnelimianrcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimianrcursoActionPerformed
        // TODO add your handling code here:
         eliminarCurso();
    }//GEN-LAST:event_btnelimianrcursoActionPerformed

    private void txtCodigoGRupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoGRupoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtCodigoGRupoActionPerformed

    private void btnagregarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarGrupoActionPerformed
        // TODO add your handling code here:
        agregarGrupo();
    }//GEN-LAST:event_btnagregarGrupoActionPerformed

    private void btneliminarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarGrupoActionPerformed
        // TODO add your handling code here:
        eliminarGrupo();
    }//GEN-LAST:event_btneliminarGrupoActionPerformed

    private void btnREgresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREgresarActionPerformed
        // Cerrar la ventana de gestión de cursos y grupos
    this.dispose();
    
    // Crear y mostrar la ventana del menú de administración
    pantalaMenuAdmin menuAdmin = new pantalaMenuAdmin();
    menuAdmin.setVisible(true);
    }//GEN-LAST:event_btnREgresarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private void agregarCurso() {
    String curso = txtCURSO.getText().trim();
    if (!curso.isEmpty()) {
        modeloCursos.addElement(curso);
        txtCURSO.setText(""); // Limpiar campo de texto
    } else {
        JOptionPane.showMessageDialog(this, "El nombre del curso no puede estar vacío.");
    }
}

private void eliminarCurso() {
    int selectedIndex = jList1.getSelectedIndex();
    if (selectedIndex != -1) {
        modeloCursos.remove(selectedIndex);
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un curso para eliminar.");
    }
}

private void agregarGrupo() {
    String grupo = txtCodigoGRupo.getText().trim();
    if (!grupo.isEmpty()) {
        modeloGrupos.addElement(grupo);
        txtCodigoGRupo.setText(""); // Limpiar campo de texto
    } else {
        JOptionPane.showMessageDialog(this, "El código del grupo no puede estar vacío.");
    }
}

private void eliminarGrupo() {
    int selectedIndex = jList2.getSelectedIndex();
    if (selectedIndex != -1) {
        modeloGrupos.remove(selectedIndex);
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un grupo para eliminar.");
    }
}
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
            java.util.logging.Logger.getLogger(PantallaGesCursosGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaGesCursosGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaGesCursosGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaGesCursosGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaGesCursosGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnREgresar;
    private javax.swing.JButton btnagregarGrupo;
    private javax.swing.JButton btnagregarcurso;
    private javax.swing.JButton btnelimianrcurso;
    private javax.swing.JButton btneliminarGrupo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCURSO;
    private javax.swing.JTextField txtCodigoGRupo;
    // End of variables declaration//GEN-END:variables
}
