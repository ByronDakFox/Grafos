/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Operaciones.Grafo;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jhonatan
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        SpArbol = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVertices = new javax.swing.JTextField();
        btnCrearVertices = new javax.swing.JButton();
        cbxOrigen = new javax.swing.JComboBox<>();
        cbxDestino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarEnlace = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbxDestino2 = new javax.swing.JComboBox<>();
        cbxOrigen2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRecorridoProfundidad = new javax.swing.JButton();
        txtRecProfundidad = new javax.swing.JTextField();
        btnRecorridoAnchura = new javax.swing.JButton();
        txtRecAnchura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("GRAFOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 22, -1, -1));
        getContentPane().add(SpArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 430, 370));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Los Vertices:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));
        jPanel1.add(txtVertices, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 130, -1));

        btnCrearVertices.setText("Crear Vertices");
        btnCrearVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearVerticesActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearVertices, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jPanel1.add(cbxOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jPanel1.add(cbxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jLabel3.setText("Destino:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel4.setText("Origen:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        btnGuardarEnlace.setText("Guardar Enlace");
        btnGuardarEnlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEnlaceActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 480, 120));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("RECORRIDOS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 12, -1, -1));

        jPanel2.add(cbxDestino2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jPanel2.add(cbxOrigen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel6.setText("Origen:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setText("Destino:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        btnRecorridoProfundidad.setText("Recorrido Profundidad");
        btnRecorridoProfundidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorridoProfundidadActionPerformed(evt);
            }
        });
        jPanel2.add(btnRecorridoProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel2.add(txtRecProfundidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, -1));

        btnRecorridoAnchura.setText("Recorrido Anchura");
        btnRecorridoAnchura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecorridoAnchuraActionPerformed(evt);
            }
        });
        jPanel2.add(btnRecorridoAnchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));
        jPanel2.add(txtRecAnchura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 210, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 600, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Grafo nuevografo = new Grafo();
    private void btnCrearVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearVerticesActionPerformed
        String vertices[] = txtVertices.getText().split(",");
        for (String x : vertices) {
            nuevografo.agregarVertices(x);
            cbxOrigen.addItem(x);
            cbxDestino.addItem(x);
            cbxOrigen2.addItem(x);
            cbxDestino2.addItem(x);
        }


    }//GEN-LAST:event_btnCrearVerticesActionPerformed

    private void btnGuardarEnlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEnlaceActionPerformed
        String origen = cbxOrigen.getSelectedItem().toString();
        String destino = cbxDestino.getSelectedItem().toString();
        
        nuevografo.crearEnlances(origen, destino);
    }//GEN-LAST:event_btnGuardarEnlaceActionPerformed

    private void btnRecorridoProfundidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorridoProfundidadActionPerformed
          String origen = cbxOrigen2.getSelectedItem().toString();
        
       txtRecProfundidad.setText(nuevografo.recorridoProfundidad(origen));
    }//GEN-LAST:event_btnRecorridoProfundidadActionPerformed

    private void btnRecorridoAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecorridoAnchuraActionPerformed
      String origen = cbxOrigen2.getSelectedItem().toString();
        
        txtRecAnchura.setText(nuevografo.recorridoAmplitud(origen));
    }//GEN-LAST:event_btnRecorridoAnchuraActionPerformed


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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SpArbol;
    private javax.swing.JButton btnCrearVertices;
    private javax.swing.JButton btnGuardarEnlace;
    private javax.swing.JButton btnRecorridoAnchura;
    private javax.swing.JButton btnRecorridoProfundidad;
    private javax.swing.JComboBox<String> cbxDestino;
    private javax.swing.JComboBox<String> cbxDestino2;
    private javax.swing.JComboBox<String> cbxOrigen;
    private javax.swing.JComboBox<String> cbxOrigen2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtRecAnchura;
    private javax.swing.JTextField txtRecProfundidad;
    private javax.swing.JTextField txtVertices;
    // End of variables declaration//GEN-END:variables
}