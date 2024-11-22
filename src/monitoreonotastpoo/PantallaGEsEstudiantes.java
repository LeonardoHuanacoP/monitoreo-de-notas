/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package monitoreonotastpoo;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class PantallaGEsEstudiantes extends javax.swing.JFrame {
  private ArrayList<Estudiante> estudiantes = new ArrayList<>(); // Lista de estudiantes
    private DefaultListModel<String> modeloLista = new DefaultListModel<>(); // Modelo para la lista
    

    /**
     * Creates new form PantallaGEsEstudiantes
     */
    public PantallaGEsEstudiantes() {
        initComponents();
        ListaEStudiantes.setModel(modeloLista);
    }
     private void actualizarLista() {
         modeloLista.clear(); // Limpiar la lista actual
        for (Estudiante est : estudiantes) {
            modeloLista.addElement(est.toString()); // Agregar a la lista el toString() de cada estudiante
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnregresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombreEstu = new javax.swing.JTextField();
        txtApellEstu = new javax.swing.JTextField();
        txtCodigoEstu = new javax.swing.JTextField();
        jComboBoxGrupo = new javax.swing.JComboBox<>();
        btnAgregarEstu = new javax.swing.JButton();
        btnEditarEstu = new javax.swing.JButton();
        btneliminarEstu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaEStudiantes = new javax.swing.JList<>();

        jLabel4.setText("jLabel4");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GESTION DE ESTUDIANTES");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel5.setText("Codigo");

        btnregresar.setText("REGRESAR");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        jLabel6.setText("Grupo");

        txtNombreEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEstuActionPerformed(evt);
            }
        });

        txtApellEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellEstuActionPerformed(evt);
            }
        });

        txtCodigoEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEstuActionPerformed(evt);
            }
        });

        jComboBoxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGrupoActionPerformed(evt);
            }
        });

        btnAgregarEstu.setText("agregar");
        btnAgregarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstuActionPerformed(evt);
            }
        });

        btnEditarEstu.setText("editar");
        btnEditarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEstuActionPerformed(evt);
            }
        });

        btneliminarEstu.setText("eliminar");
        btneliminarEstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarEstuActionPerformed(evt);
            }
        });

        ListaEStudiantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaEStudiantes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnregresar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregarEstu)
                                .addGap(55, 55, 55)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellEstu, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEditarEstu)
                                .addGap(69, 69, 69)
                                .addComponent(btneliminarEstu)
                                .addGap(83, 83, 83))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodigoEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellEstu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEstu)
                    .addComponent(btneliminarEstu)
                    .addComponent(btnEditarEstu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnregresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGrupoActionPerformed

    private void txtApellEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellEstuActionPerformed

    private void txtNombreEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEstuActionPerformed

    private void txtCodigoEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEstuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEstuActionPerformed

    private void btnAgregarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstuActionPerformed
        String nombre = txtNombreEstu.getText();
        String apellido = txtApellEstu.getText();
        String codigo = txtCodigoEstu.getText();
        String grupo = (String) jComboBoxGrupo.getSelectedItem();
        
        // Crear nuevo estudiante y agregarlo a la lista
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, codigo, grupo);
        estudiantes.add(nuevoEstudiante);
        
        // Actualizar la lista visualmente en el JList
        actualizarLista();
    }//GEN-LAST:event_btnAgregarEstuActionPerformed

    private void btnEditarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEstuActionPerformed
      int selectedIndex = ListaEStudiantes.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un estudiante para editar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Estudiante estudianteSeleccionado = estudiantes.get(selectedIndex);
        
        txtNombreEstu.setText(estudianteSeleccionado.getNombre());
txtApellEstu.setText(estudianteSeleccionado.getApellido());
txtCodigoEstu.setText(estudianteSeleccionado.getCodigo());
        jComboBoxGrupo.setSelectedItem(estudianteSeleccionado.getGrupo());
        
        // Una vez que el usuario edite y presione un botón para
    }//GEN-LAST:event_btnEditarEstuActionPerformed

    private void btneliminarEstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarEstuActionPerformed
         int selectedIndex = ListaEStudiantes.getSelectedIndex(); // Obtener el índice seleccionado
        
        if (selectedIndex != -1) {
            estudiantes.remove(selectedIndex); // Eliminar estudiante de la lista
            actualizarLista(); // Actualizar la lista en el JList
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un estudiante para eliminar.");
        }
    }//GEN-LAST:event_btneliminarEstuActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaGEsEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaGEsEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaGEsEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaGEsEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaGEsEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaEStudiantes;
    private javax.swing.JButton btnAgregarEstu;
    private javax.swing.JButton btnEditarEstu;
    private javax.swing.JButton btneliminarEstu;
    private javax.swing.JButton btnregresar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxGrupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellEstu;
    private javax.swing.JTextField txtCodigoEstu;
    private javax.swing.JTextField txtNombreEstu;
    // End of variables declaration//GEN-END:variables
}