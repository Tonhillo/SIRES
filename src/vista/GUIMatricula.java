/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author dkmrfcb
 */
public class GUIMatricula extends javax.swing.JFrame {

    /**
     * Creates new form GUIMatricula
     */
    public GUIMatricula() {
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

        fieldNombreMatriculaCurso = new javax.swing.JTextField();
        labelNombreMatriculaCurso = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();
        labelNombreMatriculaEstudiante = new javax.swing.JLabel();
        fieldNombreMatriculaEstudiante = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldNombreMatriculaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreMatriculaCursoActionPerformed(evt);
            }
        });

        labelNombreMatriculaCurso.setText("Nombre del curso");

        labelMatricula.setFont(new java.awt.Font("Free Avant Garde Medium", 0, 18)); // NOI18N
        labelMatricula.setText("Matrícula");

        labelNombreMatriculaEstudiante.setText("Nombre del estudiante");

        fieldNombreMatriculaEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNombreMatriculaEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMatricula)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombreMatriculaCurso)
                        .addGap(18, 18, 18)
                        .addComponent(fieldNombreMatriculaCurso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombreMatriculaEstudiante)
                        .addGap(18, 18, 18)
                        .addComponent(fieldNombreMatriculaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMatricula)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreMatriculaCurso)
                    .addComponent(fieldNombreMatriculaCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreMatriculaEstudiante)
                    .addComponent(fieldNombreMatriculaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNombreMatriculaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreMatriculaCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreMatriculaCursoActionPerformed

    private void fieldNombreMatriculaEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNombreMatriculaEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNombreMatriculaEstudianteActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fieldNombreMatriculaCurso;
    private javax.swing.JTextField fieldNombreMatriculaEstudiante;
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNombreMatriculaCurso;
    private javax.swing.JLabel labelNombreMatriculaEstudiante;
    // End of variables declaration//GEN-END:variables
}
