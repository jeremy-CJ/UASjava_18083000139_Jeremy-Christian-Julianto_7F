/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uasjava_18083000139_jeremy.christian.julianto_7f;

/**
 *
 * @author USER
 */
public class Kasir extends javax.swing.JFrame {

    /**
     * Creates new form Kasir
     */
    public Kasir() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbnamabarang = new javax.swing.JComboBox<>();
        txtxhargabarang = new javax.swing.JTextField();
        txtjumlahbeli = new javax.swing.JTextField();
        txtjumlahharga = new javax.swing.JTextField();
        txtjumlahbayar = new javax.swing.JTextField();
        txtjumlahkembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jumlah = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NAMA BARANG");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 65, 150, -1));

        jLabel2.setText("HARGA BARANG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 106, 150, -1));

        jLabel3.setText("JUMLAH BELI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 148, 150, -1));

        jLabel4.setText("JUMLAH HARGA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 192, 150, -1));

        jLabel5.setText("JUMLAH BAYAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 239, 150, -1));

        jLabel6.setText("JUMLAH KEMBALI");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 302, 150, -1));

        cbnamabarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH BARANG", "MINYAK GORENG 2 liter", "MINYAK GORENG 1 liter", "GULA 1 KG", "BERAS 5 KG", " " }));
        cbnamabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnamabarangActionPerformed(evt);
            }
        });
        getContentPane().add(cbnamabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 62, -1, -1));
        getContentPane().add(txtxhargabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 139, -1));

        txtjumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahbeliActionPerformed(evt);
            }
        });
        getContentPane().add(txtjumlahbeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 145, 139, -1));
        getContentPane().add(txtjumlahharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 189, 139, -1));
        getContentPane().add(txtjumlahbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 236, 139, -1));
        getContentPane().add(txtjumlahkembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 299, 139, -1));

        jButton1.setText("BATAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 298, -1, -1));

        jButton2.setText("KELUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 298, -1, -1));

        jumlah.setText("JUMLAH");
        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 188, -1, -1));

        jButton5.setText("TOTAL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 298, 77, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setText("APLIKASI KASIR TOKO SEMBAKO ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 18, 452, 33));

        jLabel8.setText("Jeremy Christian Julianto 18083000139 7F");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahbeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahbeliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    txtxhargabarang.setText("");
        txtjumlahbeli.setText("");
        txtjumlahharga.setText("");
        txtjumlahbayar.setText("");
        txtjumlahkembalian.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbnamabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnamabarangActionPerformed
  switch(cbnamabarang.getSelectedIndex())
  {case 1 ->{
    txtxhargabarang.setText(String.valueOf("40000"));
}
    case 2 -> {
  txtxhargabarang.setText(String.valueOf("21000"));
}
         case 3 -> {
  txtxhargabarang.setText(String.valueOf("12500"));
}
         	case 4 -> {
  txtxhargabarang.setText(String.valueOf("58500"));
}        
// TODO add your handling code here:
    }//GEN-LAST:event_cbnamabarangActionPerformed
    }
  
    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
      Double harga,jbeli,hasil;
        harga=Double.parseDouble(txtxhargabarang.getText());
        jbeli=Double.parseDouble(txtjumlahbeli.getText());
        hasil=harga*jbeli;
        txtjumlahharga.setText(String.valueOf(hasil));
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Double jharga,bayar,hasil;
        jharga=Double.parseDouble(txtjumlahharga.getText());
        bayar=Double.parseDouble(txtjumlahbayar.getText());
        hasil=bayar-jharga;
        txtjumlahkembalian.setText(String.valueOf(hasil));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Kasir().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbnamabarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JButton jumlah;
    private javax.swing.JTextField txtjumlahbayar;
    private javax.swing.JTextField txtjumlahbeli;
    private javax.swing.JTextField txtjumlahharga;
    private javax.swing.JTextField txtjumlahkembalian;
    private javax.swing.JTextField txtxhargabarang;
    // End of variables declaration//GEN-END:variables
}
